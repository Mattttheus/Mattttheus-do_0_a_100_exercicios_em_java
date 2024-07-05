
package exibi_letras.condicionais;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

if (idade >= 18){
        
    System.out.println("Voce e Maior De Idade");
 }else{
        System.out.println("Voce E Menor D Idade");
}

scanner.close();

    }
    
}
