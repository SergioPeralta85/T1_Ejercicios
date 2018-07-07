package Ejercicios;

public class Ejercicio_5 {

    /*Realizar un programa que, dado un array de números enteros,
    *calcule la suma de todos los números contenidos en el mismo y la muestre por pantalla.
    *Se empleará una instrucción foreach para realizar el recorrido del array.
    *
     */

    public static void main(String[]args){

        int array[]={1,2,3,4,5,6,7,8,9};
        int resultado=0;
        for(int a : array){
            resultado +=a;
            System.out.println("La suma de los valores es: "+resultado);
        }

    }
}




