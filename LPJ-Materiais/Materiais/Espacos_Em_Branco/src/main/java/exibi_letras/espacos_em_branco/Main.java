
package exibi_letras.espacos_em_branco;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase");
         String Frase = scanner.nextLine();

     int ContadorDeEspaco =0;

for (int i =0; i <Frase.length(); i++ ) {
      if (Frase.charAt(i)==' '){

       ContadorDeEspaco++;
      }
    }
        System.out.println("A Quantidade de Espaço Em Branco :" +ContadorDeEspaco);

scanner.close();
  }
}
    

