import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;

public class Sound {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(200, 200);

        JButton button = new JButton("Click");
        frame.add(button);
        button.addActionListener(new AL());

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void music() {
        try {
            File soundFile = new File("Jungkook.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class AL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            music();
        }
    }
}


