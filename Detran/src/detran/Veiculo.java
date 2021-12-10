package detran;
public class Veiculo {
 
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private String tipo;  // caminnhao onibus, etc
    protected CRLV crlv;
    
     @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nVeiculo [Placa=");
        builder.append(placa);   
        builder.append(", marca=");
        builder.append(marca);   
         builder.append(", modelo=");
        builder.append(modelo);  
         builder.append(", ano=");
        builder.append(ano);  
        builder.append(crlv);  
        builder.append("]");
        return builder.toString();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public CRLV getCrlv() {
        return crlv;
    }

    public void setCrlv(CRLV crlv) {
        this.crlv = crlv;
    }
    
    
}
