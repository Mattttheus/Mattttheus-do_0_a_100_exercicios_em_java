
package exibi_letras;
import java.util.Scanner;
public class main {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma Palavra");
         String Palavra = scanner.nextLine();
for (int i = 0 ; i < Palavra.length(); i++ ){

    char letra = Palavra.charAt(i);
    System.out.println(letra);
}
 

scanner.close();

    }


}
