
public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private boolean eespecial;
    private int qtdEmprestimo;

    public Usuario(String nome, String telefone, String email, String cpf, boolean eespecial, int qtdEmprestimo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.eespecial = eespecial;
        this.qtdEmprestimo = qtdEmprestimo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isEespecial() {
        return eespecial;
    }

    public void setEespecial(boolean eespecial) {
        this.eespecial = eespecial;
    }

    public void usuarioEspecial(){
        this.eespecial = true;
    }
    
    public void usuarioComum(){
        this.eespecial = false;
    }
    
    public int getQtdEmprestimo() {
        return this.qtdEmprestimo;
  }

    public void setQtdEmprestimo(int qtdEmprestimo){
        this.qtdEmprestimo = qtdEmprestimo;
  }
    
    public void novoEmprestimo(){
        this.qtdEmprestimo++;
    }
    
    public void devolveEmprestimo(){
        this.qtdEmprestimo--;
    }
}
