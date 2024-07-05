
package quem_e_maior_de_idade;

import java.util.Scanner;
public class Main {

  
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite a idade da Primeira Pessoa");
        int pessoa1 = scanner.nextInt();

     System.out.println("Digite a idade da Segundo Pessoa");
         int pessoa2 = scanner.nextInt();

     System.out.println("Digite a idade da terceira Pessoa");
        int pessoa3 = scanner.nextInt();

 int contadorDeMaiorDeIdade = 0;

if(pessoa1 >= 18){
contadorDeMaiorDeIdade++;
}
if(pessoa2 >= 18){
contadorDeMaiorDeIdade++;
}
if(pessoa3 >= 18){
contadorDeMaiorDeIdade++;
}
        System.out.println("Qauntidade de pessoa maior de Idade:" + contadorDeMaiorDeIdade);

scanner.close();
    }
    
}
