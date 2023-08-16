
package minicalculadora;

import java.util.Scanner;

public class MiniCalculadora {

    
    public static void main(String[] args) {
       Scanner objetol=new Scanner (System.in); 
       System.out.print ("ingrese numero 1: "); 
       int num= objetol.nextInt (); 
       System.out.print ("Ingrse numero 2: "); 
       int num2= objetol.nextInt () ; 
       int num3=num+num2; 
       System.out.println ("el resultado es: "+num3); 
       
       System.out.print ("Ingrese el valor al que se desea obtener el seno: ");
       double num1=objetol. nextDouble (); 
       double resultado=Math.sin (num); 
       System.out.println("El seno es: "+resultado);
    }
    
}
