
package descubrir_o_numero_positivo;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Numero");
        int numero = scanner.nextInt();

if(numero > 0 ){

    System.out.println("O Numero E Positivo");
}else if(numero < 0 ){
    System.out.println("O Numero e negativo");
} else{

    System.out.println("o numero e Zero ");
}

scanner.close();
    }
    
}
