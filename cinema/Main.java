package cinema;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    Pedido pedido = new Pedido();

    System.out.println("### PROGRAMA DO TOTEN ###");

    System.out.println("Qual filme você quer assistir?");
    pedido.setFilme(ler.nextLine());

    System.out.println("Qual dia você quer ver?");
    pedido.setData(ler.next());

    System.out.println("Qual hora da sessão?");
    pedido.setHorario(ler.next());
    
    System.out.println("Qual hora da sessão?");
    
    pedido.setMeia(false);
    pedido.setAssento("A10");

    Toten toten = new Toten();
    Ingresso ingresso = toten.calcularTotal(pedido);

    ingresso.exibirIngresso();

    
  }
}