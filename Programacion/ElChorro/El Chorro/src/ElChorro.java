import javax.swing.*;
import java.awt.*;
public class ElChorro {
	public static void GUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel texto = new JLabel("El chorro entro en casa que haces:");
		JButton b1 = new JButton("Lo amasijas en la medianera");
		JButton b2 = new JButton("Lo amasijas en el sotano");
		frame.setBorder(BorderFactory.createEmptyBorder(400,400,400,400));
		panel.setLayout(new GridLayout(3,3));
		frame.add(texto);frame.add(b1);frame.add(b2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("El Chorro");
		frame.pack();
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		GUI();
	}

}
