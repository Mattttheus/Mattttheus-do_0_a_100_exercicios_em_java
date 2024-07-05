
package exibi_letras.achar_o_numero_inpar;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero");
        int numero = scanner.nextInt();

if(numero %2 == 0 ){

    System.out.println("O Numero E Par");

}else{

    System.out.println("O Numero e Impar");
}
scanner.close();
       
    }
    
}
