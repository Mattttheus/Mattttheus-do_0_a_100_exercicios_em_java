
package exibi_letras.subritair_letras;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra");
           String frase = scanner.nextLine();
          String NovaFraze = frase.replace('a','e');
        System.out.println("Fraze Modificada:"+NovaFraze);
scanner.close();

    }
    
}
