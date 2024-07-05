
package Calculo_De_Postos_Graficos;

import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in); 
       System.out.println("Digite as cordenadas do promeiro Ponto"); 
   
       System.out.println("Coordenadas Ponto x");
          double X1 = scanner.nextDouble();
          System.out.println("Coordenadas Ponto Y");
          double Y1 = scanner.nextDouble();

       System.out.println("\nDigite as coordenadas do segundo porto :");

            System.out.println("Coordenadas Ponto x");
            double X2 = scanner.nextDouble();
          System.out.println("Coordenadas Ponto Y");
          double Y2 = scanner.nextDouble();

double Localizacao = Math.sqrt(Math.pow(X2 -X1 ,2) + Math.pow(Y2 -Y1, 2));

       System.out.println("A Localização entre Os Pontos  é : " + Localizacao);
scanner.close();

    }
    
}
