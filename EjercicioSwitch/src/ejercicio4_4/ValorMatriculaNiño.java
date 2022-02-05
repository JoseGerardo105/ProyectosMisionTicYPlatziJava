/*
En un jardín infantil el cobro de la matrícula depende de la edad del niño, pues esto es lo
que determina en cuál área se asigna y qué materiales utilizará. Los niños de 1 año pagan
un valor de $400.000, los de 2 y 3 años pagan $500.000 y los de 4 años pagan $600.000. 

Sin embargo, si el niño tiene un hermano que también estudia en el jardín se hace un
descuento del 15 %.

Dado el anterior enunciado, escriba las instrucciones Java para determinar el valor que debe
pagar un niño por su matrícula, dada su edad y la información de si tiene o no un hermano
en el jardín.
 */
package ejercicio4_4;

public class ValorMatriculaNiño {
    private int edadNinio;
    private boolean tieneHermano;
    private double valorMatricula;
    private final float VALOR_MINIMO = 400000f;
    private final float VALOR_MEDIO = 500000f;
    private final float VALOR_MAYOR = 600000f;
    private final float DESCUENTO_HERMANO = 0.15f;

    public boolean validacionEdad(String edadNinio){
        try {
            this.edadNinio = Integer.parseInt(edadNinio);
        } catch (Exception NumberFormatException) {
            return false;
        }

        if ((this.edadNinio == 1) || (this.edadNinio == 2) || (this.edadNinio == 3) || (this.edadNinio == 4)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validacionHermano(String tieneHermano){
        if (tieneHermano.equals("1") || tieneHermano.equals("2")) {
            if (tieneHermano.equals("1")) {
                this.tieneHermano = true;
            } else {
                this.tieneHermano = false;
            }
            return true;
        } else {
            return false;
        }
    }
    
    public double valorAPagar(){
        switch (edadNinio){
            case 1:
               valorMatricula = VALOR_MINIMO;
               break;
            case 2, 3:
                valorMatricula = VALOR_MEDIO;
                break;
            case 4:
                valorMatricula = VALOR_MAYOR;
                break;
            default:
                valorMatricula = 0;
        }
        if (this.tieneHermano == true) {
            valorMatricula -= valorMatricula*DESCUENTO_HERMANO;
        }
        return valorMatricula;
    }   
}
