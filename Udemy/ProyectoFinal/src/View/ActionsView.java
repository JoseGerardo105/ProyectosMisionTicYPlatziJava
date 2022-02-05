package View;

import Controller.ControllBilling;
import java.util.ArrayList;
import Model.Product;

/**
 *
 * @author Andres Mesa - Nairo Pérez
 */
public interface ActionsView {
	String ADD_CLIENT="Adicionar cliente";
    String ADD_BILL = "Adicionar Factura";
    String ADD_PRODUCT = "Adicionar Producto";
    String ADD_ITEM = "Adicionar Item";
    String QUERY_BILL = "Consultar Factura";
    String LIST_PRODUCTS="Listar productos";
    String [] readInput(String option);
    void writeOutput(String option, boolean status, String ...output);
    void listProduct(ArrayList<Product> prod);
    void setControll(ControllBilling control);
    void begin();
    void exit();

    
}