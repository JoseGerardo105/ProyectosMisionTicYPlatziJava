package Model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Andres Mesa - Nairo Pérez
 */
public class ManagementBilling {
    private Bill bill;
    private Product product;
    
    private ArrayList<Bill> bills;
    private ArrayList<Product> products;
    public ManagementBilling(){
        bills=new ArrayList<>();
        products=new ArrayList<>();
        
    }
    public Product findProduct(String idProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (idProduct.equals(products.get(i).getIdProduct())) {
                return products.get(i);
            }
        }
        return null;
    }
    public Bill findBill(String cod) {
        
        if (bills.size()==0) {
            return null;
        } else {
            for (int i = 0; i < bills.size(); i++) {
                if (cod.equals(bills.get(i).getNumber())) {
                    return bills.get(i);
                }
            }
        }    
        return null;
    }  
    
    public boolean addProducts(String idProduct,String description,double value,short stock,byte stockMin,float iva) {
        product=new Product();
        if (findProduct(idProduct)==null) {
            products.add(new Product(idProduct, description, value, stock, stockMin, iva));
            return true;
        }else{            
            return false;

        }
    }
    //El metodo crea la factura y retorna el codigo  de la factura
    public String addBill() {
        Bill bill = new Bill();
        String code=bill.makeNumber();
        if (findBill(code)==null) {
            bills.add(new Bill());       
            return code;
        }else{
            return "La Factura ya Existe";
        }

        
    }
    public boolean addDetail(String number,String idProduct,short quantity) {
        bill=findBill(number);
        if (bill!=null) {
            product=findProduct(idProduct);
            if (product!=null) {
                return bill.addDetail(product, quantity);
            }else{
                return false;
            }
             
        }else{
            return false;
        }
        
    }
    public ArrayList<Bill> getBills(){
        return (ArrayList<Bill>)bills.clone();
    }
    public ArrayList<Product> getProducts(){
        return (ArrayList<Product>)products.clone();
    }
}