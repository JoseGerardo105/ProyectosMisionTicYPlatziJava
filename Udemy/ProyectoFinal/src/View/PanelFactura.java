package View;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelFactura extends JPanel{
	
	private JLabel lblProductos;
	private JLabel lblIdCliente;
	private JTextField txtEntradaCliente;
	private JTextField txtEntradaProducto;
	private JLabel lblIdProcuto;
	private JLabel lblTotal;
	private JLabel lblTotalSalida;
	
	private JButton btnAgregar;
	private JButton btnCrearFactura;
	
	private JScrollPane jScrollPane;
	private DefaultTableModel modeloTabla;
	private JTable jtablaProductos;
	
	private JScrollPane jScrollPane2;
	private DefaultTableModel modeloTabla2;
	private JTable jtablaFactura;
	

	public PanelFactura() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();		
	}


	private void inicializar() {
		lblProductos= new JLabel("Productos");
		lblIdCliente= new JLabel("Id Cliente");
		lblIdProcuto= new JLabel("Id Producto");
		lblTotal= new JLabel("Total: ");
		lblTotalSalida= new JLabel("-----");
		
		txtEntradaCliente= new JTextField();
		txtEntradaProducto= new JTextField();
		
		
		btnAgregar= new JButton("Agregar");
		btnCrearFactura= new JButton("Crear Factura");
		
		String[] cabecera= {"Producto","Id"};
		modeloTabla= new DefaultTableModel();
		modeloTabla.setColumnIdentifiers(cabecera);
		jtablaProductos= new JTable(modeloTabla);
		jScrollPane= new JScrollPane(jtablaProductos);
		
		
		String[] cabecera2= {"Producto","cantidad"};
		modeloTabla2= new DefaultTableModel();
		modeloTabla2.setColumnIdentifiers(cabecera2);
		jtablaFactura= new JTable(modeloTabla2);
		jScrollPane2= new JScrollPane(jtablaFactura);
		
		
	}
	
	private void caracteristicas() {
		
		lblProductos.setBounds(30, 30, 100, 15);
		jScrollPane.setBounds(30, 55, 400, 100);
		lblIdCliente.setBounds(30, 170, 80, 15);
		txtEntradaCliente.setBounds(100,170, 80,20);
		lblIdProcuto.setBounds(30, 200, 80, 15);
		txtEntradaProducto.setBounds(100, 200, 80, 20);
		
		btnAgregar.setBounds(200, 200, 80, 20);
		jScrollPane2.setBounds(30, 250, 400, 180);
		
		lblTotal.setBounds(30,450,60,15);
		lblTotalSalida.setBounds(80,450,60,15);
		
		btnCrearFactura.setBounds(280, 480, 150, 20);
		
		
		
	}
	
	private void agregar() {
		add(lblProductos);
		add(lblIdCliente);
		add(lblIdProcuto);
		add(lblTotal);
		add(lblTotalSalida);
		
		add(txtEntradaCliente);
		add(txtEntradaProducto);
		
		add(btnAgregar);
		add(btnCrearFactura);
		
		add(jScrollPane);
		add(jScrollPane2);
		
				
	}

	

	
 
	

}
