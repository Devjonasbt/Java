package futebol;
import java.util.*;

class PartidaFut {
  String mandante;
  String visitante;
  ArrayList<String> golsMandante = new ArrayList<String>();
  ArrayList<String> golsVisitante = new ArrayList<String>();
  
  public void setMandante(String time){
    this.mandante = time;
  }

  public void setVisitante(String time) {
    this.visitante = time;
  }

  public void golMandante(String jogador, int numero) {
    golsMandante.add(numero + " " + jogador);
  }

  public void golVisitante(String jogador, int numero) {
    golsVisitante.add(numero + " " + jogador);
  }
 
  public void resultado() {
    System.out.println("Jogo encerrado");
    System.out.printf("%s (%d) x (%d) %s \n\n", 
      mandante, 
      golsMandante.size(), 
      golsVisitante.size(), 
      visitante);

    System.out.println(mandante);
    for (String item : golsMandante) {
      System.out.printf(item + " gols da partida ");
    }

    System.out.printf("\n\n" + visitante + "\n");
    for (String item : golsVisitante) {
      System.out.printf(item + " gols da partida ");
    }
    
  }

}

