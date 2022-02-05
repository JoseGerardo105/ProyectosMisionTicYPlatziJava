package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelUsuario extends JPanel{
	private JLabel lblAgregar;
	private JLabel lblEliminar;
	private JLabel lblNombre;
	private JLabel lblId;
	private JLabel lblIdEliminar;
	
	private JTextField txtNombre;
	private JTextField txtId;
	private JTextField txtIdEliminar;
	
	private JButton btnAgregarClientes;
	private JButton btnEliminar;
	
	private JScrollPane jScrollPane;
	private DefaultTableModel modeloTabla;
	private JTable jtablaProductos;
	
	

	public PanelUsuario() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}

	private void inicializar() {
		lblAgregar= new JLabel("Agregar");
		lblEliminar= new JLabel("Eliminar");
		lblNombre= new JLabel("Nombre:");
		lblId= new JLabel("Id:");
		lblIdEliminar= new JLabel("Id:");
		
		txtNombre= new JTextField();
		txtId= new JTextField();
		txtIdEliminar= new JTextField();
		
		btnAgregarClientes= new JButton("Agregar Cliente");
		btnEliminar= new JButton("Eliminar");
		
		String[] cabecera= {"Id","Producto","Descripcion","Precio","Stock","StockMin","Iva"};
		modeloTabla= new DefaultTableModel();
		modeloTabla.setColumnIdentifiers(cabecera);
		jtablaProductos= new JTable(modeloTabla);
		jScrollPane= new JScrollPane(jtablaProductos);
		
	}

	private void caracteristicas() {
		lblAgregar.setBounds(180,10,50,15);
		lblNombre.setBounds(30,30,50,15);
		lblId.setBounds(30,60,50,15);
		
		txtNombre.setBounds(90,30,90,20);
		txtId.setBounds(90,60,90,20);
		
		btnAgregarClientes.setBounds(200,70,140,20);
		
		jScrollPane.setBounds(30,120,400,200);
		
		lblEliminar.setBounds(180,350,50,15);
		
		lblIdEliminar.setBounds(30,390,50,15);
		txtIdEliminar.setBounds(90,390,90,20);
		btnEliminar.setBounds(200,410,140,20);
		
		
		
	}

	private void agregar() {
		add(lblAgregar);
		add(lblEliminar);
		add(lblNombre);
		add(lblId);
		add(lblIdEliminar);	
		
		add(txtNombre);
		add(txtId);
		add(txtIdEliminar);
		
		add(jScrollPane);
		
		add(btnAgregarClientes);
		add(btnEliminar);
		
		
		
	}
	
}
