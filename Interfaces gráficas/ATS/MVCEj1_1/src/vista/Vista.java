package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame{
    
    public JPanel panel;
    public JTextField cajaNumero1;
    public JTextField cajaNumero2;
    public JTextField cajaResultado;
    public JLabel etiquetaSigno;
    public JButton botonSumar;
    public JButton botonRestar;
    public JButton botonMultiplicar;
    public JButton botonDividir;
    private JLabel etiquetaIgual;
    private JLabel etiquetaTipoOperacion;
    private JLabel etiquuetaIngresoNumeros;
    public JLabel etiquetaEstado;
    
    public Vista(){
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        crearPaneles();
        crearEtiquetas();
        crearCajasDeTexto();
        crearBotones();
    }
    
    private void crearPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void crearEtiquetas(){
        Font fuenteEtiquetas = new Font("cooper black",1,20);
        
        etiquuetaIngresoNumeros = new JLabel("Ingrese dos números: ");
        etiquuetaIngresoNumeros.setBounds(30, 30, 300, 30);
        etiquuetaIngresoNumeros.setFont(fuenteEtiquetas);
        panel.add(etiquuetaIngresoNumeros);
        
        etiquetaSigno = new JLabel();
        etiquetaSigno.setBounds(115, 80, 30, 30);
        etiquetaSigno.setFont(fuenteEtiquetas);
        panel.add(etiquetaSigno);
        
        etiquetaIgual = new JLabel("=");
        etiquetaIgual.setBounds(260, 80, 60, 30);
        etiquetaIgual.setFont(fuenteEtiquetas);
        panel.add(etiquetaIgual);
        
        etiquetaTipoOperacion = new JLabel("Seleccione el tipo de operacion: ");
        etiquetaTipoOperacion.setFont(fuenteEtiquetas);
        etiquetaTipoOperacion.setBounds(30, 130, 350, 30);
        panel.add(etiquetaTipoOperacion);
        
        etiquetaEstado = new JLabel();
        etiquetaEstado.setBounds(30,250,300,30);
        etiquetaEstado.setFont(new Font("arial",1,12));
        panel.add(etiquetaEstado);
    }
    
    private void crearCajasDeTexto(){
        cajaNumero1 = new JTextField();
        cajaNumero1.setBounds(30, 80, 70, 30);
        panel.add(cajaNumero1);
        
        cajaNumero2 = new JTextField();
        cajaNumero2.setBounds(150, 80, 70, 30);
        panel.add(cajaNumero2);

        cajaResultado = new JTextField();
        cajaResultado.setBounds(320, 80, 90, 30);
        cajaResultado.setFont(new Font("cooper black",1,13));
        cajaResultado.setForeground(Color.DARK_GRAY);
        cajaResultado.setHorizontalAlignment(JTextField.CENTER);
        panel.add(cajaResultado);

    }
    
    private void crearBotones(){
        Color colorBotones = new Color(30,100,30);
        
        botonSumar = new JButton("Sumar");
        botonSumar.setBounds(50, 180,90, 25);
        botonSumar.setBackground(colorBotones);
        botonSumar.setForeground(Color.WHITE);
        panel.add(botonSumar);
        
        botonRestar = new JButton("Restar");
        botonRestar.setBounds(150, 180, 90, 25);
        botonRestar.setBackground(colorBotones);
        botonRestar.setForeground(Color.WHITE);
        panel.add(botonRestar);
        
        botonMultiplicar = new JButton("Multiplicar");
        botonMultiplicar.setBounds(250, 180, 100, 25);
        botonMultiplicar.setBackground(colorBotones);
        botonMultiplicar.setForeground(Color.WHITE);
        panel.add(botonMultiplicar);
        
        botonDividir = new JButton("Dividir");
        botonDividir.setBounds(360, 180, 90, 25);
        botonDividir.setBackground(colorBotones);
        botonDividir.setForeground(Color.WHITE);
        panel.add(botonDividir);
    }
}
