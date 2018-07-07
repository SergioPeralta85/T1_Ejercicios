package Ejercicios;

public class Ejercicio_3 {
/*
*Realizar un programa que a partir de un número almacenado en una determinada variable entera,
* que representará la hora del día y por tanto estará́ comprendido entre 1 y 24,
* nos de los buenos días, las buenas tardes o las buenas noches.
 */

    public static void main(String[] args) {
        int Hora=55;
        switch (Hora){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("¿No tienes sueño?");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("¡¡Buenos Dias!!");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Buenas Tardes.");
                break;
            case 21:
            case 22:
            case 23:
            case 0:
                System.out.println("Buenas Noches...");
                break;
                default:
                    System.out.println("La hora introducida no es correcta.");
        }
    }




}
