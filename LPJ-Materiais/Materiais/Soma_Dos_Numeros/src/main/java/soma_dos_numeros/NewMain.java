
package soma_dos_numeros;

import  java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        System.out.println("Digite Um Numero");
         int numero= scanner.nextInt();

int soma = 0 ;

for(int i = 1; i <= numero; i++){

soma += i ;
} 
        System.out.println("A Soma Dos Numeros De 1 A " + numero + "  é  "  + soma);     
scanner.close();
}
    
}
