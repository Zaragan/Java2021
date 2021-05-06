package es.consultaveterinaria.presentacion;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import es.consultaveterinaria.accesodatos.DaoMascota;
import es.consultaveterinaria.entidades.Mascota;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PresentacionSwing {

	private JFrame frame;
	private JTextField addNmascota;
	private JTextField addFmascota;
	private JTextField delete;
	private JTextField modid;
	private JTextField modNombre;
	private JTextField modFecha;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {

	    JFrame fa = new JFrame();
	    fa.setBounds(100, 100, 400, 200);
	    fa.setVisible(true);
	    fa.addWindowListener(new WindowListener() {

	        @Override
	        public void windowOpened(WindowEvent e) {
	            JOptionPane.showMessageDialog(fa, "windowOpened");
	        }
	
	        @Override
	        public void windowClosing(WindowEvent e) {
	            JOptionPane.showMessageDialog(fa, "windowClosing");
	        }

	        @Override
	        public void windowClosed(WindowEvent e) {
	            JOptionPane.showMessageDialog(fa, "windowClosed");
	        }

	        @Override
	        public void windowIconified(WindowEvent e) {
	            JOptionPane.showMessageDialog(fa, "windowIconified");
	        }

	        @Override
	        public void windowDeiconified(WindowEvent e) {
	            JOptionPane.showMessageDialog(fa, "windowDeiconified");
	        }

	        @Override
	        public void windowActivated(WindowEvent e) {
	        //                JOptionPane.showMessageDialog(fa, "windowActivated");
	        }

	        @Override
	        public void windowDeactivated(WindowEvent e) {
	        //                JOptionPane.showMessageDialog(fa, "windowDeactivated");
	        }
	    });
	}*/
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
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Courier New", Font.PLAIN, 11));
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JTextPane spMostrar = new JTextPane();
		spMostrar.setBounds(10, 11, 614, 170);
		frame.getContentPane().add(spMostrar);
		//		AÑADIR MASCOTAS		------------------------------------------
		JLabel lblNewLabel = new JLabel("A\u00F1adir mascota");
		lblNewLabel.setBounds(67, 192, 88, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 217, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha nacimiento");
		lblNewLabel_2.setBounds(10, 242, 88, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		addNmascota = new JTextField();
		addNmascota.setBounds(115, 214, 86, 20);
		frame.getContentPane().add(addNmascota);
		addNmascota.setColumns(10);
		
		addFmascota = new JTextField();
		addFmascota.setText("AAAA-MM-DD");
		addFmascota.setBounds(115, 239, 86, 20);
		frame.getContentPane().add(addFmascota);
		addFmascota.setColumns(10);
		
		JLabel addRmascota = new JLabel("");
		addRmascota.setBounds(10, 274, 88, 14);
		frame.getContentPane().add(addRmascota);
		
		JButton addBmascota = new JButton("A\u00F1adir");
		addBmascota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = addNmascota.getText();
				String fecha = addFmascota.getText();
				LocalDate localdate = LocalDate.parse(fecha);
				DaoMascota.insertar(new Mascota(null,nombre,localdate));
				addRmascota.setText("Agregada!");
				String s = DaoMascota.obtenerTodas().toString();
				spMostrar.setText(s);
				addNmascota.setText("");
				addFmascota.setText("");
				
			}
		});
		addBmascota.setBounds(113, 265, 88, 23);
		frame.getContentPane().add(addBmascota);
		//			BORRAR MASCOTAS				----------------------------------
		JLabel lblNewLabel_3 = new JLabel("Borrar mascota");
		lblNewLabel_3.setBounds(67, 325, 88, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Introduce ID");
		lblNewLabel_4.setBounds(10, 352, 88, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		delete = new JTextField();
		delete.setBounds(115, 349, 86, 20);
		frame.getContentPane().add(delete);
		delete.setColumns(10);
		
		JButton deleteButton = new JButton("Borrar");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.valueOf(delete.getText());
				DaoMascota.borrar(id);
				String s = DaoMascota.obtenerTodas().toString();
				spMostrar.setText(s);
				delete.setText("");
			}
		});
		deleteButton.setBounds(115, 380, 89, 23);
		frame.getContentPane().add(deleteButton);
		//			MODIFICAR MASCOTAS		----------------------------------------------
		JLabel lblNewLabel_5 = new JLabel("Modificar mascota");
		lblNewLabel_5.setBounds(290, 192, 88, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Inserta ID");
		lblNewLabel_6.setBounds(258, 217, 74, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		modid = new JTextField();
		modid.setBounds(351, 214, 86, 20);
		frame.getContentPane().add(modid);
		modid.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Nombre");
		lblNewLabel_7.setBounds(258, 242, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Fecha nacimiento");
		lblNewLabel_8.setBounds(258, 269, 88, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		modNombre = new JTextField();
		modNombre.setBounds(351, 239, 86, 20);
		frame.getContentPane().add(modNombre);
		modNombre.setColumns(10);
		
		modFecha = new JTextField();
		modFecha.setBounds(351, 266, 86, 20);
		frame.getContentPane().add(modFecha);
		modFecha.setColumns(10);
		
		JButton modGet = new JButton("Obtener");
		modGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(modid.getText());
				Mascota s = DaoMascota.obtenerPorId(id);
				String nombre = s.getNombre();
				LocalDate localdate = s.getFechaNacimiento();
				String fecha = String.valueOf(localdate);
				modNombre.setText(nombre);
				modFecha.setText(fecha);
			}
		});
		modGet.setBounds(447, 213, 89, 23);
		frame.getContentPane().add(modGet);
		
		JButton modSet = new JButton("Guardar");
		modSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(modid.getText());
				String nombre = modNombre.getText();
				String fecha = modFecha.getText();
				LocalDate localdate = LocalDate.parse(fecha);
				DaoMascota.modificar(new Mascota(id,nombre,localdate));
				String s = DaoMascota.obtenerTodas().toString();
				spMostrar.setText(s);
				modid.setText("");
				modNombre.setText("");
				modFecha.setText("");
			}
		});
		modSet.setBounds(351, 294, 89, 23);
		frame.getContentPane().add(modSet);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 401, 614, 83);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				String s = DaoMascota.obtenerTodas().toString();
				spMostrar.setText(s);
			}
			@Override
			public void windowClosing(WindowEvent e) {}
			@Override
			public void windowClosed(WindowEvent e) {}
			@Override
			public void windowIconified(WindowEvent e) {}
			@Override
			public void windowDeiconified(WindowEvent e) {}
			@Override
			public void windowActivated(WindowEvent e) {}
			@Override
			public void windowDeactivated(WindowEvent e) {}
		});
		
		

		

		frame.setBounds(100, 100, 650, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
