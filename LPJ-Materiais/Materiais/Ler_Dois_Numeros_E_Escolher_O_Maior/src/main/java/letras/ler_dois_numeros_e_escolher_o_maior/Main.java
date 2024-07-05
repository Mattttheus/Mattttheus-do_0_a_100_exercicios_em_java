
package letras.ler_dois_numeros_e_escolher_o_maior;

import java.util.Scanner;
public class Main {
  
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite O Primeiro Numero");
         int Numero1 = scanner.nextInt();

        System.out.println("Digite O Segundo Neumero");
         int Numero2 = scanner.nextInt();

if (Numero1 > Numero2){

    System.out.println("O Primeiro Numero E O Maior");
}else if(Numero2 > Numero1){
    System.out.println("O Segundo E Maior");
}else{
    System.out.println("Os Numeros São Iguias");

}

scanner.close();
    }
    
}
