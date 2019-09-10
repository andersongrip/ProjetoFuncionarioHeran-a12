
package modelo.Principal;


public class Gerente extends Funcionario{
    private String setor;
    private String senha;

    public Gerente (){
    }
    
    public Gerente(String setor, String senha, String nome, double salario, String cpf) {
        super(nome, salario, cpf);
        this.setor = setor;
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String getInformacao(){
        return "Gerente: " + this.nome + "Recebe " + this.salario;
        
    }
    @Override
    public double getBonificacao(){
        return this.salario * 0.15;
    }
    public boolean getAutenticacao(String senha){
        if (this.senha.equals(senha)){
            System.out.println("Acesso permitido! ");
            return true;
        }
        else {
            System.out.println("Acesso negado! ");
            return false;
        }
    }
}

