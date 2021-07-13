package Ejercicios;
import java.util.Scanner;
public class Ejercicio5semana1 {

    
/*Escribe un programa java que lea una variable de tipo entero y asígnale un valor.
A continuación muestra un mensaje indicando si la variable es par o impar.
Utiliza el operador condicional ( ? : ) para resolverlo.
Ej: “14 es par” o “15 es impar”*/

public static void main(String[] args){
        Scanner ve = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int Variable_entera = ve.nextInt();
        String paroimpar = Variable_entera % 2 == 0 ? 
        Variable_entera + " es par" : 
        Variable_entera + " es impar";
        System.out.println(paroimpar);
}}
