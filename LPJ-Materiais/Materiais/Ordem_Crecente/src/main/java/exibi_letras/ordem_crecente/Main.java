
package exibi_letras.ordem_crecente;

import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero");
        int Numero1 = scanner.nextInt();

        System.out.println("Digite o Segundo Numero");
        int Numero2 = scanner.nextInt();

        System.out.println("Digite o Terceiro Numero");
        int Numero3 = scanner.nextInt();

if(Numero1 <= Numero2 && Numero1 <= Numero3){

    System.out.println(Numero1+ " ");
if(Numero2 <= Numero3){

    System.out.println(Numero2 + " " +Numero3);
}else{

    System.out.println(Numero3 + " " +Numero2);

} if(Numero2<= Numero1 && Numero2 <=Numero3 )
System.out.println(Numero2 + " ");

}else if(Numero1 <= Numero3){

    System.out.println(Numero1 + " " + Numero3);
}else{
    System.out.println(Numero3 + " " + Numero1);
}
if(Numero1 <= Numero2){

    System.out.println(Numero1 + " " + Numero2);
}else{

    System.out.println(Numero2 + "" + Numero1);
}

scanner.close();
    }
    
}
