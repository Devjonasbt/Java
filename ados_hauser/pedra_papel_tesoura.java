package ados_Hauser;
import java.util.*;
class pedra_papel_tesoura {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    funMain();
    String usuario = ler.next();
    String bot = rand();
    String jogo = funComparar(usuario,bot);
    System.out.println("Joo-kenn-poo!\n");
    System.out.println("Play "+usuario+" x "+bot+" Maquina");
    System.out.println(jogo);
  }
  public static String funComparar(String jog, String bot){
    String msg ="";
    if(jog.equalsIgnoreCase(bot)){ // se a resposta da maquinha for a mesma da maquinha vai da empate
      msg = "Empate";
    }
    else if((jog.equalsIgnoreCase("papel"))&&(bot.equalsIgnoreCase("pedra"))){
      msg = "Jogador venceu!";
    }else if((jog.equalsIgnoreCase("tesoura"))&&(bot.equalsIgnoreCase("papel"))){
      msg = "Jogador venceu!";
    }else if((jog.equalsIgnoreCase("pedra"))&&(bot.equalsIgnoreCase("tesoura"))){
      msg = "Jogador venceu!";
    }else{
      msg = " Maquina venceu";
    }  return msg;
  } 
  public static String rand(){ // resultado da escolha da maquinha
    Random alt = new Random();
    int bot =alt.nextInt(3);
    String msg ="";
   if(bot==1){
     msg = "pedra";
    }  else if(bot==2){
      msg = "papel";
    } else{
      msg = "tesoura";
    }return msg;
  }
  public static void funMain(){
    System.out.println(" ");
    System.out.println("=====================================");
    System.out.println("===== Pedra    papel   tesoura ======");
    System.out.println("=====================================\n");
    System.out.println("Qual voce escolhe?");
  }
}