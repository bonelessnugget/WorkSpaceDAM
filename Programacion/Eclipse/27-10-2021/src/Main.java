import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		//frame.setLayout(null);
		frame.setVisible(true);
		JLabel texto = new JLabel("Texto Texto Texto Texto Texto Texto Texto Texto");
		frame.add(texto);
		JLabel texto2 = new JLabel("Texto2 Texto2 Texto2 Texto2 Texto2");
		frame.add(texto2);
		frame.setSize(500,500);
		JButton b1 = new JButton("5");
		frame.add(b1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
