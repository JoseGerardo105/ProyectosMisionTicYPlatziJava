package border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame implements ActionListener{
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    
    
    public Window(){
        setLayout(new BorderLayout(30,30));
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BorderLayout");
        initComponents();
    }
    
    private void initComponents(){
        initPanels();
        initButtons();
    }
    
    private void initPanels(){
        panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel2 = new JPanel();
        panel2.setBackground(Color.GRAY);
        panel3 = new JPanel();
        panel3.setBackground(Color.BLACK);
        panel4 = new JPanel();
        panel4.setBackground(Color.BLUE);
        panel5 = new JPanel();
        panel5.setBackground(Color.YELLOW);
        
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.SOUTH);
        this.add(panel3,BorderLayout.EAST);
        this.add(panel4,BorderLayout.WEST);
        this.add(panel5,BorderLayout.CENTER);
    }
    
    private void initButtons(){
        button1 = new JButton("Botón 1");
        button2 = new JButton("Botón 2");
        button3 = new JButton("Botón 3");
        button4 = new JButton("Botón 4");
        button5 = new JButton("Botón 5");
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

        panel1.add(button1);
        panel2.add(button2);
        panel3.add(button3);
        panel4.add(button4);
        panel5.add(button5);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame newWindow = new JFrame();
        newWindow.setSize(200, 200);
        newWindow.setLocationRelativeTo(null);
        newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel labelNewWindow=new JLabel();
        if (e.getSource()==button1) {
            newWindow.setVisible(true);
            labelNewWindow.setText("Ventana zona NORTE");
        } else if (e.getSource()==button2) {
            newWindow.setVisible(true);
            labelNewWindow.setText("Ventana zona SUR");
        }if (e.getSource()==button3) {
            newWindow.setVisible(true);
            labelNewWindow.setText("Ventana zona ESTE");
        }if (e.getSource()==button4) {
            newWindow.setVisible(true);
            labelNewWindow.setText("Ventana zona OESTE");
        }if (e.getSource()==button5) {
            newWindow.setVisible(true);
            labelNewWindow.setText("Ventana zona CENTRO");
        }
        newWindow.add(labelNewWindow);
    }
}
