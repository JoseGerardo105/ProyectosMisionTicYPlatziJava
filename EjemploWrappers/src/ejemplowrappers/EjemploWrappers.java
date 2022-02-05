package ejemplowrappers;

public class EjemploWrappers {

    public static void main(String[] args) {

        int a = 9;
        double b = 32.12;
        long c = 3422;

        System.out.println("Suma: " + (a + b + c));

        String x = Integer.toString(a);
        String y = Double.toString(b);
        String z = Long.toString(c);

        System.out.println("Concatenación cadena: " + (x + y + z));
        
        
    }

}
