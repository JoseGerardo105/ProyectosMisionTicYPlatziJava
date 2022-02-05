package events;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Window extends JFrame {

    private JPanel panel;
    private JLabel labelEnter;
    private JTextField textBoxEnter;
    private JButton buttonEnter;
    private JLabel labelGreeting;
    private JTextArea textArea;

    public Window() {
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Eventos");
        addComponents();
    }

    private void addComponents() {
        addPanels();
        //addLabels();
        addTextFields();
        addTextAreas();
        //addButtons();
        
    }

    private void addPanels() {
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        //mouseMoved();
        //mouseWheel();
    }

    private void addLabels() {
        labelEnter = new JLabel("Ingrese su nombre");
        labelEnter.setFont(new Font("cooper black", 1, 20));
        labelEnter.setBounds(80, 10, 200, 50);
        panel.add(labelEnter);

        labelGreeting = new JLabel();
        labelGreeting.setFont(new Font("Arial", 0, 20));
        labelGreeting.setBounds(40, 200, 200, 50);
        panel.add(labelGreeting);
    }

    private void addTextFields() {
        textBoxEnter = new JTextField();
        textBoxEnter.setBounds(30, 60, 150, 30);
        panel.add(textBoxEnter);
        keyboardEvents();
    }

    private void addTextAreas() {
        textArea = new JTextArea();
        textArea.setBounds(200, 40, 200, 250);
        panel.add(textArea);

        JScrollPane scrollArea = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollArea.setBounds(200, 40, 200, 250);
        panel.add(scrollArea);
    }

    private void addButtons() {
        buttonEnter = new JButton("¡Pulsa aquí!");
        buttonEnter.setBounds(140, 260, 100, 30);
        panel.add(buttonEnter);

        //action();
        //mouse();
    }

    //Eventos del oyente de acción
    private void action() {
        ActionListener actionButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelGreeting.setText("Hola " + textBoxEnter.getText());
            }
        };
        buttonEnter.addActionListener(actionButton);
    }

    //Eventos del oyente del ratón 
    private void mouse() {
        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //textArea.append("mouseClicked\n");

                //Métodos de los eventos de ratón - MouseEvent
                if (e.isAltDown()) {
                    textArea.append("Alt\n");
                } else if (e.isControlDown()) {
                    textArea.append("Control\n");
                } else if (e.isShiftDown()) {
                    textArea.append("Shift\n");
                } else if (e.isMetaDown()) {
                    textArea.append("Click derecho\n");
                } else {
                    textArea.append("Click izquierdo\n");
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {
                //textArea.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //textArea.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //textArea.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //textArea.append("mouseExited\n");
            }
        };

        buttonEnter.addMouseListener(listener);
    }
    
    //Eventos del movimiento del ratón
    private void mouseMoved(){
        MouseMotionListener moved = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                textArea.append("mouseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                textArea.append("mouseMoved\n");
            }
        };
        panel.addMouseMotionListener(moved);
    }
    
    //Eventos de la rueda del ratón
    private void mouseWheel(){
        MouseWheelListener wheelMovement = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                //textArea.append("Movimiento rueda\n");
            
                //Si queremos ser más específicos en cuanto al movimiento que se presenta
                if (e.getPreciseWheelRotation()==-1) {
                    textArea.append("Rueda hacia arriba\n");
                } else {
                    textArea.append("Rueda hacia abajo\n");
                }
            }
        };
        
        panel.addMouseWheelListener(wheelMovement);
    }
    
    //Eventos del teclado
    private void keyboardEvents(){
        KeyListener events = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                textArea.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                textArea.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                textArea.append("keyReleased\n");
            }
        };
        textBoxEnter.addKeyListener(events);
    }
}
