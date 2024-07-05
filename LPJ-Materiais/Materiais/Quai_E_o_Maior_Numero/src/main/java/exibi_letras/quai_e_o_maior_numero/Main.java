
package exibi_letras.quai_e_o_maior_numero;

import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
         int numero1 = scanner.nextInt();

System.out.println("Digite o Segundo numero");
         int numero2 = scanner.nextInt();

System.out.println("Digite o Terceiro numero");
         int numero3 = scanner.nextInt();
int maior = numero1;

if(numero2 > maior ){

maior =numero2;
}
if(numero3 > maior){

maior = numero3;
}
        System.out.println("Omaior Numero É :"+maior);
        scanner.close();
  }
    
}
