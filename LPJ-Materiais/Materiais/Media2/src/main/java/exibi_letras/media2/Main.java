
package exibi_letras.media2;

import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite a Primeira Nota");
        double nota1 = scanner.nextDouble();

 System.out.println("Digite a Segimda Nota");
        double nota2 = scanner.nextDouble();

 System.out.println("Digite a Terceira Nota");
        double nota3 = scanner.nextDouble();

 System.out.println("Digite a Quarta Nota");
        double nota4 = scanner.nextDouble();

double Media = (nota1 + nota2 + nota3 + nota4 )/4;

if(Media >= 7){

    System.out.println("Aluno Aprovado");

}else if (Media < 4){

    System.out.println("Aluno Reprovado");

}else{

    System.out.println(" Aluno em Reculperação ");
}

scanner.close();
  }
    
}
