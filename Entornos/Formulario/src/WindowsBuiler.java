import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class WindowsBuiler {

	private JFrame frmFormulario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowsBuiler window = new WindowsBuiler();
					window.frmFormulario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowsBuiler() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormulario = new JFrame();
		frmFormulario.setBackground(Color.LIGHT_GRAY);
		frmFormulario.setForeground(Color.LIGHT_GRAY);
		frmFormulario.setTitle("FORMULARIO ");
		frmFormulario.setBounds(100, 100, 450, 300);
		frmFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormulario.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(123, 11, 146, 14);
		frmFormulario.getContentPane().add(lblNewLabel);
	}
}
