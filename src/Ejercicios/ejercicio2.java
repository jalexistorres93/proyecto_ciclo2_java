/*Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales.*/

package Ejercicios;
import java.util.Scanner;
public class ejercicio2 {
    
    public static void main(String[] args){
       Scanner nombrealm = new Scanner(System.in);
       System.out.println("nombre del alumno: ");
       String nombre_alumno = nombrealm.nextLine();
       Scanner nota1 = new Scanner(System.in);
       System.out.println("nota 1: ");
       float nota_1 = nota1.nextFloat();   
       Scanner nota2 = new Scanner(System.in);
       System.out.println("nota 2: ");
       float nota_2 = nota2.nextFloat();
       Scanner nota3 = new Scanner(System.in);
       System.out.println("nota 3: ");
       float nota_3 = nota3.nextFloat();

    float notas = (nota_1 + nota_2 + nota_3);
    float  promedio = notas/3;
    System.out.println(promedio);

   if (promedio>=3){
       System.out.println("Aprobado");}
   else { 
        System.out.println("Reprobado"); 
   }
}}
