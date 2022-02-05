package view;

import javax.swing.*;

public class CalculatorView extends JFrame {

    private JLabel lblSide;
    private JTextField txtSide;
    private JButton btnCalculate;
    private JLabel lblArea;
    private JLabel lblResult;
    private JPanel panel;
    
    public static void main(String[] args) {
        //new CalculatorView();
    }
    

    public CalculatorView() {
        super("Calculo del area de un cuadrado");
        //initComponents();
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {
        panel = new JPanel();
        lblSide = new JLabel("Lado: ");
        panel.add(lblSide);
        txtSide = new JTextField(5);
        panel.add(txtSide);
        btnCalculate = new JButton("Calcular area");
        panel.add(btnCalculate);
        lblArea = new JLabel("Area: ");
        panel.add(lblArea);
        lblResult = new JLabel("");
        panel.add(lblResult);
        this.setContentPane(panel);
    }

    
}
