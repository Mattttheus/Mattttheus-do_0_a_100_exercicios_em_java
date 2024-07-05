
package exibi_letras.verificar_divisibilidade;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
     Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite Um Numero Inteiro:");
        int numero = scanner.nextInt();

if(numero %3 == 0 && numero % 5 == 0){

    System.out.println("O numero E Divisivel por3 e por 5.");

}else{

    System.out.println("O Numero Não e Divisivl por 3 e 5 ");
}

scanner.close();

    }
    
}
