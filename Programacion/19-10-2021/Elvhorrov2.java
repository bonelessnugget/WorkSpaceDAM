import javax.swing.*;
import java.awt.*;

public class Elvhorrov2 {
    public static void main(String[] args) {
        // Ajustes de la ventana: título, visibilidad, tamaño...
        JFrame frame = new JFrame();
        JLabel texto = new JLabel();
        texto.setText("El chorro entro a tu casa que haces:");
        frame.add(texto);
        frame.setTitle("El Chorro de verdad"); 
        frame.setVisible(true); 
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Hace que la x funcione como X
        frame.setResizable(false);
        ImageIcon image = new ImageIcon("maquinaDeHacerBujeros.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.black); // en vez de color.black --> new Color(rgb)
        ImageIcon elbicho = new ImageIcon("ElBicho.png");
        texto.setIcon(elbicho);
        texto.setHorizontalTextPosition(JLabel.CENTER);
        texto.setVerticalTextPosition(JLabel.TOP);
        texto.setForeground(Color.GREEN);
        texto.setFont(new Font("Courier New", Font.BOLD, 20));
        texto.setIconTextGap(50);
        JButton b1 = new JButton("asd");
        frame.add(b1);
        
    }
}
