package view;

import javax.swing.*;

public class CalculatorView extends JFrame {

    private JPanel panel;
    private JLabel lblSide;
    private JTextField txtSide;
    private JButton btnCalculate;
    private JLabel lblArea;
    private JLabel lblResult;
    

    public CalculatorView() {
        setSize(300, 100);
        setTitle("Calculo del area de un cuadrado");
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
    }

    public void initComponents() {
        agregarPanel();
        agregarEtiquetas();
        agregarCajasTexto();
        agregarBotones();
    }

    public void agregarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }

    public void agregarEtiquetas() {
        lblSide = new JLabel("Lado");
        panel.add(lblSide);
        lblSide.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        lblArea = new JLabel("Area");
        panel.add(lblArea);
        lblResult = new JLabel();
        panel.add(lblResult);
    }

    public void agregarCajasTexto() {
        
    }

    public void agregarBotones() {

    }
}
