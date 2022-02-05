package elementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Elementos extends JFrame {

    public JPanel panel;

    public Elementos() {
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        agregarComponentes();
    }

    private void agregarComponentes() {
        agregarPanel();
        //agregarEtiquetas();
        //agregarBotones();
        //agregarRadioBotones();
        //agregarBotonesDeActivacion();
        //agregarCajasDeTexto();
        //agregarAreasDeTexto();
        //agregarCasillasDeVerificacion();
        //agregarListasDesplegables();
        //agregarCamposDeContraseña();
        //agregarTablas();
        //agregarListas();
    }

    private void agregarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void agregarEtiquetas() {
        //Etiqueta de texto
        JLabel etiqueta1 = new JLabel("Imagen Nike", SwingConstants.CENTER);
        etiqueta1.setBounds(120, 30, 340, 60);
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(Color.DARK_GRAY);
        etiqueta1.setFont(new Font("Arial", 1, 40));
        etiqueta1.setForeground(Color.WHITE);
        panel.add(etiqueta1);

        //Etiqueta de imágen
        ImageIcon imagen = new ImageIcon("nike.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(50, 120, 500, 400);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

        panel.add(etiqueta2);
    }

    private void agregarBotones() {
        //Boton con texto:
        JButton boton1 = new JButton("Click aquí");
        boton1.setBounds(50, 50, 180, 40);
        boton1.setFont(new Font("Times new roman", 1, 20));
        boton1.setForeground(Color.YELLOW);
        boton1.setBackground(Color.BLACK);
        panel.add(boton1);

        //Botón con imágen:
        JButton boton2 = new JButton();
        boton2.setBounds(50, 150, 180, 40);
        ImageIcon imagenBoton = new ImageIcon("boton.png");
        boton2.setIcon(new ImageIcon(imagenBoton.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton2);
    }

    private void agregarRadioBotones() {
        JRadioButton radioBoton1 = new JRadioButton("Opción 1", false);
        radioBoton1.setBounds(40, 40, 100, 30);
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("Opción 2", false);
        radioBoton2.setBounds(40, 80, 100, 30);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("Opción 3", true);
        radioBoton3.setBounds(40, 120, 100, 30);
        panel.add(radioBoton3);

        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(radioBoton1);
        grupoBotones.add(radioBoton2);
        grupoBotones.add(radioBoton3);

    }

    private void agregarBotonesDeActivacion() {
        JToggleButton botonDeActivacion1 = new JToggleButton("Opción 1", true);
        botonDeActivacion1.setBounds(50, 50, 100, 40);
        panel.add(botonDeActivacion1);

        JToggleButton botonDeActivacion2 = new JToggleButton("Opción 2", false);
        botonDeActivacion2.setBounds(50, 100, 100, 40);
        panel.add(botonDeActivacion2);

        JToggleButton botonDeActivacion3 = new JToggleButton("Opción 3", false);
        botonDeActivacion3.setBounds(50, 150, 100, 40);
        panel.add(botonDeActivacion3);

        //Podemos crear un grupo de botones para solo seleccionar una de las opciones
        ButtonGroup grupoBotonesActivacion = new ButtonGroup();
        grupoBotonesActivacion.add(botonDeActivacion1);
        grupoBotonesActivacion.add(botonDeActivacion2);
        grupoBotonesActivacion.add(botonDeActivacion3);
    }

    private void agregarCajasDeTexto() {
        JTextField cajaTexto = new JTextField("Texto por defecto");
        cajaTexto.setBounds(50, 50, 200, 30);
        //Obtener el texto de la caja de texto

        panel.add(cajaTexto);
        System.out.println("El texto que está en la etiqueta es: " + cajaTexto.getText());

    }

    private void agregarAreasDeTexto() {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(30, 30, 200, 100);
        //Poner texto, eliminando lo que haya
        areaTexto.setText("Texto por defecto");
        //Agregar texto sin eliminar lo que haya
        areaTexto.append("Texto agregado");

        panel.add(areaTexto);

        //Agregar barras de desplazamiento
        JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        //barrasDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //barrasDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barrasDesplazamiento.setBounds(30, 30, 200, 100);
        panel.add(barrasDesplazamiento);
    }

    private void agregarCasillasDeVerificacion() {
        JCheckBox casillaDeVerificacion1 = new JCheckBox("Computador", true);
        casillaDeVerificacion1.setBounds(50, 40, 100, 30);
        panel.add(casillaDeVerificacion1);

        JCheckBox casillaDeVerificacion2 = new JCheckBox("Tablet");
        casillaDeVerificacion2.setBounds(50, 70, 100, 30);
        panel.add(casillaDeVerificacion2);

        JCheckBox casillaDeVerificacion3 = new JCheckBox("Celular");
        casillaDeVerificacion3.setBounds(50, 100, 100, 30);
        panel.add(casillaDeVerificacion3);

        JCheckBox casillaDeVerificacion4 = new JCheckBox("Audifonos");
        casillaDeVerificacion4.setBounds(50, 130, 100, 30);
        casillaDeVerificacion4.setEnabled(false);
        panel.add(casillaDeVerificacion4);
    }

    private void agregarListasDesplegables() {
       
        /*
        //Forma básica de agregar elementos en una lista desplegable
        String[] animales = {"Perro", "Caballo", "Paloma", "Burro"};

        //El parámetro es un arreglo de objetos
        JComboBox listaDesplegable = new JComboBox(animales);
        listaDesplegable.setBounds(40, 40, 100, 30);
        listaDesplegable.setBackground(Color.YELLOW);

        //Agregar un elemento más a la lista desplegable
        listaDesplegable.addItem("Elefante");

        //Para no siempre seleccionar la primara de las opciones sino cualquier otra
        listaDesplegable.setSelectedItem("Paloma");

        panel.add(listaDesplegable);*/
        
        //Creación de una lista desplegable teniendo en cuenta uso de modelos, objetos de clases propias
        Persona persona1 = new Persona("Jose Gerardo", 20, "31342892");
        Persona persona2 = new Persona("Maria Lopez",30,"317817143");
        Persona persona3 = new Persona("Jessica Alba",20,"33189813");
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDesplegable = new JComboBox(modelo);
        
        modelo.addElement(persona1);
        modelo.addElement(persona2);
        modelo.addElement(persona3);
        
        listaDesplegable.setBounds(40,40,200,30);
        panel.add(listaDesplegable);
    }
    
    private void agregarCamposDeContraseña(){
        JPasswordField campoContraseña = new JPasswordField();
        campoContraseña.setBounds(40, 40, 100, 30);
        
        //Poner texto por defecto a la contraseña
        campoContraseña.setText("Programación");
        panel.add(campoContraseña);
        
        //Obtener lo que hay dentro del campo de contraseña
        String contraseña = "";
        
        for (Character campos :  campoContraseña.getPassword()) {
            contraseña += campos;
        }
        
        System.out.println("La contraseña es: "+contraseña);
    }
    
    private void agregarTablas(){
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable(modelo);
        tabla.setBounds(20, 20, 300, 200);
        
        //Agregar columnas
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Teléfono");
        
        String[] persona1 = {"Juan","30","39139103"};
        String[] persona2 = {"Juan","30","39139103"};
        String[] persona3 = {"Juan","30","39139103"};
        String[] persona4 = {"Juan","30","39139103"};
        String[] persona5 = {"Juan","30","39139103"};
        String[] persona6 = {"Juan","30","39139103"};
        String[] persona7 = {"Juan","30","39139103"};
        String[] persona8 = {"Juan","30","39139103"};
        String[] persona9 = {"Juan","30","39139103"};
        String[] persona10 = {"Juan","30","39139103"};
        String[] persona11 = {"Juan","30","39139103"};
        
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        modelo.addRow(persona6);
        modelo.addRow(persona7);
        modelo.addRow(persona8);
        modelo.addRow(persona9);
        modelo.addRow(persona10);
        modelo.addRow(persona11);
        modelo.addRow(persona1);
        modelo.addRow(persona1);
        modelo.addRow(persona1);
        modelo.addRow(persona1);
        modelo.addRow(persona1);
        panel.add(tabla);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
        
        
                
    }
    
    private void agregarListas(){
        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addElement(new Persona("Gerardo Gómez", 20, "303103109"));
        modeloLista.addElement(new Persona("Juan Gonsalez",30,"39103183891"));
        modeloLista.addElement(new Persona("Ana Castro",39,"38137131"));
        modeloLista.addElement(new Persona("Gerardo Gómez", 20, "303103109"));
        modeloLista.addElement(new Persona("Juan Gonsalez",30,"39103183891"));
        modeloLista.addElement(new Persona("Ana Castro",39,"38137131"));modeloLista.addElement(new Persona("Gerardo Gómez", 20, "303103109"));
        modeloLista.addElement(new Persona("Juan Gonsalez",30,"39103183891"));
        modeloLista.addElement(new Persona("Ana Castro",39,"38137131"));modeloLista.addElement(new Persona("Gerardo Gómez", 20, "303103109"));
        modeloLista.addElement(new Persona("Juan Gonsalez",30,"39103183891"));
        modeloLista.addElement(new Persona("Ana Castro",39,"38137131"));modeloLista.addElement(new Persona("Gerardo Gómez", 20, "303103109"));
        modeloLista.addElement(new Persona("Juan Gonsalez",30,"39103183891"));
        modeloLista.addElement(new Persona("Ana Castro",39,"38137131"));
        
        JList lista = new JList(modeloLista);
        lista.setBounds(30,30,300,200);
        panel.add(lista);
        
        JScrollPane scrollLista = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollLista.setBounds(30,30,300,200);
        panel.add(scrollLista);
        
    }
}
