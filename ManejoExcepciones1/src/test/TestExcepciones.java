package test;

public class TestExcepciones {
    public static void main(String[] args) {
        
//        int operacion1 = 10/0;
//        System.out.println("operacion1 = " + operacion1);
        
        int operacion2= 0;
        try{
            operacion2 = 10/0;
        } catch(Exception e){
            e.printStackTrace(System.out);//Se imprime una pila de excepciones ya que podemos tener varias excepciones
        }
        System.out.println("operacion2 = " + operacion2);
    }
}
