package detran;

import java.util.Scanner;

public class Condutor extends CNH {

    Scanner s = new Scanner(System.in);

    private boolean permissao = true; //começa assim, se chegar em 20 pontos isso muda!
    private double valorMulta = 0;
    protected Veiculo veiculo;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nCondutor [permissao=");
        builder.append(permissao);
        builder.append(", Valor Multa: R$");
        builder.append(valorMulta);
        builder.append("");
        builder.append(veiculo);
        builder.append(super.toString());  //CNH
        builder.append("]");
        return builder.toString();
    }

    public boolean ganharMulta() {
        System.out.println("Escolha a infração:");
        System.out.println(" Gravissima = 7"
                + "\n Grave = 5"
                + "\n Media = 4"
                + "\n Leve = 3");
        int a = s.nextInt();

        switch (a) {
            case 7:
                this.setMultas(this.getMultas() + 1);
                this.setValorMulta(this.getValorMulta() + 293.47);
                this.setPontos(this.getPontos() + a);  //fiz em todos pq se o user escrevesse errado nao teria outra verif.
                System.out.println("Você agora possui: " + this.getPontos() + " pontos na carteira");
                this.statusCarteira();
                return true;
            case 5:
                this.setMultas(this.getMultas() + 1);
                this.setValorMulta(this.getValorMulta() + 195.23);
                this.setPontos(this.getPontos() + a);
                System.out.println("Você agora possui: " + this.getPontos() + " pontos na carteira");
                this.statusCarteira();
                return true;
            case 4:
                this.setMultas(this.getMultas() + 1);
                this.setValorMulta(this.getValorMulta() + 130.16);
                this.setPontos(this.getPontos() + a);
                System.out.println("Você agora possui: " + this.getPontos() + " pontos na carteira");
                this.statusCarteira();
                return true;
            case 3:
                this.setMultas(this.getMultas() + 1);
                this.setValorMulta(this.getValorMulta() + 88.38);
                this.setPontos(this.getPontos() + a);
                System.out.println("Você agora possui: " + this.getPontos() + " pontos na carteira");
                this.statusCarteira();
                return true;
            default:
                System.out.println("Dado Incorreto: ERRO");
                return false;
        }
    }

    public boolean pagarMulta(double valor) {
        System.out.println("--");
        if (valor > 0 && valor < this.getValorMulta()) { //nao pode pagar mais do que tem de divida

            System.out.println("Sua multa era de: R$" + this.getValorMulta());
            this.setValorMulta(this.getValorMulta() - valor);
            System.out.println("Agora é de: " + this.getValorMulta());
            return true;
        } else {
            System.out.println("Valor Incorreto");
            return false;
        }
    }

    public boolean passarAno(int valor) {
        System.out.println("--");
        this.statusCarteira();
        if (valor > 0) {
            System.out.println("Passaram " + valor + " anos");

            this.setPontos(0);
            if (this.getValorMulta() != 0) {  //juros apenas pra quem tem multa
                this.setValorMulta(this.getValorMulta() * 1.1); //juros 10% p ano
            }
            return true;
        }
        return false;
    }

    public boolean statusCarteira() {
        if (this.getPontos() >= 20 || this.getMultas() != 0) {
            this.setPermissao(false);
        } else {
            this.setPermissao(true);
        }
        return true;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public boolean getPermissao() {
        return permissao;
    }

    public void setPermissao(boolean permissao) {
        this.permissao = permissao;
    }

}
