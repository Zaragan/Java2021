package es.consultaveterinaria.presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import es.consultaveterinaria.accesodatos.DaoMascota;
import es.consultaveterinaria.entidades.Mascota;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class PresentacionSwing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PresentacionSwing window = new PresentacionSwing();
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
	public PresentacionSwing() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Courier New", Font.PLAIN, 11));
		frame.getContentPane().setLayout(null);
		
		JScrollPane spMostrar = new JScrollPane();
		spMostrar.setBounds(10, 430, 614, 170);
		frame.getContentPane().add(spMostrar);
		
		JLabel lblNewLabel = new JLabel("Mostrar lista");
		lblNewLabel.setBounds(41, 11, 92, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(162, 0, 10, 419);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(325, 0, 10, 419);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(487, 0, 10, 419);
		frame.getContentPane().add(separator_2);
		
		JLabel lblMostrar = new JLabel("New label");
		lblNewLabel_1.setBounds(41, 103, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Mascota mascota: DaoMascota.obtenerTodas()) {
				}
			}
		});
		btnNewButton.setBounds(41, 48, 89, 23);
		frame.getContentPane().add(btnNewButton);
		

		

		frame.setBounds(100, 100, 650, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
