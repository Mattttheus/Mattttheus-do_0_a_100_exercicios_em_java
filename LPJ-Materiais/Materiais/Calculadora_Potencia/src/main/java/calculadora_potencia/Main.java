
package calculadora_potencia;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Digite A Base ");
        int Base = input.nextInt();

      System.out.println("Digite o Expoente ");
        int Expoente = input.nextInt();

int Resultado = 1;

for (int i =1; i <= Expoente;i++){

Resultado *= Base;
} 

        System.out.println(Base + " Elevado á " + Expoente + "  é  " +  Resultado); 
input.close();

}
    
}
