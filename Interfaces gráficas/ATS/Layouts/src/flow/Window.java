package flow;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame implements ActionListener{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label1;
    
    public Window(){
        setLayout(new java.awt.FlowLayout());
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("FlowLayout");
    
        button1 = new JButton("Botón 1");
        button2 = new JButton("Botón 2");
        button3 = new JButton("Botón 3");
        button4 = new JButton("Botón 4");
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        
        label1 = new JLabel();
        label1.setFont(new Font("cooper black",1,16));
        this.add(label1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1) {
            label1.setText("Has pulsado el primer botón");
        }
        else if (e.getSource()==button2) {
            label1.setText("Has pulsado el segundo botón");
        }
        if (e.getSource()==button3) {
            label1.setText("Has pulsado el tercer botón");
        }
        if (e.getSource()==button4) {
            label1.setText("Has pulsado el cuarto botón");
        }
    }
}
