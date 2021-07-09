import java.util.Scanner;
class Ejercicio5semana1{
    public static String main(String[] args){
/*Escribe un programa java que lea una variable de tipo entero y asígnale un valor.
A continuación muestra un mensaje indicando si la variable es par o impar.
Utiliza el operador condicional ( ? : ) para resolverlo.
Ej: “14 es par” o “15 es impar”*/
        Scanner ve = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int Variable_entera = ve.nextInt();
        String paroimpar = (Variable_entera%2) == 0 ? "es par" : "es impar";
        return paroimpar;
}}
