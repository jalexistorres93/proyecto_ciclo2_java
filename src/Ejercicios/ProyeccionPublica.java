package Ejercicios;

public class ProyeccionPublica{
    
        private double capital;  
        private double interes; 
        private int tiempo;
    
    public ProyeccionPublica()
    {
        tiempo=0;
        capital=0;
        interes=0;
    }
    public double calcularInteresSimple ()
    {
        double interesSimple =(capital * interes * tiempo);
        return interesSimple;
    }
    public double calcularInteresCompuesto ()
    {    
        double interesCompuesto = capital*((Math.pow((1+interes), tiempo))-1);
        return interesCompuesto;
    }
    public String inversion ( int pTiempo, double pCapital, double pInteres)
    {
        tiempo = pTiempo;
        capital = pCapital;
        interes = pInteres;
        
        double respuesta = (calcularInteresCompuesto() - calcularInteresSimple());
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta;       
}}
    

