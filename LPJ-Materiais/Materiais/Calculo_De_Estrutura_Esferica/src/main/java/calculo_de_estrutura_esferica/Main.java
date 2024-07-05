
package calculo_de_estrutura_esferica;


 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor Do Raio");
         double Raio = scanner.nextDouble();
         
          double volume = (4.0/3.0) *Math.PI*Math.pow( Raio,3);

        System.out.println(" O valor da Esfera é :"  + volume);

     scanner.close();
    }
    
}
