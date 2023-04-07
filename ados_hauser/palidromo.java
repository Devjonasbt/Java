package ados_Hauser;

import java.util.Scanner;
class palindromo {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite uma palavra");
    String palavra = ler.nextLine();
    
    String verPalavra = funFrase(palavra);
    System.out.println(verPalavra);
  }
  public static String funFrase(String msg) {
    String palindromo = "";
    for (int i = msg.length() - 1; i >= 0; i--) {
      palindromo += msg.charAt(i);
    
    }
    if (palindromo.equals(msg)) {
      palindromo = "\nÉ um palíndromo\n " ;
    } else {
      palindromo = "\nNão é um palíndromo\n " ;
    }
    return palindromo;
  }
}