package recursao;

import java.util.Scanner;

class contar {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe um número:");
    int n = ler.nextInt();

    contarRegressivo(n);
    
  }

  public static void contarRegressivo(int num) {
    if (num <0)
      return;
    
    System.out.println(num);
    contarRegressivo(num -1);
  }
  
}
