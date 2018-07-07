package Ejercicios;

public class Ejercicio_4 {

//Realizar un programa que calcule el factorial de un número existente en una determinada variable entera.

    public static void main(String[]args){

        int numerodado=5;

        int factorial = 1;
        for(int i = 1; i<=numerodado;i++){
            factorial *= i;
        }
        System.out.println("El factorial de "+ numerodado +" es: "+factorial);
    }
}
