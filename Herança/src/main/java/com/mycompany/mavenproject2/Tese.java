import java.time.LocalDate;
import java.util.ArrayList;

public class Tese extends Publicacao {
   private int nPaginas;
   private String resumo;
   private LocalDate dataDefesa;
   private String instituicao;
   
   public Tese(String titulo, LocalDate dataPublicacao, ArrayList<Publicacao> referencias, int nroPaginas, String resumo, LocalDate dataDefesa, String instituicao){
    super(titulo, dataPublicacao, referencias, new ArrayList<Autor>());
    this.nPaginas = nPaginas;
    this.resumo = resumo;
    this.dataDefesa = dataDefesa;
    this.instituicao = instituicao;
  }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public LocalDate getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(LocalDate dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
   
    @Override
    public boolean addAutor(Autor autor) {
    if(this.getAutores().size() == 0)
      return super.addAutor(autor);
    return false;
  }
}

