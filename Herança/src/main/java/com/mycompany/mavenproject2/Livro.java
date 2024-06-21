import java.time.LocalDate;
import java.util.ArrayList;

public class Livro extends Publicacao{
    private int edicao;
    private String editora;
    private String isbn;

    public Livro(String titulo, LocalDate dataPublicacao, ArrayList<Publicacao> referencias, ArrayList<Autor> autores, int edicao, String editora, String isbn) {
    super(titulo, dataPublicacao, referencias, autores);
    this.edicao = edicao;
    this.editora = editora;
    this.isbn = isbn;
  }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
}
