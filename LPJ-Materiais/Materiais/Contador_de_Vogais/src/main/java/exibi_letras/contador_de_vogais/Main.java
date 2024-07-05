
package exibi_letras.contador_de_vogais;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma Plavra");
        String palavra = scanner.nextLine();

int ContadorDeVogais = 0 ;

for(int i=0;i<palavra.length(); i++){
char letra = Character.toLowerCase(palavra.charAt(i));

if(letra =='a'||
letra =='e'||
letra =='i'||
letra =='o'||
letra =='u'){
ContadorDeVogais++;
}

}
        System.out.println("A Quantidade de Vogais é :" +ContadorDeVogais);
scanner.close();
   }
    
}
