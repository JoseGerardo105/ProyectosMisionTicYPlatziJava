package grid;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame implements ActionListener{
    private JPanel panel1;
    private JButton buttonYellow;
    private JButton buttonRed;
    private JButton buttonGreen;
    private JButton buttonBlue;
    private JButton buttonOrange;
    private JLabel labelColorSelected;
    
    public Frame(){
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents(){
        addPanels();
        addButtons();
        addLabels();
    }
    
    private void addPanels(){
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,3));
        this.add(panel1);
    }
    
    private void addLabels(){
        labelColorSelected = new JLabel();
        labelColorSelected.setFont(new Font("Arial",1,18));
        labelColorSelected.setForeground(Color.WHITE);
        panel1.add(labelColorSelected);
    }
    
    private void addButtons(){
        buttonYellow = new JButton("Amarillo");
        panel1.add(buttonYellow);
        buttonGreen = new JButton("Verde");
        panel1.add(buttonGreen);
        buttonBlue = new JButton("Azul");
        panel1.add(buttonBlue);
        buttonOrange = new JButton("Naranja");
        panel1.add(buttonOrange);
        buttonRed = new JButton("Rojo");
        panel1.add(buttonRed);
        
        buttonYellow.addActionListener(this);
        buttonGreen.addActionListener(this);
        buttonBlue.addActionListener(this);
        buttonOrange.addActionListener(this);
        buttonRed.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      
        if (e.getSource()==buttonYellow) {
            panel1.setBackground(Color.YELLOW);

            labelColorSelected.setText("Amarillo");
        } if (e.getSource()==buttonBlue) {
            panel1.setBackground(Color.BLUE);
            labelColorSelected.setText("Azul");
        }
        if (e.getSource()==buttonGreen) {
            panel1.setBackground(Color.GREEN);
            
            labelColorSelected.setText("Verde");
        }
        if (e.getSource()==buttonRed) {
            panel1.setBackground(Color.RED);
            labelColorSelected.setText("Rojo");
        }
        if (e.getSource()==buttonOrange) {
            panel1.setBackground(Color.ORANGE);
            labelColorSelected.setText("Naranja");
        }
    }
}
