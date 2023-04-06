package Ado13;
import java.util.Scanner;
class ex5{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite qual o tamanho do Array: ");
    int tam = ler.nextInt();
    int [] primos = funPrimos(tam); 
    funExibir(primos);
  }
  public static int[] funPrimos(int tam){
    int [] primos = new int[tam];
    int pos = 0;
    for(int cont = 2; cont<99999; cont++){    
      if (cont==2 || cont%cont==0 && cont%2!=0){
        primos[pos] = cont;
        pos++;       
        if (pos==tam){
        break;
        }     
      }
    }
    return primos;
  }
  public static void funExibir(int [] primos){
    System.out.println("\nSequência dos "+primos.length+" primeiros primos:");
    for(int i = 0; i<primos.length; i++){     
      if (i == primos.length-1){
      System.out.print(primos[i]);
      }else{
        System.out.print(primos[i]+", ");
      }     
    }
  }
}