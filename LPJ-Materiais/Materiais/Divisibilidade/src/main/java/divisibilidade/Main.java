
package divisibilidade;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
    Scanner  scanner = new Scanner(System.in);

        System.out.println("Digite o Primeior Numero");
        int Numero1 = scanner.nextInt();

 System.out.println("Digite o Segundo Numero");
        int Numero2 = scanner.nextInt();

if(Numero1 % Numero2 == 0){

    System.out.println(Numero1 + "E Divisivel Por " + Numero2);

}else{

    System.out.println(Numero1 + "Nãoe Divisivel Por "+ Numero2);

}

scanner.close();
    }
    
}
