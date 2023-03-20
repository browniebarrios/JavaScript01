
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maru
 */
public class javapractice01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vamos a jugar con los condicionales
    String nombre;
    String mejora;
    int edad;
    int valoracion;
    Scanner leerNom = new Scanner (System.in);
    Scanner leerEdad = new Scanner (System.in);
    System.out.println("Ingrese su nombre");
    nombre = leerNom.next();
    System.out.print("Ingrese su edad");
    edad = leerEdad.nextInt();
    System.out.print("Su nombre es "+nombre+" y su edad es de "+edad+" años");
    System.out.println("");
    if (edad<20) {
        System.out.println("Sos jovencito");}
    else 
        if (edad>20 && edad<45) {
        System.out.println("Te quedan esperanzas de vida manito");
    }
     System.out.println("");
     //Ahora utilizaremos el según
     System.out.println("Ingrese la valoración del 0 al 10 del curso");
     valoracion = leerEdad.nextInt();
     if (valoracion<5 & valoracion > 0)
         System.out.println("Lamentamos que no sea de tu agrado, diganos en que se puede mejorar");
         mejora= leerNom.next();
    if (valoracion>7 & valoracion<11) 
     System.out.println("Nos alegramos que lo estes disfrutando");
    if (valoracion<7 & valoracion>5)
        System.out.println("Agradecemos tu valoración");
    System.out.println("Muchas Gracias");}
}
    
    

