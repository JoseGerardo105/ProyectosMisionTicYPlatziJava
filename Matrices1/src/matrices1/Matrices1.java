package matrices1;

import domain.Persona;

public class Matrices1 {

    public static void main(String[] args) {

        //El bucle for anidado va ser necesario, debido a que tenemos que iterar primero los renglones "filas"
        //y posteriormente por cada renglon debemos iterar las columnas
        //FORMA 1: sintaxis clásica; creamos primeramente el objeto y posteriormente tendríamos que asignarle
        //valores uno a uno seleccionando el renglón y la colúmna a la cuál hacemos referencia
        int nfilas = 3, ncolumnas = 2;

        int edades[][] = new int[nfilas][ncolumnas];

        int contador = 1;
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                edades[i][j] = contador;
                contador++;
            }
        }

        System.out.println("FORMA 1");
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                System.out.print(edades[i][j] + " ");
            }
            System.out.println("");
        }

        //FORMA 2: Simplificación en el código inicializando directamente los campos de la matriz
        String frutas[][] = {{"mango", "fresa"}, {"Coco", "Banano"}, {"Mora", "Guayaba"}};

        System.out.println("FORMA 2");

        imprimir(frutas);

        //Necesariamente no tiene que ser cuadradas las matrices, sino que podemos agregar cuantas
        //filas queramos en nuestros programas sin la necesidad de que nfilas ncolumnas sea igual
        String verduras[][] = {{"Tallo", "Lechuga", "Zanahoria"}, {"Arracacha", "Coliflor"},
        {"Alberja", "Ava", "Apio"}};

        imprimir(verduras);

        //Debido a que estamos programando la iteración de cada uno de los elementos utilizando los límites
        //la matríz ya sea en renglones o columnas, entonces no tenemos ningún problema al acceder a cada
        //uno de los elementos. Y en ningún momento nos salimos del largo de los elementos de las filas
        //o de las columnas. Si nos salimos de los límites del arreglo se ejecutará una excepción
        //Se recomienda que los nombres de las matrices se escriban en plural, debido a que almacenaremos
        //varios valores en ellas, de igual forma que en un arreglo normal
        //MATRIZ DE OBJETOS: Tipo Persona
        Persona personas[][] = new Persona[3][2];

        personas[0][0] = new Persona("Jose");
        personas[0][1] = new Persona("Daniel");
        personas[1][0] = new Persona("Alex");
        personas[1][1] = new Persona("Andres");
        personas[2][0] = new Persona("Ana");
        personas[2][1] = new Persona("Vito");

        imprimir(personas);
    }
    //Podemos crear un método que nos imprima las características de las matrices de tipo Object para
    //que no exista repeticiones en código al momento de imprimir cada una de las matrices:
    //La clase Object es la clase padre de todas las clases y por tanto podemos hacer referencia a ella
    //cuando trabajamos con clases String o de tipo Object

    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
