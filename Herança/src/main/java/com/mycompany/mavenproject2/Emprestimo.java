import java.time.LocalDate;
import java.time.Period;

public class Emprestimo {
  private Usuario usuario;
  private Publicacao publicacao;
  private LocalDate dataInicio;
  private LocalDate dataPossivelE;
  private LocalDate dataEntrega;
  private double multa;
  private int qtdRenovacao;
    
    public Emprestimo(Usuario usuario, Publicacao publicacao){
    if((!usuario.isEespecial()&& usuario.getQtdEmprestimo() == 0) || usuario.isEspecial()){
      if(publicacao.isDisponivel()){
        this.usuario = usuario;
        this.publicacao = publicacao;
        this.dataInicio = LocalDate.now();
        this.dataPossivelE = this.dataInicio.plusDays(7);
        this.multa = 0;
        this.qtdRenovacao = 0;

        this.publicacao.emprestar();
        this.usuario.novoEmprestimo();
      }else{
        throw new IllegalArgumentException();
      }
    }else{
      throw new IllegalArgumentException();
    }
  }
    
   public void renovar(){
    LocalDate dataHoje = LocalDate.now();
    if(!dataHoje.isAfter(this.dataPossivelE)){
      if(this.qtdRenovacao < 3){
        this.qtdRenovacao++;
        this.dataPossivelE = dataHoje.plusDays(7);
      }
    }
  }

  public void devolver(Emprestimo emp){
    this.publicacao.devolver();
    this.usuario.devolveEmprestimo();
    this.dataEntrega = LocalDate.now();
    calcularMulta();
  }

  public void calcularMulta(){
    if(dataEntrega.isAfter(dataPossivelE)){
      Period periodo = Period.between(dataEntrega, dataPossivelE);
      int diasAtraso = Math.abs(periodo.getDays());

      this.multa = diasAtraso * this.publicacao.getValorMulta();
    }
  }

}
