package detran;
public class CNH  {
    
    protected Dados dados;
    private int pontos =0;
    private String estado;  
    private int multas=0;
    
    
      //toString 
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nCNH [pontos=");
        builder.append(pontos);
        builder.append(", Multas=");
        builder.append(multas);
        builder.append(", Estado=");
        builder.append(estado);
        builder.append(dados);
        builder.append("]");
        return builder.toString();
    }

    
    
    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getMultas() {
        return multas;
    }

    public void setMultas(int multas) {
        this.multas = multas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
