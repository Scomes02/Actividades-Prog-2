package agendafinal;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class AGENDAFINAL {

    public static int size(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        
        Connection connection = CONEXION.getConnection();
        
        reproducirMusica("/img/AudioEntrada.wav");
        
        String contra;
        LOGEAR L = new LOGEAR();
        L.setIconImage(new ImageIcon(L.getClass().getResource("/img/ben10.png")).getImage());
        L.setVisible(true);
        L.setLocationRelativeTo(null);
        L.setTitle("Inicio Agenda");
        
        contra = LOGEAR.PASW;
        
    }
    private static void reproducirMusica(String filePath) {
        try (InputStream audioSrc = AGENDAFINAL.class.getResourceAsStream(filePath);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioSrc)) {
            
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    public static boolean ValidarContrasenia(String contra) {        
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^.&+=]).{6,}$";  // Expresión regular para verificar la contraseña
        Pattern pattern = Pattern.compile(regex);  // Compila la expresión regular en un patrón
        Matcher matcher = pattern.matcher(contra); // Crea un matcher para la contraseña dada
        return matcher.find(); // Devuelve verdadero si la contraseña cumple con la expresión regular
    }
}
 