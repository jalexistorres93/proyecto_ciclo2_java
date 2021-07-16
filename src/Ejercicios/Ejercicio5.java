package Ejercicios;

import java.util.Random;
import java.util.Scanner;


/*Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto. Nota: usar la clase
Random para generar el número aleatorio.*/



public class Ejercicio5 {
    public static void main(String[] args){
        int numeroAleatorio = (int)(Math.random()*100+1);
        int usuario;
        Scanner num_usuario = new Scanner(System.in);
        do {
        System.out.print("Ingrese un numero: ");
        usuario =  num_usuario.nextInt();
        if (usuario < numeroAleatorio){
            System.out.println("El número que busca es mayor");
        }
        if (usuario > numeroAleatorio){
            System.out.println("El número que busca es menor");
        }
        }
        while (numeroAleatorio != usuario);  
        }} 
        
   

