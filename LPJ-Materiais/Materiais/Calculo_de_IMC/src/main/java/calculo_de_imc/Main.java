
package calculo_de_imc;

import java.util.Scanner;
public class Main {
      
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Qual e Seu Peso (em kg)");
        double Peso = scanner.nextDouble();

 System.out.println("Qual e Sua  Altura  (Em Metros)");
        double Altura  = scanner.nextDouble();

double IMC = Peso /(Altura * Altura);
String Categoria;

if(IMC < 18.5){

 Categoria = "de Abaixo Do Peso";

}else if(IMC < 25){

 Categoria = "de Peso Sauadavel";

}else if(IMC < 30 ){

 Categoria = " de Sobrepeso";

}else if(IMC < 35){

 Categoria = "de Obesidade";

}else{

 Categoria = "de Obesidade Morbida";
}
        System.out.println("Seu IMC é: " + Categoria);
        System.out.println("Sua Situação é De:"+ Categoria);

scanner.close();
   }
    
}
