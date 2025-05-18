package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.BreakIterator;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class interfaz extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtcode;
	private JLabel lblNewLabel_1_1;
	private JTextField txtcant;
	private JLabel lblNewLabel_2;
	private JTextField txtprodu;
	private JLabel lblNewLabel_2_1;
	private JTextField txtdni;
	private JLabel lblNewLabel_2_1_1;
	private JLabel lblNewLabel_2_1_1_1;
	private JTextField txtsotckact;
	private JTextField txtstockrest;
	private JLabel lblNewLabel_2_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_1;
	private JTextField txtpreciounitario;
	private JTextField txttotal;
	private JLabel lblNewLabel_2_2;
	private JTextField txtprovee;
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
					txtcode = new JTextField();
					txtcode.setColumns(10);
					txtcode.setBounds(141, 83, 134, 19);
					panel.add(txtcode);
				}
				{
					lblNewLabel_1_1 = new JLabel("Cantidad a adquirir:");
					lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
					lblNewLabel_1_1.setBounds(359, 78, 165, 24);
					panel.add(lblNewLabel_1_1);
				}
				{
					txtcant = new JTextField();
					txtcant.setColumns(10);
					txtcant.setBounds(492, 83, 112, 19);
					panel.add(txtcant);
				}
				{
					lblNewLabel_2 = new JLabel("Producto");
					lblNewLabel_2.setBounds(645, 142, 73, 24);
					panel.add(lblNewLabel_2);
				}
				{
					txtprodu = new JTextField();
					txtprodu.setEditable(false);
					txtprodu.setColumns(10);
					txtprodu.setBounds(728, 145, 156, 19);
					panel.add(txtprodu);
				}
				{
					lblNewLabel_2_1 = new JLabel("Ingresar DNI:");
					lblNewLabel_2_1.setBounds(914, 142, 91, 24);
					panel.add(lblNewLabel_2_1);
				}
				{
					txtdni = new JTextField();
					txtdni.setColumns(10);
					txtdni.setBounds(1015, 145, 96, 19);
					panel.add(txtdni);
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
					txtsotckact = new JTextField();
					txtsotckact.setEditable(false);
					txtsotckact.setColumns(10);
					txtsotckact.setBounds(729, 192, 96, 19);
					panel.add(txtsotckact);
				}
				{
					txtstockrest = new JTextField();
					txtstockrest.setEditable(false);
					txtstockrest.setColumns(10);
					txtstockrest.setBounds(1015, 192, 96, 19);
					panel.add(txtstockrest);
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
					txtpreciounitario = new JTextField();
					txtpreciounitario.setEditable(false);
					txtpreciounitario.setColumns(10);
					txtpreciounitario.setBounds(729, 253, 96, 19);
					panel.add(txtpreciounitario);
				}
				{
					txttotal = new JTextField();
					txttotal.setEditable(false);
					txttotal.setColumns(10);
					txttotal.setBounds(1015, 253, 96, 19);
					panel.add(txttotal);
				}
				{
					lblNewLabel_2_2 = new JLabel("Proveedor:");
					lblNewLabel_2_2.setBounds(645, 304, 73, 24);
					panel.add(lblNewLabel_2_2);
				}
				{
					txtprovee = new JTextField();
					txtprovee.setEditable(false);
					txtprovee.setColumns(10);
					txtprovee.setBounds(728, 307, 156, 19);
					panel.add(txtprovee);
				}
				{
					scrollPane = new JScrollPane();
					scrollPane.setBounds(10, 119, 584, 315);
					panel.add(scrollPane);
					{
						txtS = new JTextArea();
						txtS.setEditable(false);
						scrollPane.setViewportView(txtS);
					}
				}
				{
					btnIngresarDatos = new JButton("Ingresar datos");
					btnIngresarDatos.addActionListener(this);
					btnIngresarDatos.setBounds(971, 295, 140, 33);
					panel.add(btnIngresarDatos);
				}
				{
					btnGenerarBolelta = new JButton("Generar boleta");
					btnGenerarBolelta.addActionListener(this);
					btnGenerarBolelta.setBounds(645, 401, 140, 33);
					panel.add(btnGenerarBolelta);
				}
				{
					btnRegistrar = new JButton("Registrar");  
					btnRegistrar.addActionListener(this);
					btnRegistrar.setBounds(728, 76, 140, 33);
					panel.add(btnRegistrar);
				}
				{
					btnRegistrarNuevoStock = new JButton("Registrar nuevo stock");
					btnRegistrarNuevoStock.addActionListener(this);
					btnRegistrarNuevoStock.setBounds(888, 401, 195, 33);
					panel.add(btnRegistrarNuevoStock);
				}
			}
			{
				panel_1 = new JPanel();
				tabbedPane.addTab("Consulta ", null, panel_1, null);
				panel_1.setLayout(null);
				
				JLabel lblNewLabel_3 = new JLabel("Ingresar código: ");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_3.setBounds(320, 18, 230, 30);
				panel_1.add(lblNewLabel_3);
				
				txtCodconsul = new JTextField();
				txtCodconsul.setBounds(516, 26, 96, 19);
				panel_1.add(txtCodconsul);
				txtCodconsul.setColumns(10);
				
				JButton btnNewButton = new JButton("Consultar");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
				btnNewButton.setBounds(642, 25, 85, 21);
				panel_1.add(btnNewButton);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(27, 75, 1064, 351);
				panel_1.add(scrollPane_1);
				{
					textArea = new JTextArea();
					textArea.setEditable(false);
					scrollPane_1.setViewportView(textArea);
				}
				{
					lblNewLabel_11 = new JLabel("Consultar:");
					lblNewLabel_11.setBounds(27, 35, 101, 13);
					panel_1.add(lblNewLabel_11);
				}
				{
					cbregistrar_nuevo_1 = new JComboBox();
					cbregistrar_nuevo_1.setModel(new DefaultComboBoxModel(new String[] {"Producto", "Proveedor"}));
					cbregistrar_nuevo_1.setBounds(122, 31, 115, 21);
					panel_1.add(cbregistrar_nuevo_1);
				}
			}
			{
				panel_2 = new JPanel();
				tabbedPane.addTab("Registrar", null, panel_2, null);
				panel_2.setLayout(null);
				{
					lblNewLabel_4 = new JLabel("Registrar nuevo: ");
					lblNewLabel_4.setBounds(10, 14, 101, 13);
					panel_2.add(lblNewLabel_4);
				}
				{
					cbregistrar_nuevo = new JComboBox();
					cbregistrar_nuevo.setModel(new DefaultComboBoxModel(new String[] {"Producto", "Proveedor"}));
					cbregistrar_nuevo.setBounds(153, 10, 115, 21);
					panel_2.add(cbregistrar_nuevo);
				}
				{
					lblNewLabel_5 = new JLabel("ID producto");
					lblNewLabel_5.setBounds(24, 48, 161, 13);
					panel_2.add(lblNewLabel_5);
				}
				{
					txtregistrar_id_produ = new JTextField();
					txtregistrar_id_produ.setBounds(10, 71, 96, 19);
					panel_2.add(txtregistrar_id_produ);
					txtregistrar_id_produ.setColumns(10);
				}
				{
					lblNewLabel_6 = new JLabel("Nombre producto");
					lblNewLabel_6.setBounds(195, 48, 161, 13);
					panel_2.add(lblNewLabel_6);
				}
				{
					txtregis_nombre_produ = new JTextField();
					txtregis_nombre_produ.setColumns(10);
					txtregis_nombre_produ.setBounds(176, 71, 130, 19);
					panel_2.add(txtregis_nombre_produ);
				}
				{
					lblNewLabel_7 = new JLabel("Precio producto");
					lblNewLabel_7.setBounds(390, 48, 161, 13);
					panel_2.add(lblNewLabel_7);
				}
				{
					txtregis_precio = new JTextField();
					txtregis_precio.setColumns(10);
					txtregis_precio.setBounds(390, 71, 96, 19);
					panel_2.add(txtregis_precio);
				}
				{
					lblNewLabel_8 = new JLabel("ID proveedor");
					lblNewLabel_8.setBounds(584, 48, 161, 13);
					panel_2.add(lblNewLabel_8);
				}
				{
					txtregis_provee = new JTextField();
					txtregis_provee.setEditable(false);
					txtregis_provee.setColumns(10);
					txtregis_provee.setBounds(570, 71, 96, 19);
					panel_2.add(txtregis_provee);
				}
				{
					lblNewLabel_9 = new JLabel("Nombre proveedor");
					lblNewLabel_9.setBounds(750, 48, 161, 13);
					panel_2.add(lblNewLabel_9);
				}
				{
					txtregis_nombreprovee = new JTextField();
					txtregis_nombreprovee.setEditable(false);
					txtregis_nombreprovee.setColumns(10);
					txtregis_nombreprovee.setBounds(736, 71, 130, 19);
					panel_2.add(txtregis_nombreprovee);
				}
				{
					lblNewLabel_10 = new JLabel("Ruc proveedor");
					lblNewLabel_10.setBounds(935, 48, 161, 13);
					panel_2.add(lblNewLabel_10);
				}
				{
					txtregist_ruc = new JTextField();
					txtregist_ruc.setEditable(false);
					txtregist_ruc.setColumns(10);
					txtregist_ruc.setBounds(921, 71, 107, 19);
					panel_2.add(txtregist_ruc);
				}
				{
					btnNewButton_1 = new JButton("Ingresar datos");
					btnNewButton_1.setBounds(10, 100, 130, 21);
					panel_2.add(btnNewButton_1);
				}
				{
					scrollPane_2 = new JScrollPane();
					scrollPane_2.setBounds(10, 137, 1109, 250);
					panel_2.add(scrollPane_2);
					{
						textArea_1 = new JTextArea();
						textArea_1.setEditable(false);
						scrollPane_2.setViewportView(textArea_1);
					}
				}
				{
					btnNewButton_2 = new JButton("Registrar");
					btnNewButton_2.setBounds(952, 421, 125, 42);
					panel_2.add(btnNewButton_2);
				}
			}
		}
	}
	arreglo tie=new arreglo();
	public int readcode() {
		return Integer.parseInt(txtcode.getText());
	}
	public int cant() {
		return Integer.parseInt(txtcant.getText());
	}
	private JTextArea txtS;
	private JPanel panel_2;
	private JButton btnRegistrarNuevoStock;
	private JLabel lblNewLabel_4;
	private JComboBox cbregistrar_nuevo;
	private JLabel lblNewLabel_5;
	private JTextField txtregistrar_id_produ;
	private JLabel lblNewLabel_6;
	private JTextField txtregis_nombre_produ;
	private JLabel lblNewLabel_7;
	private JTextField txtregis_precio;
	private JLabel lblNewLabel_8;
	private JTextField txtregis_provee;
	private JLabel lblNewLabel_9;
	private JTextField txtregis_nombreprovee;
	private JLabel lblNewLabel_10;
	private JTextField txtregist_ruc;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane_2;
	private JTextArea textArea_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_11;
	private JComboBox cbregistrar_nuevo_1;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrarNuevoStock) {
			do_btnRegistrarNuevoStock_actionPerformed(e);
		}
		if (e.getSource() == btnIngresarDatos) {
			do_btnIngresarDatos_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
		if (e.getSource() == btnGenerarBolelta) {
			do_btnGenerarBolelta_actionPerformed(e);
		}
	}
	protected void do_btnGenerarBolelta_actionPerformed(ActionEvent e) {
		guiboleta bol=new guiboleta();
		bol.setVisible(true);
	}
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		
		if(txtcode.getText().isBlank()||txtcant.getText().isBlank()) 
		{
		JOptionPane.showMessageDialog(this, "Por favor ingresar cantidad y/o código válidos");
	}else {
		clase1 ess=tie.buscar(readcode());
		if(ess!=null) {
			if(ess.getStockactual()<cant()) {
				JOptionPane.showMessageDialog(this, "Stock actual insuficiente");
			}else {
				txtprodu.setText(""+ess.getProducto());
				txtsotckact.setText(""+ess.getStockactual());
				txtpreciounitario.setText(""+ess.getPreciouni());
				txtprovee.setText(""+ess.getProveedor());
				txtstockrest.setText(""+(ess.getStockactual()-cant()));
				txttotal.setText(""+ess.getPreciouni()*cant());
			}
		}else {
			JOptionPane.showMessageDialog(this, "Códio erróneo o inexistente");
		}
		}
	}
	
	protected void do_btnIngresarDatos_actionPerformed(ActionEvent e) {
		clase1 ess=tie.buscar(readcode());
		if(txtprodu.getText().isBlank()) JOptionPane.showMessageDialog(this, "Por favor ingrese código de producto y cantidad a adquirir");
		else 
		{
		try 
		{
			String tam=txtdni.getText();
			if(tam.length()!=8) 
			{
				JOptionPane.showMessageDialog(this, "El número de DNI debe contener 8 dígitos");
				return;
			}
			else {
				int dni=Integer.parseInt(txtdni.getText());
		}
			txtS.setText("");
			imprimir(" Código de producto: "+ess.getCodigo()+"\n");
			imprimir("Producto: "+ess.getProducto()+"\n");
			imprimir("Cantidad adquirida: "+cant()+"\n");
			imprimir("DNI: "+txtdni.getText()+"\n");
			imprimir("Stock: "+ess.getStockactual()+"\n");
			imprimir("Stock restante: "+txtstockrest.getText()+"\n");
			imprimir("Proveedor: "+ess.getProveedor()+"\n");
			imprimir("Precio unitario: "+ess.getPreciouni()+"\n");
			imprimir("Total a pagar: "+txttotal.getText()+"\n");
			imprimir();
			
		}catch(Exception fd) {
			JOptionPane.showMessageDialog(this, "Ingresó dni incorrecto");
		}
		}
		
	}
	public void imprimir() {
		txtS.append("--------------------------------------------------------------");
	}
	public void imprimir(String g) {
		txtS.append(g);
	}
	protected void do_btnRegistrarNuevoStock_actionPerformed(ActionEvent e) {
		guia_remisión bol=new guia_remisión();
		bol.setVisible(true);
	}
}
