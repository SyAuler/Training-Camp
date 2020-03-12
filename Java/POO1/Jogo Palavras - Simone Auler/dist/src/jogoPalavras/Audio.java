
package jogoPalavras;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Audio {
    
    public class MP3Musica extends Thread {

        private File mp3;
        private Player player;

        public void tocar(File mp3) {
            this.mp3 = mp3;
        }

        public void run() {
            try {
                FileInputStream fis = new FileInputStream(mp3);
                BufferedInputStream bis = new BufferedInputStream(fis);

                this.player = new Player(bis);
                System.out.println("Tocando Musica!");

                this.player.play();
                System.out.println("Terminado Musica!");

            } catch (Exception e) {
                System.out.println("Problema ao tocar Musica" + mp3);
                e.printStackTrace();
            }
        }
    }

    public void play(String path) {
        File f = new File(path);
        if (f.exists() && !f.isDirectory()) {
            File mp3File = new File(path);
            MP3Musica musica = new MP3Musica();
            musica.tocar(mp3File);
            musica.start();
        }
    }
    
    public void getAcertou(){
        play("src\\audio\\acertou-mizeravi.mp3");
    }
    
    public void getErrou(){
        play("src\\audio\\nuncaNemVi.mp3");
    }
}
