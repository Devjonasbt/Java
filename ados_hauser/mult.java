package ados_Hauser;

import java.util.Scanner;

class mult {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int dig;

    System.out.print("Digite um numero: ");
    dig = ler.nextInt();

    funMult(dig);
    
  }
  public static void funMult(int numero){
    int i= 1;
    while (i <= 10) {
      System.out.println(numero + " x " + i + " = " + numero * i);
      i++;
    }
  }
}
