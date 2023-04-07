package ados_Hauser;

import java.util.*;
class vendasLojas {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    String recbVendedor, vendedor;
    int pos = 1;
    double salario,total=0,valor=0,recb;
    double maior=0, menor=0;
    String[] vend = new String[3];
    double[] vendas = new double[3];
    double[] com = new double[3];
    System.out.println("Calculo da vendas\n");
    System.out.println("===========================================");
    System.out.println("digite a quantidade de vendedores ");
    int quant = ler.nextInt();

    for (int i = 0; i < quant; i++) {
      System.out.println("Digite o " + (i + 1) + "° vendedor");
      vendedor = ler.next();
      System.out.println("\n"+vendedor+" Digite o Valor do seu salario:");
      salario = ler.nextDouble();
      System.out.println("Valor total das vendas:");
      vendas[i] = ler.nextDouble();
      System.out.println("Digite as porcentagem da comissão");
      com[i] = ler.nextDouble();
      valor = (vendas[i] * com[i])/100;
      recb = valor+salario;
      System.out.println("\n"+vendedor+" Recebera "+valor+"$ De comissão");
      System.out.println("Seu salrio sera "+recb+"$\n");
      tela();
      total += vendas[i];

      maior = funMaior(vendas);
      menor = funMenor(vendas);
      
    }       
    System.out.println("O total de vendas de todos os vendedores é: "+total);
    System.out.println("Maior quantidades de vendas: "+maior);
    System.out.println("Menor quantidade de vendas: "+menor);
  }
  public static String vendedor(String ve, int tam){
    String ver = " ";
    for(int i=0;i<tam;i++){
      ver=" "+ve;
    } return ver;
  }
  public static double funMenor(double[] vend1){
    double menor=999999999;
    double pos;
    for(double i:vend1){
      if(i<menor){
        menor = i;
      }
    }  return menor;
  }
  public static double funMaior(double[] vend2){
    double maior=0;
    
    for(double i:vend2){
      if(i>maior){
        maior = i; 
      }
    } return maior;
  }
  public static void tela() {
    System.out.print("\n\n precione < entre > para limpar tela.");
    new Scanner(System.in).nextLine();
    System.out.print("\033[H\033[\2J");
    System.out.flush();
  }
}
