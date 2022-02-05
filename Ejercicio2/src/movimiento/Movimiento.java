/*
Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice
su posición dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA Y DERECHA. Tras cada
movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro
del tablero
 */
package movimiento;

public class Movimiento {

    //Atributos:
    char coordenada;
    private int coordX;
    private int coordY;
    private int sumaX;
    private int sumaY;

    //Métodos:
    public Movimiento(char coordenada) {
        this.coordenada = coordenada;
    }

    public String getTipoMovimiento() {
        if (coordenada == 'A' || coordenada == 'a') {
            return "Movimiento elegido --> izquierda";
        } else if (coordenada == 'D' || coordenada == 'd') {
            return "Movimiento elegido --> derecha";
        } else if (coordenada == 'S' || coordenada == 's') {
            return "Movimiento elegido --> abajo";
        } else if (coordenada == 'W' || coordenada == 'w') {
            return "Movimiento elegido --> arriba";
        } else {
            return "El movimiento ingresado no es válido";
        }
    }

    public void coordenadas(){
        if (coordenada == 'A' || coordenada == 'a') {
            coordX--;
        } else if (coordenada == 'D' || coordenada == 'd') {
            coordY++;
        } else if (coordenada == 'S' || coordenada == 's') {
            coordY--;
        } else if (coordenada == 'W' || coordenada == 'w') {
            coordY++;
        }
    }
    mal
    public void sumaCoordenadas(){
        coordenadas();
        sumaX+=coordX;
        sumaY+=coordY;
    }
    
    public String mostrarDatos(){
        sumaCoordenadas();
        return "X: "+coordX
                +"Y: "+coordY;
    }
}
