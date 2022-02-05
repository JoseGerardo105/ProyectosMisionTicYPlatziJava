package View;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import GUI.WindowList;

import Controller.ControllBilling;
import Model.Product;





public class VentanaPrincipal extends JFrame implements ActionsView{
	private ControllBilling controll;
	private JTabbedPane jtbPestañas;	
	private PanelFactura panelFactura;
	private PanelProducto panelProducto;
	private PanelUsuario panelCliente;
	
	
	public VentanaPrincipal() {
		this.setSize(500,600);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciar();
		caracteristicas();
		agregar();
	}
	

	private void iniciar() {
		jtbPestañas = new JTabbedPane();		
		panelFactura= new PanelFactura();
		panelProducto= new PanelProducto();
		panelCliente= new PanelUsuario();
	}


	private void caracteristicas() {
		//jtbPestañas.add("Agregar", panelAgregar);
		//jtbPestañas.add("Eliminar", panelEliminar);
		jtbPestañas.add("Productos", panelProducto);
		jtbPestañas.add("Factura", panelFactura);
		jtbPestañas.add("Cliente", panelCliente);
		
		
		
	}


	private void agregar() {
		add(jtbPestañas);
		
		
	}


	 @Override
     public String[] readInput(String option) {
         switch(option){
         	case ActionsView.ADD_CLIENT:return readClient();
             case ActionsView.ADD_PRODUCT:return readProduct();
         }
         return null;
     }


	@Override
	public void writeOutput(String option, boolean status, String... output) {
		   switch(option){
       	case ActionsView.ADD_CLIENT:
       		JOptionPane.showMessageDialog(null,"Cliente agregado "+output[0]);
   		break;
           case ActionsView.ADD_BILL:
              JOptionPane.showMessageDialog(null, "La Factura: "+output[0]+" se creo exitosamente");
               break;
           case ActionsView.ADD_PRODUCT:
               if (status) {
                   JOptionPane.showMessageDialog(null,"El Producto: "+output[1]+" Se agrego");
               }else{
               	JOptionPane.showMessageDialog(null, "El Producto No se pudo agregar");
               }
               break;
       }		
	}


	@Override
	public void listProduct(ArrayList<Product> prod) {
	      for(Product product:prod){
	            WindowList window=new WindowList(prod);            
	            window.setVisible(true);
	            break;
	        }
	        
	    }		
	


	@Override
	public void begin() {
	    String[] options=new String[]{ActionsView.ADD_CLIENT, ActionsView.ADD_BILL,ActionsView.ADD_PRODUCT,
	            ActionsView.ADD_ITEM,ActionsView.QUERY_BILL,ActionsView.LIST_PRODUCTS};
	            while (true) {                
	                String option=(String)JOptionPane.showInputDialog(null,"Digite una opción"
	                ,"MENU PRINCIPAL",JOptionPane.DEFAULT_OPTION,null,options,options[0]);
	                option=option==null?"Salir":option;
	                switch(option){
	                	case ActionsView.ADD_CLIENT:controll.actionPerformed(new ActionEvent(this, 0, ActionsView.ADD_CLIENT));
	                	break;
	                    case ActionsView.ADD_BILL: controll.actionPerformed(new ActionEvent(this, 0, ActionsView.ADD_BILL));
	                    
	                    break;
	                    case ActionsView.ADD_PRODUCT: controll.actionPerformed(new ActionEvent(this, 0, ActionsView.ADD_PRODUCT));
	                    break;
	                    case ActionsView.ADD_ITEM: controll.actionPerformed(new ActionEvent(this, 0, ActionsView.ADD_ITEM));
	                    break;
	                    case ActionsView.QUERY_BILL: controll.actionPerformed(new ActionEvent(this, 0, ActionsView.QUERY_BILL));
	                    break;
	                    case ActionsView.LIST_PRODUCTS: controll.actionPerformed(new ActionEvent(this, 0, ActionsView.LIST_PRODUCTS));
	                    break;
	                    case "Salir":
	                        exit();
	                    break;
	                }
	            }
	            		
	}


	@Override
	public void exit() {
	    int exit =JOptionPane.showConfirmDialog(null,"¿Desea Salir?","SALIR",JOptionPane.YES_NO_OPTION,
	            JOptionPane.QUESTION_MESSAGE);
	            if (exit ==JOptionPane.YES_OPTION) {
	                System.exit(0);
	            }
	        		
	}
	 private String[] readClient() {
     	String name=JOptionPane.showInputDialog("Digite el nombre de usuario");
     	String document=JOptionPane.showInputDialog("Digite el documento de identidad  ");
     	String[] client=new String[] {name,document};
     	return client;
     }
     private String[] readProduct(){
         //validar entradas
         String id=JOptionPane.showInputDialog(null,"Digite un Id para el producto");
         String description=JOptionPane.showInputDialog(null,"Digite descripcion para el producto");
         String value=JOptionPane.showInputDialog(null,"Digite precio del producto");
         String stock=JOptionPane.showInputDialog(null,"Digite cantidad del producto");
         String stockMin=JOptionPane.showInputDialog(null,"Digite cantidad minima del producto");
         int stocki = Integer.parseInt(stock);
         int stockMini = Integer.parseInt(stockMin);
         while(stockMini  > stocki){
         	JOptionPane.showMessageDialog(null, "La Cantidad Mínima debe ser Menor a la Cantidad Disponible");
         	stock=JOptionPane.showInputDialog(null,"Digite cantidad del producto");
             stockMin=JOptionPane.showInputDialog(null,"Digite cantidad minima del producto");
             break;
         }
         String iva=JOptionPane.showInputDialog(null,"Digite iva del producto");
         String[] record=new String[]{id,description,value,stock,stockMin,iva};
         return record;
     }

	@Override
	public void setControll(ControllBilling control) {
		// TODO Auto-generated method stub
		
	}
	
	


}
