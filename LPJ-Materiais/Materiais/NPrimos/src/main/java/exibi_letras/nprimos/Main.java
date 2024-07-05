
package exibi_letras.nprimos;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       
        System.out.println("Digite Um Numero Inteiro");
        int numero = input.nextInt();

boolean ehPrimo = true;

if (numero <=1){

ehPrimo = false;
}else{
   for(int i =2; i<= Math.sqrt(numero); i++){

if(numero% i == 0 ){
  ehPrimo = false;
break;
        }
   }
 
 }

if(ehPrimo){

    System.out.println(numero + " E um numero Primo");
}else{
           System.out.println(numero + "Não e Primo.");
  }
   input.close();
  }
}