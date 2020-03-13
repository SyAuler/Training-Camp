package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ChatServer {

    private static Set<String> nomes = new HashSet<>();

    private static Set<PrintWriter> registro = new HashSet<>();

    public static void main(String[] args) throws Exception {
        System.out.println("O servidor está rodando...");
        ExecutorService pool = Executors.newFixedThreadPool(500);
        try (ServerSocket lista = new ServerSocket(59001)) {
            while (true) {
                pool.execute(new Handler(lista.accept()));
            }
        }
    }

    private static class Handler implements Runnable {
        private String nome;
        private Socket socket;
        private Scanner entrada;
        private PrintWriter saida;

        public Handler(Socket socket) {
            this.socket = socket;
        }
       
        public void run() {
            try {
                entrada = new Scanner(socket.getInputStream());
                saida = new PrintWriter(socket.getOutputStream(), true);

                while (true) {
                    saida.println("ENVIARNOME");
                    nome = entrada.nextLine();
                    if (nome == null) {
                        return;
                    }
                    synchronized (nomes) {
                        if (!nome.isEmpty() && !nomes.contains(nome)) {
                            nomes.add(nome);
                            break;
                        }
                    }
                }

                saida.println("NOMEACEITO " + nome);
                for (PrintWriter writer : registro) {
                    writer.println("MENSAGEM " + nome + " entrou na sala ");
                }
                registro.add(saida);

                while (true) {
                    String input = entrada.nextLine();
                    if (input.toLowerCase().startsWith("/sair")) {
                        return;
                    }
                    for (PrintWriter writer : registro) {
                        writer.println("MENSAGEM " + nome + ": " + input);
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                if (saida != null) {
                    registro.remove(saida);
                }
                if (nome != null) {
                    System.out.println(nome + " está saindo ");
                    nomes.remove(nome);
                    for (PrintWriter writer : registro) {
                        writer.println("MENSAGEM " + nome + " saiu da sala ");
                    }
                }
                try { socket.close(); } catch (IOException e) {}
            }
        }
    }
}
