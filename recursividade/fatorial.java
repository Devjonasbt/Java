package recursao;

import java.util.Scanner;

class fatorial {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe um número:");
    int n = ler.nextInt();

    int f = fatorial(n, 1);
    
    System.out.println("O fatorial é " + f);
  }

  public static int fatorial(int num, int fat) {
    if (num == 1)
      return fat;
      
    return fatorial(num - 1, fat * num);
  }
  
}
