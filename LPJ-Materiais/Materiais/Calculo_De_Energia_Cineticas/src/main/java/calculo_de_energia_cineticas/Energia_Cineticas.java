
package calculo_de_energia_cineticas;

import java.util.Scanner;

public class Energia_Cineticas {
  public static void  main(String[] args){
   Scanner scanner = new Scanner(System.in);

      System.out.println("Digite a Massa do Objeto");
        double massa  = scanner.nextDouble();
      System.out.println("Digite a velocidade do Objeto");
        double Velocidade  = scanner.nextDouble(); 

double EnergiaCinetica =(massa * Math.pow(Velocidade ,2)) /2;
      System.out.println("A Energia Cinetica Do Objetos " + EnergiaCinetica );

scanner.close();

 }
}
