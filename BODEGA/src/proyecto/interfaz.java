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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class interfaz extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_2_1;
	private JTextField textField_3;
	private JLabel lblNewLabel_2_1_1;
	private JLabel lblNewLabel_2_1_1_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_2_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblNewLabel_2_2;
	private JTextField textField_8;
	private JScrollPane scrollPane;
	private JButton btnIngresarDatos;
	private JButton btnGenerarBolelta;
	private JButton btnRegistrar;
	private JTextField txtCodconsul;
	private JTextArea textArea;

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
		setBounds(100, 100, 1168, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(10, 10, 1134, 516);
			contentPane.add(tabbedPane);
			{
				panel = new JPanel();
				tabbedPane.addTab("Ventas", null, panel, null);
				panel.setLayout(null);
				{
					lblNewLabel = new JLabel("BODEGA TECPROO");
					lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
					lblNewLabel.setBounds(459, 23, 165, 45);
					panel.add(lblNewLabel);
				}
				{
					lblNewLabel_1 = new JLabel("Código de producto:");
					lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
					lblNewLabel_1.setBounds(10, 79, 165, 24);
					panel.add(lblNewLabel_1);
				}
				{
					textField = new JTextField();
					textField.setColumns(10);
					textField.setBounds(141, 83, 134, 19);
					panel.add(textField);
				}
				{
					lblNewLabel_1_1 = new JLabel("Cantidad a adquirir:");
					lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
					lblNewLabel_1_1.setBounds(359, 78, 165, 24);
					panel.add(lblNewLabel_1_1);
				}
				{
					textField_1 = new JTextField();
					textField_1.setColumns(10);
					textField_1.setBounds(492, 83, 112, 19);
					panel.add(textField_1);
				}
				{
					lblNewLabel_2 = new JLabel("Producto");
					lblNewLabel_2.setBounds(645, 142, 73, 24);
					panel.add(lblNewLabel_2);
				}
				{
					textField_2 = new JTextField();
					textField_2.setEditable(false);
					textField_2.setColumns(10);
					textField_2.setBounds(728, 145, 156, 19);
					panel.add(textField_2);
				}
				{
					lblNewLabel_2_1 = new JLabel("Ingresar DNI:");
					lblNewLabel_2_1.setBounds(914, 142, 91, 24);
					panel.add(lblNewLabel_2_1);
				}
				{
					textField_3 = new JTextField();
					textField_3.setColumns(10);
					textField_3.setBounds(1015, 145, 96, 19);
					panel.add(textField_3);
				}
				{
					lblNewLabel_2_1_1 = new JLabel("Stock actual:");
					lblNewLabel_2_1_1.setBounds(645, 189, 91, 24);
					panel.add(lblNewLabel_2_1_1);
				}
				{
					lblNewLabel_2_1_1_1 = new JLabel("Stock restante:");
					lblNewLabel_2_1_1_1.setBounds(914, 189, 91, 24);
					panel.add(lblNewLabel_2_1_1_1);
				}
				{
					textField_4 = new JTextField();
					textField_4.setColumns(10);
					textField_4.setBounds(729, 192, 96, 19);
					panel.add(textField_4);
				}
				{
					textField_5 = new JTextField();
					textField_5.setColumns(10);
					textField_5.setBounds(1015, 192, 96, 19);
					panel.add(textField_5);
				}
				{
					lblNewLabel_2_1_1_2 = new JLabel("Precio unitario:");
					lblNewLabel_2_1_1_2.setBounds(645, 250, 134, 24);
					panel.add(lblNewLabel_2_1_1_2);
				}
				{
					lblNewLabel_2_1_1_1_1 = new JLabel("Precio total:");
					lblNewLabel_2_1_1_1_1.setBounds(914, 250, 91, 24);
					panel.add(lblNewLabel_2_1_1_1_1);
				}
				{
					textField_6 = new JTextField();
					textField_6.setColumns(10);
					textField_6.setBounds(729, 253, 96, 19);
					panel.add(textField_6);
				}
				{
					textField_7 = new JTextField();
					textField_7.setColumns(10);
					textField_7.setBounds(1015, 253, 96, 19);
					panel.add(textField_7);
				}
				{
					lblNewLabel_2_2 = new JLabel("Proveedor:");
					lblNewLabel_2_2.setBounds(645, 304, 73, 24);
					panel.add(lblNewLabel_2_2);
				}
				{
					textField_8 = new JTextField();
					textField_8.setColumns(10);
					textField_8.setBounds(728, 307, 156, 19);
					panel.add(textField_8);
				}
				{
					scrollPane = new JScrollPane();
					scrollPane.setBounds(10, 119, 584, 315);
					panel.add(scrollPane);
				}
				{
					btnIngresarDatos = new JButton("Ingresar datos");
					btnIngresarDatos.setBounds(971, 295, 140, 33);
					panel.add(btnIngresarDatos);
				}
				{
					btnGenerarBolelta = new JButton("Generar boleta");
					btnGenerarBolelta.setBounds(645, 401, 140, 33);
					panel.add(btnGenerarBolelta);
				}
				{
					btnRegistrar = new JButton("Registrar");
					btnRegistrar.setBounds(728, 76, 140, 33);
					panel.add(btnRegistrar);
				}
			}
			{
				panel_2 = new JPanel();
				tabbedPane.addTab("Proveedores", null, panel_2, null);
				panel_2.setLayout(null);
			}
			{
				panel_1 = new JPanel();
				tabbedPane.addTab("Consulta ", null, panel_1, null);
				panel_1.setLayout(null);
				
				JLabel lblNewLabel_3 = new JLabel("Ingresar código de producto : ");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3.setBounds(27, 27, 230, 30);
				panel_1.add(lblNewLabel_3);
				
				txtCodconsul = new JTextField();
				txtCodconsul.setBounds(223, 35, 96, 19);
				panel_1.add(txtCodconsul);
				txtCodconsul.setColumns(10);
				
				JButton btnNewButton = new JButton("Consultar");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
				btnNewButton.setBounds(349, 34, 85, 21);
				panel_1.add(btnNewButton);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(27, 75, 414, 351);
				panel_1.add(scrollPane_1);
				{
					textArea = new JTextArea();
					scrollPane_1.setViewportView(textArea);
				}
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
	}
}
