
package exibi_letras.contado_de_espacos_sem_loop;
import java.util.Scanner;
public class Main {

  
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite Uma Fraze");
         String Fraze = scanner.nextLine();
String [] partes = Fraze.split(" ");

int  QuantidadeDeEspaco = partes.length -1;

        System.out.println("A Quantidade De Espaços Em Branco São :"+ QuantidadeDeEspaco);
scanner.close();

   }
    
}
