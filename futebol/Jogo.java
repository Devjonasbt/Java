
package futebol;
import java.util.*;

class Jogo {
 static Scanner ler = new Scanner(System.in);
  public static void main(String[] args) {
    PartidaFut partida = new PartidaFut();

    String j, time1;
    int n;
    
    System.out.println("Informe o time da casa:");
    time1 = ler.next();
    partida.setMandante(time1);

    System.out.println("Informe o time visitante:");
    partida.setVisitante(ler.next());

    int opcao = menu();
    while (opcao != 0) {
      switch (opcao) {
        case 1: 
          System.out.printf("Informe o jogador: ");
          j = ler.next();

          System.out.printf("\nInforme o número da camisa: ");
          n = ler.nextInt();

          partida.golMandante(j, n);
        break;
  
        case 2: 
          System.out.printf("Informe o jogador: ");
          j = ler.next();

          System.out.printf("\nInforme o número da camisa: ");
          n = ler.nextInt();

          partida.golVisitante(j, n);
        break;

        default:
          System.out.printf("Opção inválida");
        break;
      }

      opcao = menu();
    }

    partida.resultado();
    
    
  }

  

 
  public static int menu() {
    System.out.println("1. Gol do time da casa");
    System.out.println("2. Gol do visitante");
    System.out.println("0. Partida encerrada");
    int opcao = ler.nextInt();
    return opcao;
  }

  
}

