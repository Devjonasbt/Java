package recursao;

import java.util.Scanner;

class fatorialRecu {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe um número:");
    int n = ler.nextInt();

    int f = fatorial(n);
    
    System.out.println("O fatorial é " + f);
  }

  public static int fatorial(int num) {
    if (num == 1)
      return 1;
    
    return num * fatorial(num - 1);
  }
  
}
