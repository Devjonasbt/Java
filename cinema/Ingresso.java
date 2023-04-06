package cinema;
public class Ingresso {
    private String filme;
    private String horario;
    private String data;
    private String assento;
    private int codigo;
    private double valor;
  
    public String getFilme() {
      return this.filme;
    }
  
    public String getHorario() {
      return this.horario;
    }
  
    public String getData() {
      return this.data;
    }
  
    public String getAssento() {
      return this.assento;
    }
  
    public int getCodigo() {
      return this.codigo;
    }
  
    public double getValor() {
      return this.valor;
    }
  
    public void setFilme(String nome) {
      this.filme = nome;
    }
  
    public void setHorario(String horario) {
      this.horario = horario;
    }
  
    public void setData(String data) {
      this.data = data;
    }
  
    public void setAssento(String assento) {
      this.assento = assento;
    }
  
    public void setCodigo(int codigo) {
      this.codigo = codigo;
    }
  
    public void setValor(double valor) {
      this.valor = valor;
    }
  
    public void exibirIngresso() {
      System.out.printf("|||---------------------|\n");
      System.out.printf("||  %s |\n", String.format("%-19s", "Filme: "+this.filme));
      System.out.printf("||  %s |\n", String.format("%-19s", "Código: " + this.codigo));
      System.out.printf("||  %s |\n", String.format("%-19s", "Dia: "+this.data));
      System.out.printf("||  %s |\n", String.format("%-19s", "Horario: " + this.horario));
      System.out.printf("||  %s |\n", String.format("%-19s", "Assento "+this.assento));
      System.out.printf("||  %s |\n", String.format("%-19s", "Valor - R$ " + this.valor));
      System.out.printf("|||---------------------|\n");
    }
  
  }