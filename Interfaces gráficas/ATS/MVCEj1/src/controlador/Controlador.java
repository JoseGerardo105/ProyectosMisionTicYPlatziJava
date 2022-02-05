package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener{
    Vista vista;
    Modelo modelo;

    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void iniciar(){
        System.out.println("iniciados");
        vista.setSize(400,300);
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.getBotonSumar().addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNumero1(Integer.parseInt("3"));
        modelo.setNumero2(Integer.parseInt("2"));
        
        modelo.sumar();
        JTextField field=new JTextField();
        field.setText(String.valueOf(modelo.getResultado()));
        vista.setCajaResultado(field);
    }   
}
