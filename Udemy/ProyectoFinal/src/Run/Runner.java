package Run;

import Controller.ControllBilling;
import View.VentanaPrincipal;
//import View.ViewConsole;

/**
 *
 * @author Andres Mesa - Nairo Pérez
 */
public class Runner {
    public static void main(String[] args) {
        VentanaPrincipal view=new VentanaPrincipal();
        ControllBilling controll=new ControllBilling(view);
        view.setControll(controll);
        view.setVisible(true);
        view.begin();
        
                
    }
}



