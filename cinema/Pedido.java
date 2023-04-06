package cinema;


public class Pedido {
    private String filme;
    private boolean meia;
    private String horario;
    private String data;
    private String assento;
  
    public String getFilme() {
      return this.filme;
    }
  
    public boolean getMeia() {
      return this.meia;
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
  
    public void setFilme(String filme) {
      this.filme = filme;
    }
  
    public void setMeia(boolean meia) {
      this.meia = meia;
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
  
  }