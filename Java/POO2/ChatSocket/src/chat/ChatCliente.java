package chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatCliente {

    String enderecoServidor;
    Scanner entrada;
    PrintWriter saida;
    JFrame tela = new JFrame("Chat");
    JTextField textField = new JTextField(50);
    JTextArea mensagem = new JTextArea(20, 50);

    public ChatCliente(String enderecoServidor) {
        this.enderecoServidor = enderecoServidor;

        textField.setEditable(false);
        mensagem.setEditable(false);
        tela.getContentPane().add(textField, BorderLayout.SOUTH);
        tela.getContentPane().add(new JScrollPane(mensagem), BorderLayout.CENTER);
        tela.pack();

        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saida.println(textField.getText());
                textField.setText("");
            }
        });
        
    }

    private String getName() {
        return JOptionPane.showInputDialog(
            tela,
            "Digite seu nome: ",
            "Nome selecionado",
            JOptionPane.PLAIN_MESSAGE
        );
    }

    private void run() throws IOException {
        try {
            Socket socket = new Socket(enderecoServidor, 59001);
            entrada = new Scanner(socket.getInputStream());
            saida = new PrintWriter(socket.getOutputStream(), true);

            while (entrada.hasNextLine()) {
                String linha = entrada.nextLine();
                if (linha.startsWith("ENVIARNOME")) {
                    saida.println(getName());
                } else if (linha.startsWith("NOMEACEITO")) {
                    this.tela.setTitle("Chat - " + linha.substring(13));
                    textField.setEditable(true);
                } else if (linha.startsWith("MENSAGEM")) {
                    mensagem.append(linha.substring(8) + "\n");
                }
            }
        } finally {
            tela.setVisible(false);
            tela.dispose();
        }
    }

    public static void main(String[] args) throws Exception {
        
        ChatCliente cliente = new ChatCliente("127.0.0.1");
        cliente.tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cliente.tela.setVisible(true);
        cliente.run();
    }
}