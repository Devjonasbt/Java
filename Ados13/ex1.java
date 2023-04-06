package Ado13;
import java.util.Scanner;
class ex1 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);  
    System.out.println("<<<<<< Tarefas >>>>>\n");
    System.out.println("Informe a quantidade de tarefas");
    int qtd = ler.nextInt();
    String[] arr = new String[qtd];
    String[] tarefas = funExibir(arr);
    contador(tarefas); 
  }
  public static String[] funExibir(String[] tarefas){
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite suas tarefas");
    for(int i = 0; i< tarefas.length;i++){
      tarefas[i] = ler.next();
      if(tarefas[i].equalsIgnoreCase("Sair")){
        break;
      }
    }
    return tarefas;
  }
  public static void contador(String[] nomes){
    Scanner ler = new Scanner(System.in);
    for(int i=0; i<nomes.length;i++){
      if(nomes[i].equalsIgnoreCase("Sair")){
        break;
      }
      System.out.println((i+1)+". "+nomes[i]);
    }
  }
  
}