package multiples_fuentes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiplesFuentes {

    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        formulario.setVisible(true);
    }
}

class Formulario extends JFrame {

    public Formulario() {
        setBounds(300, 200, 700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Multiples fuentes para el funcionamiento de eventos de objetos");

        Lamina elementos = new Lamina();
        add(elementos);
    }
}

class Lamina extends JPanel {

    JButton boton1;
    JButton boton2;
    JButton boton3;

    public Lamina() {
        setLayout(null);
        boton1 = new JButton("Amarillo");
        boton2 = new JButton("Negro");
        boton3 = new JButton("Rojo");

        boton1.setBounds(50, 70, 100, 30);
        boton2.setBounds(250, 70, 100, 30);
        boton3.setBounds(450, 70, 100, 30);
        
        
        
        add(boton1);
        add(boton2);
        add(boton3);
    }

    class EventosBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                setBackground(Color.red);
            }
        }

    }
}
