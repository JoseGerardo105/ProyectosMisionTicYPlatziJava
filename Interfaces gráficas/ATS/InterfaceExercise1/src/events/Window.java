package events;

import javax.swing.JFrame;

public class Window extends JFrame{
    private Panel panel;
    
    public Window(){
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Ejercicio 1 ATS");
        panel = new Panel();
        this.getContentPane().add(panel);
    }
}
