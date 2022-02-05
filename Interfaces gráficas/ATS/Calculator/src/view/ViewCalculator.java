package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.border.Border;

public class ViewCalculator extends JFrame {

    private JTextField textResults;
    private JButton buttonNumber0;
    private JButton buttonNumber1;
    private JButton buttonNumber2;
    private JButton buttonNumber3;
    private JButton buttonNumber4;
    private JButton buttonNumber5;
    private JButton buttonNumber6;
    private JButton buttonNumber7;
    private JButton buttonNumber8;
    private JButton buttonNumber9;
    private JButton buttonSum;
    private JButton buttonSubtraction;
    private JButton buttonMultiplication;
    private JButton buttonDivision;
    private JButton buttonPoint;
    private JButton buttonEqual;
    private JPanel mainPanel;
    private JPanel calculatorPanel;
    private ActionListener actionButtonNumber;
    private ActionListener actionButtonOperations;
    private String textNumber;
    private int result;
    private String ultimateOperation;
    private String textResult="0";
    private String textFinalNumbers="0";
    
    public ViewCalculator() {
        setSize(300, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.GRAY);
        this.setTitle("Calculadora Estandar");
        ImageIcon image = new ImageIcon("data/imagen.png");
        this.setIconImage(image.getImage());
        addComponents();
       // textResults.setText("0");
    }

    private void addComponents() {
        addPanels();
        addTextFields();
        addButtons();
    }

    private void addPanels() {
        //Panel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        this.add(mainPanel);

        //Panel con los botones de la calculadora
        calculatorPanel = new JPanel();
        calculatorPanel.setLayout(new GridLayout(4, 4, 4, 4));
        mainPanel.add(calculatorPanel, BorderLayout.CENTER);
    }

    private void addTextFields() {
        textResults = new JTextField(textFinalNumbers);
        textResults.setFont(new Font("Cooper black", 1, 40));
        textResults.setAlignmentX(CENTER_ALIGNMENT);
        textResults.setBackground(Color.DARK_GRAY);
        textResults.setForeground(Color.WHITE);
        textResults.setBounds(0, 100, 0, 0);
        textResults.setEnabled(false);
        mainPanel.add(textResults, BorderLayout.NORTH);
    }

    private void addButtons() {

        buttonNumber0 = new JButton("0");
        buttonNumber1 = new JButton("1");
        buttonNumber2 = new JButton("2");
        buttonNumber3 = new JButton("3");
        buttonNumber4 = new JButton("4");
        buttonNumber5 = new JButton("5");
        buttonNumber6 = new JButton("6");
        buttonNumber7 = new JButton("7");
        buttonNumber8 = new JButton("8");
        buttonNumber9 = new JButton("9");
        buttonSum = new JButton("+");
        buttonSubtraction = new JButton("-");
        buttonMultiplication = new JButton("*");
        buttonDivision = new JButton("/");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        designButtonsNumbers(buttonNumber0);
        designButtonsNumbers(buttonNumber1);
        designButtonsNumbers(buttonNumber2);
        designButtonsNumbers(buttonNumber3);
        designButtonsNumbers(buttonNumber4);
        designButtonsNumbers(buttonNumber5);
        designButtonsNumbers(buttonNumber6);
        designButtonsNumbers(buttonNumber7);
        designButtonsNumbers(buttonNumber8);
        designButtonsNumbers(buttonNumber9);
        designButtonsNumbers(buttonPoint);
        
        designButtonsOperations(buttonEqual);
        designButtonsOperations(buttonSum);
        designButtonsOperations(buttonSubtraction);
        designButtonsOperations(buttonMultiplication);
        designButtonsOperations(buttonDivision);
        

        calculatorPanel.add(buttonNumber7);
        calculatorPanel.add(buttonNumber8);
        calculatorPanel.add(buttonNumber9);
        calculatorPanel.add(buttonDivision);
        calculatorPanel.add(buttonNumber4);
        calculatorPanel.add(buttonNumber5);
        calculatorPanel.add(buttonNumber6);
        calculatorPanel.add(buttonMultiplication);
        calculatorPanel.add(buttonNumber1);
        calculatorPanel.add(buttonNumber2);
        calculatorPanel.add(buttonNumber3);
        calculatorPanel.add(buttonSubtraction);
        calculatorPanel.add(buttonPoint);
        calculatorPanel.add(buttonNumber0);
        calculatorPanel.add(buttonEqual);
        calculatorPanel.add(buttonSum);
        
        
    }

    private void designButtonsNumbers(JButton button) {
        Font fontButtons = new Font("Arial", 0, 25);
        Color colorBackgroundButtons = new Color(14, 13, 13);
        Color colorBorderButtons = new Color(44, 43, 43);

        button.setFont(fontButtons);
        button.setBackground(colorBackgroundButtons);
        button.setForeground(Color.WHITE);
        button.addActionListener(actionButtonNumber);
        actionButtonsNumbers();
    }
    
    private void designButtonsOperations(JButton button){
        Font fontButtons = new Font("Arial", 0, 25);
        Color colorBackgroundButtons = new Color(14, 13, 13);
        Color colorBorderButtons = new Color(44, 43, 43);

        button.setFont(fontButtons);
        button.setBackground(colorBackgroundButtons);
        button.setForeground(Color.WHITE);
        button.addActionListener(actionButtonOperations);
        actionButtonsOperations(Integer.parseInt(textResults.getText()));
    }

    private void actionButtonsNumbers() {

        actionButtonNumber = new ActionListener() {
            
            
            @Override
            public void actionPerformed(ActionEvent e) {
                textNumber = e.getActionCommand();
                textFinalNumbers=textResults.getText()+textNumber;
                System.out.println(textFinalNumbers);
                textResults.setText(textFinalNumbers);
            }
        };
    }
    
    private void actionButtonsOperations(double x) {

        actionButtonOperations = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("+")) {
                    //Sumar
                    result+=x;
                } else if(e.getActionCommand().equals("-")) {
                    //Restar
                    result-=x;
                }else if(e.getActionCommand().equals("*")) {
                    //Multiplicar
                    result*=x;
                }else if(e.getActionCommand().equals("/")) {
                    //Dividir
                    result/=x;
                }
                textResult=String.valueOf(result);
                System.out.println(textResult);
                textResults.setText(""+result);
            }
        };
    }
    
    
}
