package Ejercicios;
import java.util.Scanner;

/*Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos.*/

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner num_usuario = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int NumeroDeUsuario =  num_usuario.nextInt();
        System.out.println("La tabla de multiplicar del 0 al 10 del numero " + NumeroDeUsuario + " es: ");
        
    int ListaDeNumeros [] = {0,1,2,3,4,5,6,7,8,9,10};
    for (int operador : ListaDeNumeros){
        System.out.println(NumeroDeUsuario*operador);
    }
    }
}

