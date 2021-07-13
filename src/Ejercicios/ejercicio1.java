/*Realizar la suma, la resta, la división y la multiplicación de dos números
leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”.*/

package Ejercicios; 
import java.util.Scanner;
class ejercicio1{

    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        System.out.print("ingrese el numero 1: ");
        int numero_1 = num1.nextInt();
        Scanner num2 = new Scanner(System.in); 
        System.out.print("ingrese el numero 2: ");
        int numero_2 = num2.nextInt();
        int suma = numero_1+numero_2;
            System.out.println("La suma de " + numero_1 + " y " + numero_2 + " es igual a " + suma);  
        int resta = numero_1-numero_2;
            System.out.println("La resta de " + numero_1 + " y " + numero_2 + " es igual a " + resta);
        int multiplicacion = numero_1*numero_2;
            System.out.println("La multiplicacion de " + numero_1 + " y " + numero_2 + " es igual a " + multiplicacion);
        int division = numero_1/numero_2;
            System.out.println("La division de " + numero_1 + " y " + numero_2 + " es igual a " + division);
        }
}