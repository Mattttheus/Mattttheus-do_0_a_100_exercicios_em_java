package mais;

public class Mais {

   

    public static void main(String[] args) {
        int Num1;
        int Num2;
  Num1 =40;
  Num2=40;
 if (Num1 == Num2){
     
        System.out.println("Numeros sao iguais "+Num1+Num2);
  }else{
     System.out.println("Numeros Nao Iguias");
 }
 Num1=40;
 Num2=50;
    
  if (Num1 != Num2){
      System.out.println("Numeros sao Diferentes:"+Num1 +Num2);
    
    }else{
      System.out.println("Numeros sao iguais ");
  }
 Num1=40;
 Num2=15;
  int Num3=30,Num4=15;
  
  if ((Num1>Num3)&&(Num2==Num4)){
    
      System.out.println("Primeira parte Satifeita");     
    }else{
      System.out.println("Segunda Satisfeita");
          
  }
  Num1=40;
  Num2=15;
  Num3=30 ;
  Num4=15;
  
  if ((Num1>Num3)||(Num2==Num4)){
    
      System.out.println("Primeira parte Satifeita");     
    }else{
      System.out.println("Segunda Satisfeita");
          
  }
  //Comando relacional SWITCH
  
char Opcao ='2';
switch (Opcao){

    case '1': {
        System.out.println("Inclusao");
        break;
    }
    case '2': {
        System.out.println("Alteração");
        break;
   }
      case '3': {
        System.out.println("Delete");
        break;
  }
         case '4': {
        System.out.println("Reculpera");
        break;
         }
         default:
             System.out.println("Opção invalida:"+Opcao + "Digite " );
   }
int Vezes =1;
   while(Vezes<=10){
   
       System.out.println("Estou fazendo laço comando While :" + Vezes + "ª vez");
       Vezes++;   
   }
   System.out.println ("Sai do laço comando While  :" +( Vezes -1 )+ " ª vez");
  
   //Laço pré-TesTADO 
    Vezes=1;
    do{
        System.out.println("Estou fazendo laço comando Do While:"+Vezes + " ª vez " );
         Vezes++;
         }while(Vezes<=10);{        
    
      System.out.println ("Estou fazendo laço comando Do While:" +( Vezes -1 )+ " ª vez");
      
      for(Vezes =10;Vezes >=0; Vezes--){
          System.out.println ("Fazendo Laço do Comando For :" +( Vezes )+ " ª vez");
          
          }{System.out.println ("Sai do Laço do Comando For :" +( Vezes +1 )+ " ª vez");
      }
    }

    
}
}
    

    
