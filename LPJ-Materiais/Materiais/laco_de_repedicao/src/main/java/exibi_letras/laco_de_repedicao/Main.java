
package exibi_letras.laco_de_repedicao;

import java.util.Scanner;
public class Main {

  
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");
         String fraze = scanner.nextLine();

String NovaFraze ="";

for (int i = 0; i< fraze.length (); i++){

char letra =fraze.charAt(i);

if (letra== 'a'){
NovaFraze +='e';
}else{

NovaFraze +=letra;
}
}
        System.out.println("Fraze Modificada : " + NovaFraze);

scanner.close();
    }
    
}
