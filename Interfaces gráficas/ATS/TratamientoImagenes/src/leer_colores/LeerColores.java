package leer_colores;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class LeerColores {
    public static void main(String[] args) {
        leerColores();
    }
    
    private static void leerColores(){
        try {
            InputStream imagen = new FileInputStream("images/nike.jpg");
            ImageInputStream imagenInput = ImageIO.createImageInputStream(imagen);
            
            BufferedImage bufferImagen = ImageIO.read(imagenInput);
            
            //Obtener el ancho y el alto de la imágen
            int ancho = bufferImagen.getWidth();
            int alto = bufferImagen.getHeight();
            
            //Obtener los colores de cada pixcel de la imágen
            for (int i = 0; i < ancho; i++) {
                for (int j = 0; j < alto; j++) {
                    int colorPixcel = bufferImagen.getRGB(i, j);

                    Color color = new Color(colorPixcel);

                    //Combinaciones correspondientes:
                    int rojo = color.getRed();
                    int verde = color.getGreen();
                    int azul = color.getBlue();
                    
                    System.out.print("("+rojo+", "+verde+", "+azul+") ");
                }
                System.out.println("");
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
    } 
}
