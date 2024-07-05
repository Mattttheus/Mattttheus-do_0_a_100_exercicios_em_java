
package divisivel_por_5;

import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero ");
         int numero1 = scanner.nextInt();

        System.out.println("Digite o Sgundo Numero ");
         int numero2 = scanner.nextInt();

        System.out.println("Digite o Terceiro Numero");
          int numero3 = scanner.nextInt();

int Some = ( numero1 + numero2 + numero3);

if (Some % 5 == 0 ){

    System.out.println("A Soma e Divisivel Por 5 ");
}else{

    System.out.println("A Soma Nãoe Divisivel Por 5");
}

scanner.close();
 }
    
}
