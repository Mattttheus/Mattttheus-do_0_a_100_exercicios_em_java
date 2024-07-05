
package apto_a_votar;

import java.util.Scanner;
public class Main {
  
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua Idade");
        int Idade =  scanner.nextInt();

if(Idade <16){

    System.out.println("A Pessoa Não Pode Votar ");

}else if ( Idade >=16 &&Idade <= 17 || Idade >= 70){

    System.out.println("Apto A Votar Pporem Não e Obrigatoria ");

}else{ 

    System.out.println("A Pessoa e Obrigada a Votar");
    
}

scanner.close();
 }
    
}
