package Ejercicios;
import java.util.Scanner;
public class Ejercicio4semana1 {
    public static void main(String[] args){
        Scanner Grados_centigrados = new Scanner(System.in);
        System.out.println("Digite los grados centigrados:");   
        int Grados_cent = Grados_centigrados.nextInt();

        int grados_Fahrenheit = 32+((9*Grados_cent)/5);
        System.out.println("Valor en grados Fahrenheit:" + grados_Fahrenheit);
    }
    
}
