package test_matrices;

public class Matrices {

    public static void main(String[] args) {

        //Creación de una matriz [filas][columnas]
        int[][] edades = new int[3][2];

        //Agregación de elementos a nuestra matriz edades
        edades[0][0] = 10;
        edades[0][1] = 11;
        edades[1][0] = 12;
        edades[1][1] = 13;

        //Los elementos que queden vacíos tomaran valores por defecto .. en este caso 0
        //Impresión de los elementos de nuestra matríz
        for (int filas = 0; filas < edades.length; filas++) {
            for (int col = 0; col < edades[filas].length; col++) {
                System.out.println("Edad " + filas + "-" + col + ": " + edades[filas][col]);
            }
        }

        //También podemos usar la sintaxis resumida, inicializando los elementos que contendra la matriz
        String[][] nombres = {{"Juan", "Pepe", "Andres"}, {"Maria", "Camila", "Jessica"}, {"Ana", "Julio", "Estevan"}};
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println("Nombre: " + i + "-" + j + ": " + nombres[i][j]);
            }
        }

        //Creación de una matriz de objetos
        Persona personas[][] = new Persona[3][2];

        personas[0][0] = new Persona("Jose");
        personas[0][1] = new Persona("Juan");
        personas[1][0] = new Persona("Ana");
        personas[1][1] = new Persona("Luis");
        personas[2][0] = new Persona("Pepe");
        personas[2][1] = new Persona("Camilo");

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println(personas[i][j]);
            }
        }

    }
}
