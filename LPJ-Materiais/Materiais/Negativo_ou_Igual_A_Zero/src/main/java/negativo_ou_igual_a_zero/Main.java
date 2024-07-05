
package negativo_ou_igual_a_zero;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero"); 
         int numero1 = scanner.nextInt();

    System.out.println("Digite o Seundo Numero"); 
         int numero2 = scanner.nextInt();

    System.out.println("Digite o Terceiro Numero"); 
         int numero3 = scanner.nextInt();

int Some = (numero1 + numero2 + numero3 ); 

if (Some > 0 ){
    System.out.println("Numero E Positivo ");
}else if(Some < 0){

    System.out.println("Numero e Negativo");
}else{
    System.out.println(" O Numero é Igual Zero");
}

scanner.close();

    }
    
}
