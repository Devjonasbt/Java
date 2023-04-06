package Ado13;

import java.util.Scanner;
class ex4 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite um valor para o array");
    int dig = ler.nextInt();
    int[] array = new int[dig];
    for(int i=0;i<dig;i++){
      System.out.print("Digite "+(i+1)+"° valor:");
      array[i] = ler.nextInt();
    }
    funArray(array); 
  }
  public static void funArray(int[] num){ 
    boolean ver = false;
    int i=0;
    while(i<num.length-1){
      if(num[i] < num[i+1]){
        ver = true;
        i++;
      } else{
        ver = false;
        break;
      }
    } 
    if(ver==true){
      System.out.println("\nOrganização dos elementos:\n");
      System.out.println("Ordem crescente ");
    }else{
       while(i<num.length-1){
        if(num[i] > num[i+1]){
           ver = true;
           i++;
        } else{
          ver = false;
          break;
        }
      }if(ver==true){
        System.out.println("\nOrganização dos elementos:\n");
        System.out.println("Ordem decrescente ");
      }
      else if(ver==false){
        System.out.println("\nOrganização dos elementos:\n");
        System.out.println("Desordenado");
      }     
    }
  }
}