
package classificador_de_idade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Sua Idade ");
        int Idade = scanner.nextInt();

if(Idade >= 0 && Idade <=12){

    System.out.println("Classifica)ão a Livre ");
}else if (Idade >=13 && Idade <= 17){
    System.out.println("Idicação para Menores de  17");
}else if(Idade >= 18 && Idade <=59){
    System.out.println("Conteudo Adulto");
}else{

    System.out.println("Preve contra Idicação ");
}

scanner.close();
       
    }
    
}
