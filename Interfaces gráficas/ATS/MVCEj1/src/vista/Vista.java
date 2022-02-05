package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame{
    private JPanel panel;
    private JTextField cajaNumero1;
    private JTextField cajaNumero2;
    private JTextField cajaResultado;
    private JLabel etiquetaSignoSumar;
    private JButton botonSumar;
    
    
    public Vista(){ 
        crearComponentes();
    }
    
    private void crearComponentes(){
        crearPanel();
        crearCajasDeTexto();
        crearEtiquetas();
        crearBotones();
    }

    public void crearPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void crearCajasDeTexto(){
        cajaNumero1 = new JTextField();
        cajaNumero1.setBounds(20, 50, 70, 30);
        panel.add(cajaNumero1);
     
        cajaNumero2 = new JTextField();
        cajaNumero2.setBounds(120,50,70,30);
        panel.add(cajaNumero2);
        
        cajaResultado = new JTextField();
        cajaResultado.setBounds(300, 50, 70, 30);
        panel.add(cajaResultado);
    }
    
    private void crearEtiquetas(){
        etiquetaSignoSumar = new JLabel("+");
        etiquetaSignoSumar.setBounds(100,50,30,30);
        panel.add(etiquetaSignoSumar);
    }
    
    private void crearBotones(){
        botonSumar = new JButton("Sumar");
        botonSumar.setBounds(205, 55, 80, 20);
        panel.add(botonSumar);
    }


    public JTextField getCajaNumero1() {
        return cajaNumero1;
    }


    public JTextField getCajaNumero2() {
        return cajaNumero2;
    }

    public void setCajaResultado(JTextField cajaResultado) {
        this.cajaResultado = cajaResultado;
    }

    public JButton getBotonSumar() {
        return botonSumar;
    }


}
