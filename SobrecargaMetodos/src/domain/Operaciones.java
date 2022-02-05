package domain;

public class Operaciones {
    //En la sobrecarga de métodos tenemos 2 o mas métodos con el mismo nombre,
    //éstos podemos diferenciarlos según el número y tipo de datos de los atributos
    
    //Parametros de tipo entero
    public static int sumar(int a, int b){
        System.out.println("sumar(int a, int b)");
        return a+b;
    }    
    
    //Parámetros de tipo double, el nombre de estos puede ser el mismo, además el tipo de retorno puede
    //variar si lo deseamos, asi como el modificador de acceso, siempre y cuando el modificador no sea
    //mas restrictivo que el anterior método que hayamos definido.
    public static double sumar(double a, double b){
        System.out.println("sumar(double a, double b)");
        return a+b;
    }
   
    //Hemos creado los métodos de tipo static para no tener que instanciar objetos.
}
