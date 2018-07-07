package Ejercicios;

public class Ejercicio_2 {

    /*Realizar un programa que dado un determinado número entero almacenado en una variable
     * nos muestre un mensaje en la consola indicando si el número es par o impar.
      */

    public static void main(String[] args) {
        double numero=4;
        double resto=numero%2;
        if(resto==0){
            System.out.println("El numero es par.");
        }
        else{
            System.out.println("El numero es impar.");
        }
        }
}
