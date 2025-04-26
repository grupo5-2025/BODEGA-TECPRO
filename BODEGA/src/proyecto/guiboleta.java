package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.Panel;


public class guiboleta extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblBoletaDeVenta;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_7;
	private JScrollPane scrollPane_4;
	private JLabel lblNewLabel_8;
	private Panel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			guiboleta dialog = new guiboleta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public guiboleta() {
		setTitle("BOLETA DE VENTA");
		setBounds(100, 100, 353, 439);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(106, 100, 128, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Fecha de Emision:");
			lblNewLabel_2.setBounds(10, 103, 86, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 156, 102, 233);
			contentPanel.add(scrollPane);
			{
				lblNewLabel_4 = new JLabel("Nombre del Producto");
				scrollPane.setColumnHeaderView(lblNewLabel_4);
			}
		}
		{
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setBounds(36, 125, 86, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			lblNewLabel_3 = new JLabel("DNI:");
			lblNewLabel_3.setBounds(10, 128, 46, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(122, 156, 46, 233);
			contentPanel.add(scrollPane_1);
			{
				lblNewLabel_5 = new JLabel("Cantidad");
				scrollPane_1.setColumnHeaderView(lblNewLabel_5);
			}
		}
		{
			scrollPane_3 = new JScrollPane();
			scrollPane_3.setBounds(178, 156, 71, 233);
			contentPanel.add(scrollPane_3);
			{
				lblNewLabel_7 = new JLabel("Precio Unitario");
				scrollPane_3.setColumnHeaderView(lblNewLabel_7);
			}
		}
		{
			scrollPane_4 = new JScrollPane();
			scrollPane_4.setBounds(259, 156, 71, 233);
			contentPanel.add(scrollPane_4);
			{
				lblNewLabel_8 = new JLabel("Importe");
				scrollPane_4.setColumnHeaderView(lblNewLabel_8);
			}
		}
		{
			panel = new Panel();
			panel.setBounds(77, 10, 172, 73);
			contentPanel.add(panel);
			{
				lblNewLabel = new JLabel("BODEGA TECPROO");
				panel.add(lblNewLabel);
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
			}
			{
				lblBoletaDeVenta = new JLabel("BOLETA DE VENTA");
				panel.add(lblBoletaDeVenta);
				lblBoletaDeVenta.setFont(new Font("Times New Roman", Font.BOLD, 15));
			}
			{
				lblNewLabel_1 = new JLabel("001-");
				panel.add(lblNewLabel_1);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			}
			{
				textField = new JTextField();
				panel.add(textField);
				textField.setEditable(false);
				textField.setColumns(10);
			}
		}
	}
}

