package events;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Panel extends JPanel {

    private JLabel labelNotice;
    private JLabel labelImageFootball;
    private JLabel labelImageTennis;
    private JLabel labelImageBascketball;
    private JLabel labelImageSwimming;
    private JRadioButton rbFootball;
    private JRadioButton rbTennis;
    private JRadioButton rbBascketball;
    private JRadioButton rbSwimming;
    private ButtonGroup groupSports;

    public Panel() {
        setLayout(null);
        addComponents();
    }

    private void addComponents() {
        addLabels();
        addOptionsScroll();
        addLabels();
        addOptionsScroll();
    }

    private void addLabels() {
        labelNotice = new JLabel("Ingrese su deporte favorito");
        labelNotice.setBounds(20, 20, 200, 30);
        labelNotice.setFont(new Font("Arial", 0, 14));
        this.add(labelNotice);

        labelImageFootball = new JLabel();
        labelImageFootball.setBounds(150, 80, 350, 200);

        labelImageTennis = new JLabel();
        labelImageTennis.setBounds(150, 80, 450, 200);

        labelImageBascketball = new JLabel();
        labelImageBascketball.setBounds(150, 80, 350, 200);

        labelImageSwimming = new JLabel();
        labelImageSwimming.setBounds(150, 80, 350, 200);
    }

    private void addOptionsScroll() {
        rbFootball = new JRadioButton("Fútbol");
        rbFootball.setBounds(20, 60, 100, 30);
        add(rbFootball);

        rbBascketball = new JRadioButton("Baloncesto");
        rbBascketball.setBounds(20, 100, 100, 30);
        add(rbBascketball);

        rbTennis = new JRadioButton("Tenis");
        rbTennis.setBounds(20, 140, 100, 30);
        add(rbTennis);

        rbSwimming = new JRadioButton("Natación");
        rbSwimming.setBounds(20, 180, 100, 30);
        add(rbSwimming);

        groupSports = new ButtonGroup();
        groupSports.add(rbFootball);
        groupSports.add(rbBascketball);
        groupSports.add(rbTennis);
        groupSports.add(rbSwimming);

        addEventsScroll(this);

    }

    private void addEventsScroll(Panel panel) {
        ActionListener eventScrollFootball = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("cc");
                ImageIcon imageFootball = new ImageIcon("images/futbol.jpg");
                labelImageFootball.setIcon(new ImageIcon(imageFootball.getImage().getScaledInstance(labelImageFootball.getWidth(), labelImageFootball.getHeight(), Image.SCALE_SMOOTH)));
                panel.add(labelImageFootball);
            }
        };
        ActionListener eventScrollTennis = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon imageTennis = new ImageIcon("images/tenis.jpg");
                labelImageTennis.setIcon(new ImageIcon(imageTennis.getImage().getScaledInstance(labelImageTennis.getWidth(), labelImageTennis.getHeight(), Image.SCALE_SMOOTH)));
                panel.add(labelImageTennis);
            }
        };

        ActionListener eventScrollSwimming = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon imageSwimming = new ImageIcon("images/natacion");
                labelImageSwimming.setIcon(new ImageIcon(imageSwimming.getImage().getScaledInstance(labelImageSwimming.getWidth(), labelImageSwimming.getHeight(), Image.SCALE_SMOOTH)));
                panel.add(labelImageSwimming);
            }  
        };

        ActionListener eventScrollBascketball = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon imageBascketball = new ImageIcon("images/basquetbol.jpg");
                labelImageBascketball.setIcon(new ImageIcon(imageBascketball.getImage().getScaledInstance(labelImageBascketball.getWidth(), labelImageBascketball.getHeight(), Image.SCALE_SMOOTH)));
                panel.add(labelImageBascketball);
            }
        };

        rbFootball.addActionListener(eventScrollFootball);
        rbTennis.addActionListener(eventScrollTennis);
        rbSwimming.addActionListener(eventScrollSwimming);
        rbBascketball.addActionListener(eventScrollBascketball);
    }
}
