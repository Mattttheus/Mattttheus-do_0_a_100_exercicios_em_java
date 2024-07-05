
package exibi_letras.sobrenome_ultimo_nome;

import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Um Nome Completo:");
          String NomeCompleto= scanner.nextLine();

          String [] parte = NomeCompleto.split(" ");
          String SobreNome = parte[parte.length -1 ];
        System.out.println("Nome Com Sobrenome Primeiro: ");
         System.out.print(SobreNome);

for (int i = 0; i <parte.length - 1; i++){
    System.out.println(" " + parte[i]);
}
        System.out.println("");
scanner.close();
    }
    
}
