
package exibi_letras.media_prova;

import java.util.Scanner;

public class NewMain {

   
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nota P1");
         double p1 = scanner.nextDouble();

        System.out.println("Digite a P2");
        double p2 = scanner.nextDouble();

double Media = 0;

if (p1 >= 6){

    System.out.println("Aluno Aprovado Na P1");
}else{

    System.out.println("Aluno Reprovado");
}
if (p2 >=6 ){
    System.out.println("Aluno Aprovado P2");
}else{
    System.out.println("Aluno reprovado");
}

        Media = (p1 + p2)/2;

if(Media > 6){

    System.out.println("Aluno Arovado sua Media foi:" + Media);
}else{

    System.out.println("Aluno Rerpvado, Sua Media Foi:"+Media);
}

scanner.close();
    }
    
}
