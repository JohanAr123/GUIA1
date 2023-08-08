
package com.mycompany.calculadora2;

import java.util.Scanner;

public class NewClass {
    
    
       
public static void main (String[] args) throws InterruptedException{
       
   
       int num,n;
       Scanner entrada=new Scanner(System.in);
       do{    
        for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
       System.out.println("CALCULADORA");
       System.out.println("1.SUMA");
       System.out.println("2.RESTA");
       System.out.println("3.MULTIPLICACION");
       System.out.println("4.DIVISION");
       System.out.println("5.FUNCIONES TRIGONOMETRICAS");
       System.out.println("6.RAIZ ENECIMA");
       System.out.println("7.POTENCIA ENECIMA");
       System.out.println("8.IVA");
       System.out.println("9.SALIR MENU ");
       System.out.println("Digite un numero: ");
       num=entrada.nextInt();
       if(num>9 || num<1){
       System.out.println("Esa opcion no existe");
       }
       else{
       switch(num){
           
           case 1:
                for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
               System.out.println("SUMA");
               System.out.println("Ingrese un numero");
               float num1=entrada.nextFloat();
               System.out.println("Ingrese otro numero");
               float num2=entrada.nextFloat();
               System.out.println("El resultado es: "+(num1+num2));
               try{
               Thread.sleep(3000);
                }catch(InterruptedException e ) {}
               break;
           case 2:
                for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
               System.out.println("RESTA");
               System.out.println("Ingrese un numero");
               num1=entrada.nextFloat();
               System.out.println("Ingrese otro numero");
               num2=entrada.nextFloat();
               System.out.println("El resultado es: "+(num1-num2));
               try{
               Thread.sleep(3000);
                }catch(InterruptedException e ) {}
               break;
           case 3:
                for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
               System.out.println("MULTIPLICACION");
               System.out.println("Ingrese un numero");
               num1=entrada.nextFloat();
               System.out.println("Ingrese otro numero");
               num2=entrada.nextFloat();
               System.out.println("El resultado es: "+(num1*num2));
               try{
               Thread.sleep(3000);
                }catch(InterruptedException e ) {}
               break;
            case 4:
                 for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
               System.out.println("DIVISION");
               System.out.println("Ingrese un numero");
               num1=entrada.nextFloat();
               System.out.println("Ingrese otro numero");
               num2=entrada.nextFloat();
               if(num2==0){
               System.out.println("No se divide en cero");
               }
               else {
               System.out.println("El resultado es: "+(num1/num2));
               }
               try{
               Thread.sleep(3000);
                }catch(InterruptedException e ) {}
               break;
            case 5:
                 for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
               System.out.println("FUNCIONES TRIGONOMETRICAS");
               System.out.println("1.FUNCION COSENO");
               System.out.println("2.FUNCION SENO");
               System.out.println("3.FUNCION TANGENTE");
               System.out.println("Ingrese un numero");
               n=entrada.nextInt();
               switch(n){
                   case 1:
                        for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
                    System.out.println("Ingrese un numero");
                    num1=entrada.nextFloat();
                    System.out.println("Coseno de: "+(num1)+" = "+Math.cos(num1));
                    try{
                    Thread.sleep(3000);
                    }catch(InterruptedException e ) {}
                    break;
                    case 2:
                         for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
                    System.out.println("Ingrese un numero");
                    num1=entrada.nextFloat();
                    System.out.println("Seno de "+(num1)+" = "+Math.sin(num1));
                    try{
                    Thread.sleep(3000);
                    }catch(InterruptedException e ) {}
                    break;
                    case 3:
                         for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
                    System.out.println("Ingrese un numero");
                    num1=entrada.nextFloat();
                    System.out.println("Tangente de "+(num1)+" = "+Math.tan(num1));
                    try{
                    Thread.sleep(3000);
                    }catch(InterruptedException e ) {}
                    break;
               
               }
       
            break;
            case 6:
                 for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
               System.out.println("RAIZ ENECIMA");
               System.out.println("Ingrese la base de la raiz");
               num1=entrada.nextFloat();
               System.out.println("Ingrese el exponente");
               num2=entrada.nextInt();
               if(num1<0 && num2%2==0){
                   System.out.println("ERROR MATEMATICO");
               }
               else{
               System.out.println("El resultado es: "+Math.pow(num1,1/num2));
               }
               try{
               Thread.sleep(3000);
                }catch(InterruptedException e ) {}
               break;
            case 7:
                 for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
               System.out.println("POTENCIA ENECIMA");
               System.out.println("Ingrese un numero");
               num1=entrada.nextFloat();
               System.out.println("Ingrese el exponente");
               num2=entrada.nextFloat();
               System.out.println("El resultado es: "+Math.pow(num1,num2));
               try{
               Thread.sleep(3000);
                }catch(InterruptedException e ) {}
               break;
            case 8:
                 for (int i = 0; i < 30; i++) {
            System.out.println();
        } 
               System.out.println("IVA");
               System.out.println("Ingrese el precio");
               num1=entrada.nextFloat();
               System.out.println("Ingrese el porcentaje del IVA");
               num2=entrada.nextFloat();
               System.out.println("El resultado es: "+(num1+num1*num2/100));
               try{
               Thread.sleep(3000);
               }catch(InterruptedException e ) {}
               try{
               Thread.sleep(3000);
               }catch(InterruptedException e ) {}
               break;
              
       }
       }
       }while(num!=9);
}         
}
    
    