package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

import Model.Bill;
import Model.ManagementBilling;
import Model.ManagementClient;
import View.ActionsView;

/**
 *
 * @author Andres Mesa - Nairo Pérez
 */
public class ControllBilling implements ActionListener{
    private ActionsView view;
    Bill bill;
    private ManagementBilling mngBill;
    private ManagementClient mangClient;
    public ControllBilling(ActionsView view){
        this.view=view;
        this.mngBill=new ManagementBilling();
        this.mangClient=new ManagementClient();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         switch(e.getActionCommand()){
         	 case ActionsView.ADD_CLIENT:addClient();
         	 break;
             case ActionsView.ADD_BILL:addBill();
             break;
             case ActionsView.ADD_PRODUCT:addProduct();
             break;
             case ActionsView.ADD_ITEM:addItem();
             break;
             case ActionsView.QUERY_BILL:queryBill();
             break;
             case ActionsView.LIST_PRODUCTS:listProducts();
             break;
                     
         }
    }
    private void addClient() {
    	String[] person=view.readInput(ActionsView.ADD_CLIENT);
    	String name = person[0];
    	String documents=person[1];
    	System.out.println("name:"+person[0]+"documents"+person[1]);
    	if(mangClient.addClients(person[0],person[1])) {
    		view.writeOutput(ActionsView.ADD_CLIENT, true,person);
    	}else{
            view.writeOutput(ActionsView.ADD_CLIENT, false, person[0],person[1]);
    	}
    }
    
    private void addBill() {
        String cc = JOptionPane.showInputDialog(null, "Ingrese el Documento del Cliente que comprara");
        if(mangClient.findClient(cc)==null) {
        	JOptionPane.showMessageDialog(null, "Debe Existir el Cliente que desea Comprar");
        }
        else {
        	Calendar dat= Calendar.getInstance();
            String date=dat.getTime().toString();
            String number= mngBill.addBill();
            String[] output=new String[]{number,date};
            view.writeOutput(ActionsView.ADD_BILL, true, output);
        }
    }

    private void addProduct() {
    	try{
    	String[] dates = view.readInput(ActionsView.ADD_PRODUCT);
        System.out.println("Id->"+dates[0]+"\nDescripcion->"+dates[1]);
        double value=Double.parseDouble(dates[2]);
        short stock=Short.parseShort(dates[3]);
        byte stockMin=Byte.parseByte(dates[4]);
        float iva=Float.parseFloat(dates[5]);
        if (mngBill.addProducts(dates[0], dates[1], value, stock, stockMin, iva)) {
            view.writeOutput(ActionsView.ADD_PRODUCT, true, dates[0],dates[1]);
        }else{
            view.writeOutput(ActionsView.ADD_PRODUCT, false, dates[0],dates[1]);
        }
        System.out.println(ActionsView.ADD_PRODUCT);
    	}
    	catch(NullPointerException exception){
    		JOptionPane.showMessageDialog(null, "Debe Rellenar todos los datos del Producto Correctamente");
    	}
    	catch(NumberFormatException exception){
    		JOptionPane.showMessageDialog(null, "Recuerde Ingresar Números donde los exija");
    	}
        
    }

    private void addItem() {
    	try {
    	String cc = JOptionPane.showInputDialog("Ingrese el Documento del Cliente que comprará");
    	if(mangClient.findClient(cc)==null) {
    		JOptionPane.showMessageDialog(null, "Debe Existir el Cliente que desea Comprar");
    	}
    	else {
    		String cod = JOptionPane.showInputDialog("Ingrese la Factura a la Cual desea añadirle productos");
    	if (mngBill.findBill(cod)==null) {
    		JOptionPane.showMessageDialog(null, "Debe existir al menos una Factura");
    	}
    	else{
    		String inp = JOptionPane.showInputDialog(null, "Ingrese el Codigo del Producto que desea Agregar");
    		if(mngBill.findProduct(inp)==null){
    			JOptionPane.showMessageDialog(null, "Debe existir al menos un Producto para ser Agregado");
    		}
    		else{
    			for(int i=0; i<mngBill.getProducts().size(); i++) {
            		String cant = JOptionPane.showInputDialog("¿Que cantidad de ese Producto desea comprar?");
            		Short canti = (Short)Short.parseShort(cant);
            		if(mngBill.addDetail(cod, inp, canti)){
            			JOptionPane.showMessageDialog(null, "La Factura " + cod + " ha recibido " + canti + " del Producto " + inp );
            			System.out.println(ActionsView.ADD_ITEM);
            			break;
            		}
            		else{
            			JOptionPane.showMessageDialog(null, "El Item no pudo ser Agregado a la Compra");
            		}
            	}
    		}
    	}
    	}
    	}
    	catch(NumberFormatException exception) {
    		JOptionPane.showMessageDialog(null, "Debe Ingresar un Valor Correcto");
    	}
    }

    private void queryBill() {
    	try{
    		if(mangClient.getClients().get(0)==null) {
    			JOptionPane.showMessageDialog(null, "Debe Existir al menos algún Cliente");
    		}
    		else {
    			String cc = JOptionPane.showInputDialog("Ingrese el Documento del Cliente");
    			if(mangClient.findClient(cc)!=null) {
    				if(mngBill.getBills().get(0)==null) {
    					JOptionPane.showMessageDialog(null, "Debe existir al menos una Factura");
    				}
    				else {
    					String cod = JOptionPane.showInputDialog("Ingrese Codigo de la Factura: ");
    					if (mngBill.findBill(cod)!=null) {
    						for(int i=0; i<mngBill.getBills().size(); i++) {
    							if(mngBill.getBills().get(i).getNumber().equals(cod)) {
                        			bill = mngBill.getBills().get(i);
                        			String date =  Calendar.getInstance().getTime().toString();
                        			JOptionPane.showMessageDialog(null, "La factura: "+ cod + " Fecha: "+date );
                        			if(bill.getDetail().size()!=0){
                        				for(int j = 0; j<bill.getDetail().size(); j++){
                        					JOptionPane.showMessageDialog(null, "Código = " + mngBill.getBills().get(i).getDetail().get(j).getProduct().getIdProduct()
                        							+ "\n Descripción = " + bill.getDetail().get(j).getProduct().getDescription() 
                        							+ "\n Valor UNIT = " + bill.getDetail().get(j).getProduct().getValue()
                        							+ "\n CANT = " + bill.getDetail().get(j).getQuantity()
                        							+ "\n Subtotal = " + bill.getDetail().get(j).calSubtotal()
                        							+ "\n IVA = " + bill.getDetail().get(j).getProduct().getIva()
                        							+ "\n ");
                        							
                        				}
                        				JOptionPane.showMessageDialog(null, "TOTAL A PAGAR = $" + bill.calcTotal());
                        			}
                        			else{
                        				JOptionPane.showMessageDialog(null, "No hay Detalles en la Factura");
                        			}
                        		}
                        	}
                        }else{
                            JOptionPane.showMessageDialog(null, "La factura Solicitada No fue Encontrada");
                        }
                System.out.println(ActionsView.QUERY_BILL);	
    				}
    		
    			}
    		}
    	}
    	catch(IndexOutOfBoundsException exception){
    		JOptionPane.showMessageDialog(null, "Debe existir por lo menos un Cliente y este debe "
    				+ " \ntener por lo menos una Factura");
		}
    }

    private void listProducts() {
    	try{
    		if(mngBill.getProducts().get(0).equals(null)) {
        	}
        	else {
        		view.listProduct(mngBill.getProducts());
        	}
    	}
    	catch(IndexOutOfBoundsException exception){
    		JOptionPane.showMessageDialog(null, "Deben existir al menos un Productirijillo");
    	}  
    }
    
}