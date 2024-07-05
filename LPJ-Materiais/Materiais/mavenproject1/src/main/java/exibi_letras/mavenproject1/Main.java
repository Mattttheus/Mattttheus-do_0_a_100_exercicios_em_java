
package exibi_letras.mavenproject1;

/**
 *
 * @author theus
 */
import java.util.Scanner;
public class Main { public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma Palavra ");
             String palavra = scanner.nextLine();

String PalavraFormatada = palavra.replaceAll("\\s+","").toLowerCase();
boolean palindromo = true ;
      
for (int i = 0; i< PalavraFormatada.length()/2 ; i++){

char a = PalavraFormatada.charAt(i);
char b =PalavraFormatada.charAt(PalavraFormatada.length()-i -1);
if (a !=b ){
 palindromo = false;
break;

}

}

if(palindromo){

    System.out.println("A Palavra e um palindromo");
}else{

    System.out.println("Apalavra Não e um palindromo");
}
scanner.close();

   }
 }
