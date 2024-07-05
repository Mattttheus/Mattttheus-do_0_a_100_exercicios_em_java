
import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a Variação de Espaço");
         double variacaoEspaco = scanner.nextDouble();

         System.out.println("Digite a Variação de Tempo");
         double variacaoTempo = scanner.nextDouble();

       
         double Variação = variacaoTemp / variacaoEspaco;

         System.out.println("A Velocidade Media é :" + Variação);
    }


}
