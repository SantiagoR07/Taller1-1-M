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
       
       System.out.println("Elige la operacion a realizar\n1. Sumar\n2. Resta\n3. Multiplicacion\n 4. Division");
       opcion = leer.nextInt();
       
       System.out.println("Digite el primer numero");
       num1 = leer.nextInt();
       System.out.println("Digite el segunto numero");
       num2 = leer.nextInt();
       
      
      
       switch(opcion){
           case 1 -> {
               respuesta= num1 + num2;
               System.out.println("La suma de ambos numeros es: " +respuesta);
            }
           case 2 -> {
               respuesta = num1 - num2;
               System.out.println ("La resta de ambos numeros es: " +respuesta);
            }
           case 3 -> {
               respuesta = num1 * num2;
               System.out.println ("La multiplicacion de ambos numeros es: " +respuesta);
            }
           case 4 -> {
               if (num2 == 0){
                   System.out.println("No se puede dividir por 0");
               }
               else{
               respuesta = num1 / num2;
               System.out.println ("La division de ambos numeros es: " +respuesta);
               }
            }
       }
    }
}

       
