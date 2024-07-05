
package verifiador_triangulo;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite O Primeiro Lado");
         double PrimeiroLado = scanner.nextDouble();

     System.out.println("Digite O Segundo Lado");
         double SegundoLado = scanner.nextDouble();

     System.out.println("Digite O Quarto Lado");
         double TerceiroLado = scanner.nextDouble();

   boolean PodeFormarTriangulo = (PrimeiroLado + SegundoLado > TerceiroLado) 
          && (PrimeiroLado + TerceiroLado >SegundoLado)
          && (SegundoLado + TerceiroLado >PrimeiroLado);

if(PodeFormarTriangulo){

    System.out.println("A Soma pode Formar Um Triagulo ");

}else{

    System.out.println("A Soma não pode Formar um Triangulo ");
}

scanner.close();

    }
    
}
