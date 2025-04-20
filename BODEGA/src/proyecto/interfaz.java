package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcode;
	private JTextField txtcantidad;
	private JTextField txtproduc;
	private JTextField txtdni;
	private JTextField txtstockact;
	private JTextField txtstockrest;
	private JTextField txtprecio;
	private JTextField txttotal;
	private JTextField txtprove;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1145, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BODEGA TECPROO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(469, 9, 165, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Código de producto:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 65, 165, 24);
		contentPane.add(lblNewLabel_1);
		
		txtcode = new JTextField();
		txtcode.setBounds(151, 69, 134, 19);
		contentPane.add(txtcode);
		txtcode.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cantidad a adquirir:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(369, 64, 165, 24);
		contentPane.add(lblNewLabel_1_1);
		
		txtcantidad = new JTextField();
		txtcantidad.setColumns(10);
		txtcantidad.setBounds(502, 69, 112, 19);
		contentPane.add(txtcantidad);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setBounds(706, 62, 140, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Producto");
		lblNewLabel_2.setBounds(655, 128, 73, 24);
		contentPane.add(lblNewLabel_2);
		
		txtproduc = new JTextField();
		txtproduc.setBounds(738, 131, 156, 19);
		contentPane.add(txtproduc);
		txtproduc.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ingresar DNI:");
		lblNewLabel_2_1.setBounds(924, 128, 91, 24);
		contentPane.add(lblNewLabel_2_1);
		
		txtdni = new JTextField();
		txtdni.setBounds(1025, 131, 96, 19);
		contentPane.add(txtdni);
		txtdni.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Stock actual:");
		lblNewLabel_2_1_1.setBounds(655, 175, 91, 24);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Stock restante:");
		lblNewLabel_2_1_1_1.setBounds(924, 175, 91, 24);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		txtstockact = new JTextField();
		txtstockact.setColumns(10);
		txtstockact.setBounds(739, 178, 96, 19);
		contentPane.add(txtstockact);
		
		txtstockrest = new JTextField();
		txtstockrest.setColumns(10);
		txtstockrest.setBounds(1025, 178, 96, 19);
		contentPane.add(txtstockrest);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Precio unitario:");
		lblNewLabel_2_1_1_2.setBounds(655, 236, 134, 24);
		contentPane.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Precio total:");
		lblNewLabel_2_1_1_1_1.setBounds(924, 236, 91, 24);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		txtprecio = new JTextField();
		txtprecio.setColumns(10);
		txtprecio.setBounds(739, 239, 96, 19);
		contentPane.add(txtprecio);
		
		txttotal = new JTextField();
		txttotal.setColumns(10);
		txttotal.setBounds(1025, 239, 96, 19);
		contentPane.add(txttotal);
		
		JLabel lblNewLabel_2_2 = new JLabel("Proveedor:");
		lblNewLabel_2_2.setBounds(655, 290, 73, 24);
		contentPane.add(lblNewLabel_2_2);
		
		txtprove = new JTextField();
		txtprove.setColumns(10);
		txtprove.setBounds(738, 293, 156, 19);
		contentPane.add(txtprove);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 105, 584, 315);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
