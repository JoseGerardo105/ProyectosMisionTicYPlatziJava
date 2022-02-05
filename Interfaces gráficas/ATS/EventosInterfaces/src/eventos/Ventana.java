package eventos;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.*;

public class Ventana extends JFrame {

    private JPanel panel;
    private JLabel labelEnter;
    private JTextField textBoxEnter;
    private JButton buttonEnter;
    private JLabel labelGreeting;

    public Ventana() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        addComponents();
    }

    private void addComponents() {
        //addPanels();
        //addLabels();
        //addTextFields();
        //addButtons();
    }

    private void addPanels() {
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }

    private void addLabels() {
        labelEnter = new JLabel("Ingrese su nombre");
        labelEnter.setFont(new Font("cooper black", 1, 20));
        labelEnter.setBounds(30, 30, 200, 50);
        panel.add(labelEnter);

        labelGreeting = new JLabel();
        labelGreeting.setFont(new Font("Arial", 0, 20));
        labelGreeting.setBounds(30, 230, 200, 50);

    }

    private void addTextFields() {
        textBoxEnter = new JTextField();
        textBoxEnter.setBounds(30, 60, 200, 30);
        panel.add(textBoxEnter);
    }

    private void addButtons() {
        buttonEnter = new JButton("¡Pulsa aquí!");
        buttonEnter.setBounds(100, 100, 100, 30);
        panel.add(buttonEnter);
    }

}
