
package calculo_de_velocidade_media;

import java.util.Scanner;

public class main {

 public static void  main(String[] args){
   Scanner scanner = new Scanner(System.in);

  System.out.println("Digite o espaço ");
   double variacaoEspaco = scanner.nextDouble();
  System.out.println("Digite o espaço ");
   double variacaoTempo = scanner.nextDouble();
 
double VelocidadeMedia = variacaoTempo/variacaoEspaco;

 System.out.println("A velocidade Media e :" + VelocidadeMedia);
    
}
}