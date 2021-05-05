package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField OperadorUno;
	private JTextField OperadorDos;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public Calculadora() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		initialize();
	}
	
	private int suma(int a, int b) {
		int resultado = a + b;
		return resultado;
	}
	
	private int resta(int a, int b) {
		int resultado = a - b;
		return resultado;
	}
	
	private int multiplica(int a, int b) {
		int resultado = a * b;
		return resultado;
	}
	
	private int divide(int a, int b) {
		int resultado = a / b;
		return resultado;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		OperadorUno = new JTextField();
		OperadorUno.setBounds(54, 11, 180, 20);
		frame.getContentPane().add(OperadorUno);
		OperadorUno.setColumns(10);
		
		JComboBox cbOperacion = new JComboBox();
		cbOperacion.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una operacion", "Sumar", "Restar", "Multiplicar", "Dividir"}));
		cbOperacion.setBounds(54, 42, 180, 22);
		frame.getContentPane().add(cbOperacion);
		
		OperadorDos = new JTextField();
		OperadorDos.setBounds(54, 75, 180, 20);
		frame.getContentPane().add(OperadorDos);
		OperadorDos.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(54, 140, 180, 20);
		frame.getContentPane().add(lblResultado);
			
		
		
		
		btnNewButton = new JButton("Resolver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*int uno = Integer.parseInt(OperadorUno.getText());
				int resultado = uno * 2;
				String strResultado = String.valueOf(resultado);
				lblResultado.setText(strResultado);
				
				lblResultado.setText(String.valueOf(Integer.parseInt(OperadorUno.getText())*2));*/
				
				String caso = (String) cbOperacion.getSelectedItem();
				switch (caso) {
				case "Sumar":
					int valor1 = Integer.parseInt(OperadorUno.getText());
					int valor2 = Integer.parseInt(OperadorDos.getText());
					lblResultado.setText(String.valueOf(suma(valor1, valor2)));
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + cbOperacion.getSelectedItem());
				}
				
			}
		});
		btnNewButton.setBounds(54, 106, 180, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
