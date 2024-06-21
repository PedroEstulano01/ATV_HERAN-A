import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Publicacao {
    private String titulo;
    private LocalDate dataPublicacao;
    private ArrayList<Publicacao> referencias;
    private ArrayList<Autor> autores;
    private boolean disponivel;
    private double valorMulta;

    public Publicacao(String titulo, LocalDate dataPublicacao, ArrayList<Publicacao> referencias, ArrayList<Autor> autores, double multa) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.referencias = referencias;
        this.autores = autores;
        this.disponivel = true;
        this.valorMulta = multa;
    }
    
  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public LocalDate getDataPublicacao() {
    return this.dataPublicacao;
  }

  public void setDataPublicacao(LocalDate dataPublicacao) {
    this.dataPublicacao = dataPublicacao;
  }

  public ArrayList<Publicacao> getReferencias() {
    return this.referencias;
  }

  public void setReferencias(ArrayList<Publicacao> referencias) {
    this.referencias = referencias;
  }

  public boolean addAutor(Autor autor){
    return this.autores.add(autor);
  }

  public boolean removeAutor(Autor autor){
    return this.autores.remove(autor);
  }

  public ArrayList<Autor> getAutores() {
    return this.autores;
  }

  public void setAutores(ArrayList<Autor> autores) {
    this.autores = autores;
  }

  public boolean isDisponivel() {
    return this.disponivel;
  }

  public boolean getDisponivel() {
    return this.disponivel;
  }

  public void setDisponivel(boolean disponivel) {
    this.disponivel = disponivel;
  }

  public void emprestar(){
    this.disponivel = false;
  }

  public void devolver(){
    this.disponivel = true;
  }
  
  public double getValorMulta() {
    return this.valorMulta;
  }

  public void setValorMulta(double valorMulta) {
    this.valorMulta = valorMulta;
  }
  
}    
    