package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {

    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        iniciar();
    }

    public void iniciar() {
        vista.setSize(500, 350);
        vista.setLocationRelativeTo(null);
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setResizable(false);

        vista.botonSumar.addActionListener(this);
        vista.botonRestar.addActionListener(this);
        vista.botonMultiplicar.addActionListener(this);
        vista.botonDividir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Validación de los valores ingresados en cada caja de texto
        if (vista.cajaNumero1.getText().equals("") || vista.cajaNumero2.getText().equals("")) {
            vista.etiquetaEstado.setForeground(Color.red);
            vista.etiquetaEstado.setText("Error, números incorrectos");
        } else {
            char[] contenido1 = vista.cajaNumero1.getText().toCharArray();
            char[] contenido2 = vista.cajaNumero2.getText().toCharArray();
            boolean valoresNumericos = true;

            for (int i = 0; i < contenido1.length; i++) {
                if (!Character.isDigit(contenido1[i])) {
                    valoresNumericos = false;
                    break;
                }
            }

            for (int i = 0; i < contenido2.length; i++) {
                if (!Character.isDigit(contenido2[i])) {
                    valoresNumericos = false;
                    break;
                }
            }

            if (valoresNumericos) {
                vista.etiquetaEstado.setForeground(Color.BLUE);
                modelo.setNumero1(Integer.parseInt(vista.cajaNumero1.getText()));
                modelo.setNumero2(Integer.parseInt(vista.cajaNumero2.getText()));

                //Boton suma
                if (e.getSource() == vista.botonSumar) {
                    vista.etiquetaSigno.setText("+");
                    vista.etiquetaEstado.setText("Suma realizada correctamente");
                    modelo.sumar();
                    vista.cajaResultado.setText(String.valueOf(modelo.getResultadoEntero()));
                } //Botón resta
                else if (e.getSource() == vista.botonRestar) {
                    vista.etiquetaSigno.setText("-");
                    vista.etiquetaEstado.setText("Resta realizada correctamente");
                    modelo.restar();
                    vista.cajaResultado.setText(String.valueOf(modelo.getResultadoEntero()));
                } //Botón multiplicación
                else if (e.getSource() == vista.botonMultiplicar) {
                    vista.etiquetaSigno.setText("*");
                    vista.etiquetaEstado.setText("Multiplicación realizada correctamente");
                    modelo.multiplicar();
                    vista.cajaResultado.setText(String.valueOf(modelo.getResultadoEntero()));
                } //Botón división
                else if (e.getSource() == vista.botonDividir) {
                    vista.etiquetaSigno.setText("/");
                    vista.etiquetaEstado.setText("División realizada correctamente");
                    modelo.dividir();
                    vista.cajaResultado.setText(String.valueOf(modelo.getResultadoReal()));
                }

            } else {
                vista.etiquetaEstado.setForeground(Color.red);
                vista.etiquetaEstado.setText("Los valores ingresados no son números");
            }
        }
    }
}
