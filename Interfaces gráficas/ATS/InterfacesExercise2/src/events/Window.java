package events;

import javax.swing.JFrame;


public class Window extends JFrame{
    private Panel panel;
    
    public Window(){
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Ejercicio 2 ATS");
        panel = new Panel();
        this.add(panel);
    }
}
