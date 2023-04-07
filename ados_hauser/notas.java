package ados_Hauser;

import java.util.Scanner;
class av4 {
  public static void main(String[] args) {
     Scanner ler= new Scanner(System.in);
    System.out.println("Digite a quantidade de notas:");
    int arr = ler.nextInt();
    double[] array = funArray(arr);
    double maior = funMaior(array);
    System.out.println("Maior nota é = "+ maior);
    double menor = funMenor(array);
    System.out.println("Menor nota é = "+ menor);
    double media = funMedia(array,arr);
    System.out.println("A media é = "+media);
    funNotas(array);    
  } 
  public static double[] funArray(int tam){
    Scanner ler = new Scanner (System.in);
     double[] array = new double[tam];
    for(int i =0;i<array.length;i++){
      System.out.print("Digite a "+(i+1)+"° Nota: ");
       array[i] = ler.nextDouble(); 
    } 
    return array;
  }
  public static double funMaior(double []notas){
    double maior = 0;   
    for(double n : notas){     
      if(n>maior){
        maior=n;    
      } 
    } 
    return maior;
  }
  public static double funMenor(double []notas){
    double menor = 11;
    for(double n : notas){ 
      if(n<menor){
        menor=n;  
      }      
    }
    return menor;
  }
  public static double funMedia(double []med, int quant){
    double media = 0; 
    for(double soma : med){
      media += soma;
    }
    return media/quant;
  }
  public static void funNotas(double []notas){
    System.out.println("Notas digitadas:");
    for(double i : notas){
      System.out.print(i+" ");
    }
  } 
}
