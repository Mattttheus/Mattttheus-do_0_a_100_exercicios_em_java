
package Concatenador;

 import java.util.Scanner;
 
public class Main {
   
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   

        System.out.println("Digite A Promeira Fraze");
         String Fraze1= scanner.nextLine();

     System.out.println("Digite A Segunda FrStringaze");
      String Fraze2= scanner.nextLine();


         String Resultado =  Fraze1 + Fraze2;
    
         System.out.println("A fraze inteira é" + Resultado);

scanner.close();

    
}
}
