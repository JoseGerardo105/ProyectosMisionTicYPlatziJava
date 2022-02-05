package events;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Panel extends JPanel {

    JLabel labelNotice;
    JButton buttonClick;

    public Panel() {
        setLayout(null);
        addComponents();
    }

    private void addComponents() {
        addLabels();
        addButtons();
        addEventsButtons();
    }

    private void addLabels() {
        labelNotice = new JLabel();
        labelNotice.setBounds(40, 40, 200, 40);
        labelNotice.setFont(new Font("arial", 0, 15));
        this.add(labelNotice);
    }

    private void addButtons() {
        buttonClick = new JButton("Pulsa aquí");
        buttonClick.setFont(new Font("cupper black", 1, 15));
        buttonClick.setBounds(70, 120, 150, 50);
        this.add(buttonClick);
        addEventsButtons();
    }

    private void addEventsButtons() {

        ActionListener event = new ActionListener() {
            int contador = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                if (contador == 1) {
                    labelNotice.setText("Botón pulsado 1 vez.");
                } else {
                    labelNotice.setText("Botón pulsado " + contador + " veces.");

                }

            }
        };
        buttonClick.addActionListener(event);
    }

}
