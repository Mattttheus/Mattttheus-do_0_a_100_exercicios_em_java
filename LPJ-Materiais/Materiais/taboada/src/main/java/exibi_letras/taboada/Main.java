/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exibi_letras.taboada;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
       
           Scanner scanner = new Scanner(System.in);

        System.out.println("Qual e taboada Quer Ver ");
         int numero = scanner.nextInt();

        System.out.println("Taboado do Numero " + numero);
for (int i=1; i<10 ; i++){

       int Resultado = numero * i ;
    System.out.println(numero + " x " + i + " = " + Resultado );

}
scanner.close();
    }
}
    

