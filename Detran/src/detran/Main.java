package detran;

public class Main {

    public static void main(String[] args) {

        System.out.println("Dados PRIMEIRA pessoa: \n");
        
        CRLV crlv1 = new CRLV();
        crlv1.setCombustivel("Gasolina");
        crlv1.setLocal("Rio do Sul");
        crlv1.setRenavam("912841221");
        
        Dados d1 = new Dados();
        d1.setNome("Ronaldo");
        d1.setCpf("101.201.301-01");

        Veiculo vei1 = new Veiculo();
        vei1.setPlaca("BRS1A90");
        vei1.setMarca("Hiunday");
        vei1.setModelo("Hb20");
        vei1.setAno(2019);
        vei1.setCrlv(crlv1);

        Condutor con1 = new Condutor();
        con1.setVeiculo(vei1);
        con1.setEstado("SC");
        con1.setDados(d1);
        // System.out.println(con1);
        System.out.println("\n-----\n");

        //-------------------------
        System.out.println("Dados SEGUNDA pessoa: \n");

        CRLV crlv2 = new CRLV();
        crlv2.setCombustivel("Etanol");
        crlv2.setLocal("Ibirama");
        crlv2.setRenavam("2143562");
        
        Dados d2 = new Dados();
        d2.setNome("Debora");
        d2.setCpf("202.302.402-22");

        Veiculo vei2 = new Veiculo();
        vei2.setPlaca("BRA5S12");
        vei2.setMarca("Honda");
        vei2.setModelo("Civic");
        vei2.setAno(2020);
        vei2.setCrlv(crlv2);

        Condutor con2 = new Condutor();
        con2.setVeiculo(vei2);
        con2.setEstado("SP");
        con2.setDados(d2);
        // System.out.println(con2);
        System.out.println("\n-----\n");

        //-------------------------
        System.out.println("Dados TERCEIRA pessoa: \n");

        CRLV crlv3 = new CRLV();
        crlv3.setCombustivel("Diesel");
        crlv3.setLocal("Blumenau");
        crlv3.setRenavam("912841221");
        
        Dados d3 = new Dados();
        d3.setNome("Zeca");
        d3.setCpf("303.403.503-33");

        Veiculo vei3 = new Veiculo();
        vei3.setPlaca("BRA9S11");
        vei3.setMarca("Scania");
        vei3.setModelo("V8");
        vei3.setAno(1999);

        Condutor con3 = new Condutor();
        con3.setVeiculo(vei3);
        con3.setEstado("RJ");
        con3.setDados(d3);
        // System.out.println(con3);
        System.out.println("\n-----\n");

        // TESTANDO AS FUNÇÕES:
        con1.ganharMulta();
        con1.ganharMulta();
        con1.ganharMulta();
        System.out.println(con1);
        con1.passarAno(5); //passaram 5 anos e a multa aumentou
        System.out.println(con1);
        con1.pagarMulta(900);  //dependendo o valor da multa da erro
    }

}
