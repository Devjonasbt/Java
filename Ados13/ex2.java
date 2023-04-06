package Ado13;
import java.util.Scanner;
class ex2 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o tamanho do array");
    int tam = ler.nextInt();
    int[] criar = funCriar(tam);
    int[] inverter = funInverter(criar);
    funExibir(inverter);    
  }
  public static int[] funInverter(int[] arr){
    int[] array = new int[arr.length];
    int j=0;
    for(int i=array.length-1; i>=0;i--){
      array[j] = arr[i];
      j++;
    }
    return array;
  }
  public static int[] funCriar(int dig){
    Scanner ler = new Scanner(System.in);
    int[] vet = new int[dig];
    for(int i=0; i<dig; i++){
      System.out.print("Digite "+(i+1)+"° Numero:");
      vet[i] = ler.nextInt();   
    }
    return vet;
  }
  public static void funExibir(int[] num){
    System.out.println("\nOs numeros digitados são: \n");
    for(int i : num){
      System.out.println(i);
    } 
  }
}