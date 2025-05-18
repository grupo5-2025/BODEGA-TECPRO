package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class guia_remisión extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JTextArea textArea;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			guia_remisión dialog = new guia_remisión();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public guia_remisión() {
		setBounds(100, 100, 670, 662);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("Registro de productos");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(223, 10, 217, 51);
			contentPanel.add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(200, 56, 207, 19);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			lblNewLabel_1 = new JLabel("Fecha de emisión: ");
			lblNewLabel_1.setBounds(188, 88, 122, 13);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(297, 85, 122, 19);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("ID de producto: ");
			lblNewLabel_2.setBounds(10, 130, 98, 13);
			contentPanel.add(lblNewLabel_2);
		}
		{
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(153, 127, 96, 19);
			contentPanel.add(textField_2);
		}
		{
			lblNewLabel_3 = new JLabel("Cantidad de producto:");
			lblNewLabel_3.setBounds(10, 169, 160, 13);
			contentPanel.add(lblNewLabel_3);
		}
		{
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(153, 166, 98, 19);
			contentPanel.add(textField_3);
		}
		{
			lblNewLabel_4 = new JLabel("Cantidad de paquetes: ");
			lblNewLabel_4.setBounds(286, 166, 160, 13);
			contentPanel.add(lblNewLabel_4);
		}
		{
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(427, 163, 98, 19);
			contentPanel.add(textField_4);
		}
		{
			lblNewLabel_5 = new JLabel("ID proveedor: ");
			lblNewLabel_5.setBounds(286, 127, 160, 13);
			contentPanel.add(lblNewLabel_5);
		}
		{
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(413, 124, 112, 19);
			contentPanel.add(textField_5);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 195, 619, 323);
			contentPanel.add(scrollPane);
			{
				textArea = new JTextArea();
				textArea.setEditable(false);
				scrollPane.setViewportView(textArea);
			}
		}
		{
			btnNewButton = new JButton("Ingresar");
			btnNewButton.setBounds(535, 130, 115, 43);
			contentPanel.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Registrar ingreso de stock");
			btnNewButton_1.setBounds(471, 545, 169, 43);
			contentPanel.add(btnNewButton_1);
		}
	}
}
