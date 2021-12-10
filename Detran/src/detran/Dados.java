package detran;
public class Dados {
    
    private String cpf;
    private String nome;
    
      //toString
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nDados [cpf=");
        builder.append(cpf);
        builder.append(", Nome=");
        builder.append(nome);
        builder.append("]");
        return builder.toString();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    
}
