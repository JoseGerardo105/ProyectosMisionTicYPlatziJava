package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelProducto extends JPanel{
	private JLabel lblIdProducto;
	private JLabel lblDescripicion;
	private JLabel lblPrecio;
	private JLabel lblStock;
	private JLabel lblStockMin;
	private JLabel lblIva;
	
	private JTextField txtIdProducto;
	private JTextField txtPrecio;
	private JTextField txtStock;
	private JTextField txtStockMin;
	private JTextField txtIva;
	
	private JTextArea txtDescripcion;
	
	private JButton btnCrearProducto;
	
	private JScrollPane jScrollPane;
	private DefaultTableModel modeloTabla;
	private JTable jtablaProductos;
	
	
	

	public PanelProducto() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}

	private void inicializar() {
		lblIdProducto= new JLabel("Id Producto:");
		lblDescripicion= new JLabel("Descripcion:");
		lblPrecio= new JLabel("Precio:");
		lblStock= new JLabel("Stock:");
		lblStockMin= new JLabel("Stock minimo:");
		lblIva= new JLabel("Iva:");
		
		txtIdProducto= new JTextField();
		txtDescripcion= new JTextArea();
		txtPrecio= new JTextField();
		txtStock= new JTextField();
		txtStockMin= new JTextField();
		txtIva= new JTextField();
		
		btnCrearProducto= new JButton("Agregar Producto");
		
		
		String[] cabecera= {"Id","Producto","Descripcion","Precio","Stock","StockMin","Iva"};
		modeloTabla= new DefaultTableModel();
		modeloTabla.setColumnIdentifiers(cabecera);
		jtablaProductos= new JTable(modeloTabla);
		jScrollPane= new JScrollPane(jtablaProductos);
		
	}

	private void caracteristicas() {
		lblIdProducto.setBounds(30, 30, 100, 15);
		lblDescripicion.setBounds(30,60,100,15);
		lblPrecio.setBounds(30,120,100,15);
		lblStock.setBounds(30,150,100,15);
		lblStockMin.setBounds(30,180,100,15);
		lblIva.setBounds(30,210,100,15);
		
		txtIdProducto.setBounds(110,25,100,20);
		txtDescripcion.setBounds(110,55,100,50);
		txtPrecio.setBounds(110,120,100,20);
		txtStock.setBounds(110,150,100,20);
		txtStockMin.setBounds(130,180,100,20);
		txtIva.setBounds(110,210,100,20);
		btnCrearProducto.setBounds(200,260,180,20);
		
		jScrollPane.setBounds(30, 290, 400, 200);
	}

	private void agregar() {
		add(lblIdProducto);
		add(lblDescripicion);
		add(lblPrecio);
		add(lblStock);
		add(lblStockMin);
		add(lblIva);
		
		add(btnCrearProducto);
		
		add(txtIdProducto);
		add(txtDescripcion);
		add(txtPrecio);
		add(txtStock);
		add(txtStockMin);
		add(txtIva);
		
		add(jScrollPane);
	}
	
	
	

}