package Ejercicios;

import java.text.NumberFormat;
import java.util.Scanner;

/*Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.*/

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner horas = new Scanner(System.in);
        System.out.println("Numero de horas trabajadas: ");
        int horas_trabajadas =  horas.nextInt();

        int valor_hora = 30000;
        int sueldo = valor_hora * horas_trabajadas; 
            NumberFormat formato_sueldo = NumberFormat.getCurrencyInstance();
        System.out.println("sueldo = " + formato_sueldo.format(sueldo));  
}}
