package laco_for_while;

import java.util.Scanner;
public class taboada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scanner = new Scanner(System.in);

        System.out.println("Qual e taboada Quer Ver ");
         int numero = scanner.nextInt();

        System.out.println("Taboado do Numero " + numero);
for (int i=1; i<10 ; i++){

       int Resultado = numero * i ;
    System.out.println(numero + " x " + i + " = " + Resultado );

}
scanner.close();
    }
    
}
