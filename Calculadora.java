/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import java.util.Scanner;

/**
 *
 * @author Santiago Rubiano Garzón 7004147
 */
public class Calculadora {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
       int opcion;
       int num1 = 0;
       int num2 = 0;
       int respuesta;
       
       System.out.println("""
                          Elige la operacion a realizar
                          1. Sumar
                          2. Resta
                          3. Multiplicacion
                           4. Division
                           5. Seno
                           6. Coseno
                           7. Tangente
                           8. Raiz enecima
                           9. potencia enecima""");
       opcion = leer.nextInt();
       
      
      
       switch(opcion){
           case 1 -> {
               System.out.println("Digite el primer numero");
                 num1 = leer.nextInt();
                System.out.println("Digite el segunto numero");
                num2 = leer.nextInt();
               respuesta= num1 + num2;
               System.out.println("La suma de ambos numeros es: " +respuesta);
            }
           case 2 -> {
               System.out.println("Digite el primer numero");
       num1 = leer.nextInt();
       System.out.println("Digite el segunto numero");
       num2 = leer.nextInt();
               respuesta = num1 - num2;
               System.out.println ("La resta de ambos numeros es: " +respuesta);
            }
           case 3 -> {
               System.out.println("Digite el primer numero");
       num1 = leer.nextInt();
       System.out.println("Digite el segunto numero");
       num2 = leer.nextInt();
               respuesta = num1 * num2;
               System.out.println ("La multiplicacion de ambos numeros es: " +respuesta);
            }
           case 4 -> {
               System.out.println("Digite el primer numero");
       num1 = leer.nextInt();
       System.out.println("Digite el segunto numero");
       num2 = leer.nextInt();
               if (num2 == 0){
                   System.out.println("No se puede dividir por 0");
               }
               else{
               respuesta = num1 / num2;
               System.out.println ("La division de ambos numeros es: " +respuesta);
               }
            }
           case 5 ->{
               System.out.println("Digite el primer numero");
       num1 = leer.nextInt();
       respuesta = (int) Math.sin(num1);
       System.out.println ("El seno del numero ingresado es: " +respuesta);
           }
           case 6 ->{
               System.out.println("Digite el primer numero");
       num1 = leer.nextInt();
       respuesta = (int) Math.cos(num1);
       System.out.println ("El coseno del numero ingresado es: " +respuesta);
           }
           case 7 ->{
               System.out.println("Digite el primer numero");
       num1 = leer.nextInt();
       respuesta = (int) Math.tan(num1);
       System.out.println ("La tangente del numero ingresado es: " +respuesta);
           }
           case 8 ->{
               System.out.println("Digite el primer numero");
       num1 = leer.nextInt();
       System.out.println("Digite el exponente de la raiz");
       int indice = leer.nextInt();
       respuesta = math.pow(num1, 1.0/indice);
       if (indice == 0){
           System.out.println ("El numero no puede elevarse al numero 0");
       }else{
           respuesta = math.pow(num1, 1.0/indice);
       System.out.println ("La raiz "+indice+" es: " +respuesta);
            }
           }
           case 9 ->{
               System.out.println("Digite el primer numero");
       num1 = leer.nextInt();
       System.out.println("Digite el exponente de la potencia");
       num2 = leer.nextInt();
       respuesta = math.pow(num1,num2);
       System.out.println ("El resultado de la potencia es: " +respuesta);
           }
       }
    }
}