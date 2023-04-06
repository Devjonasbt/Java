package Ado13;
import java.util.*;
class ex3 {
  public static void main(String[] args) {
    int[] jogo = new int[15];
    for (int i = 0; i < jogo.length; i++) {
      jogo[i] = funGerar(jogo);
    }
    funArray(jogo);
  } 
  public static void funArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int item = arr[i];
      System.out.printf("%d - ", item);
      if (i > 1 && (i+1) % 5 == 0)
        System.out.println();
    }
    System.out.println();
  }
  public static int funBuscar(int num, int[] numeros) {
    int pos = -1;
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == num) {
        pos = i;
      }
    }
    return pos;
  }  
  public static int funGerar(int[] numeros) {
    Random rand = new Random();
    int num = 0;
    do {
      num = rand.nextInt(26);
    } while (funBuscar(num, numeros) != -1);
    return num;
  }
}
