
package exibi_letras.palisromo;

/**
 *
 * @author theus
 */

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma fraze");
         String nome = scanner.nextLine();


String nomeMinusculo = nome.toLowerCase();

if(nomeMinusculo.startsWith("a")){
    System.out.println(" O Nome Começa Com A Letra A. ");
}else{

    System.out.println("o Nome Não Começa Com A Letra A. ");
}
scanner.close();
    }
    
}
