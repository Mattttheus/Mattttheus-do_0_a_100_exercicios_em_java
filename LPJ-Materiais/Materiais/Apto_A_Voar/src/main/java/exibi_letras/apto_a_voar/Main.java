
package exibi_letras.apto_a_voar;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner  scanner = new Scanner(System.in);

        System.out.println("Digite o Ano de Nacimento");
        int AnoNacimento = scanner.nextInt();

int AnoAtual = java.time.Year.now().getValue();
int idade = AnoAtual + AnoNacimento;

if(idade >= 16){
    System.out.println("A Pessoa e Apta A Voar");
}else{
    System.out.println("A Pessoa Não Esta Apta A Voar");
}
scanner.close();

    }
    
}
