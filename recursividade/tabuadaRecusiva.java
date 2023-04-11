package recursao;

import java.util.Scanner;

class tabuadaRecursiva {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe um número:");
    int n = ler.nextInt();

    tabuada(n, 1);
  }

  public static void tabuada(int num, int cont) {
    if (num == 1)
      return;

    int r = num * cont;
    System.out.printf("%d x %d = %d \n", num, cont, r);
  }
  
}