
package exibi_letras.dia_da_semana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

        System.out.println("Digite O Nome De Um Dia Da Semna ");
         String DiaSemana = scanner.nextLine();

if(DiaSemana.equalsIgnoreCase("Segunda-Feira")||
DiaSemana.equalsIgnoreCase("Terça-Feira")||
DiaSemana.equalsIgnoreCase("Quarta-Feira")||
DiaSemana.equalsIgnoreCase("Quinta-Feira")||
DiaSemana.equalsIgnoreCase("Sexta-Feira")){
 
    System.out.println(DiaSemana + "É Dia Util.");
}else if(DiaSemana.equalsIgnoreCase("Sabado")||
          DiaSemana.equalsIgnoreCase("Domingo")){

    System.out.println(DiaSemana + "E Um Final De Semana");
}else{

    System.out.println("Dia Invalido ");
}

  scanner.close();
  }
    
}
