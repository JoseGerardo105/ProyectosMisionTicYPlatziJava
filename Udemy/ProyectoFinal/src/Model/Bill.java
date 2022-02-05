package Model;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Mesa - Nairo Pérez
 */
public class Bill {
    private String number;
    private Calendar dateBill;
    private ArrayList<Detail> details;
    double assessment;
    double exempt;
    double total;
    private static int num=000000;
    
 
    public Bill(){
        
    }
    public String getNumber() {
        return number;
    }
    public Calendar getDateBill() {
        return dateBill;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setDateBill(Calendar dateBill) {
        this.dateBill = dateBill;
    }
    public boolean addDetail(Product product,short quantity)  {
            if (product.getStockMin()<=product.getStock()-quantity) {
                details.add(new Detail(product,quantity));
                product.setStock((short) (product.getStock()-quantity));
                if (product.getStock()==product.getStockMin()) {
                //throw new ExceptionStock("OJO Comprar "+product.getDescription());
                	JOptionPane.showMessageDialog(null, " CUIDA COMPRA mas de " + product.getDescription());
                }
                return true;
            }
            return false;
    }
        
    public double calcTotal(){
    	for(int i = 0; i<details.size(); i++) {
    		total=+ details.get(i).calSubtotal();
    	}
        return total;
    }
    
    public ArrayList<Detail> getDetail() {
      return (ArrayList<Detail>)details.clone();  
    }
    
    public double calcExempt(){
        for (int i = 0; i < details.size(); i++) {
            exempt=+details.get(i).calcExempt();
        }
        return exempt;
    }
    public double calcAssessment(){   
        for (int i = 0; i < details.size(); i++) {
            assessment=+details.get(i).calcAssessment();
            System.out.println(assessment);
        }
        return assessment;
    }
    
    public String makeNumber(){
        num+=50;
        String number = "#AAA-" +num + "-000" ;
        if(num >= 500) {
        	number = "#BBB-" + num + "-000";
        }
        return number;
    }



    public class Detail {
        Product product; 
        private short quantity;
        
        private Detail(Product product, short quantity) {
            this.product=product;
            this.quantity=quantity;
        }

        public short getQuantity() {
            return quantity;
        }

        public void setQuantity(short quantity) {
            this.quantity = quantity;
        }

        public double calSubtotal(){
        	double sumc = calcAssessment()+calcExempt(); 
            return sumc;
            
        }
        public double calcExempt(){
            return (product.getIva()*product.getValue()/100)*quantity;
            
        }
        public double calcAssessment(){
            return product.getValue()*quantity;
        }
        
        public Product getProduct(){
            return product;
        }  
        

    }
}
