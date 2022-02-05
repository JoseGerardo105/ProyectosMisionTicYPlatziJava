package mvcej1_1;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class MVCEj1_1 {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
        vista.setVisible(true);
        controlador.iniciar();
        
    }
    
}
