import java.time.LocalDate;
import java.util.ArrayList;

public class Artigo extends Publicacao{
    private String resumo;
    
  public Artigo(String titulo, LocalDate dataPublicacao, ArrayList<Publicacao> referencias, ArrayList<Autor> autores, String resumo) {
    super(titulo, dataPublicacao, referencias, autores);
    this.resumo = resumo;
  }

  public String getResumo() {
    return this.resumo;
  }

  public void setResumo(String resumo) {
    this.resumo = resumo;
  }

}  

