
package exibi_letras.mavenproject2;

import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
      Scanner scanner = new  Scanner(System.in);


         System.out.println("Digite Um Nome Completo: ");
          String NomeCompleto = scanner.nextLine();

          String[] partesNome =  NomeCompleto.split("");
        
          String PrimeiroNome = partesNome [0];
         
        System.out.println("Primeiro Nome: " + PrimeiroNome);  
    
    scanner.close();
    }
    
}
