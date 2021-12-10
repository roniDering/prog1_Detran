package detran;
public class CRLV {
    private String combustivel;
    private String local;
    private String renavam;

    public String getCombustivel() {
        return combustivel;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nCRLV [Combustivel=");
        builder.append(combustivel);   
        builder.append(", local=");
        builder.append(local);   
         builder.append(", renavam=");
        builder.append(renavam);  
        builder.append("]");
        return builder.toString();
    }
    
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    
}
 
