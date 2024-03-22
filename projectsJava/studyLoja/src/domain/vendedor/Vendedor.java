package domain.vendedor;

public class Vendedor {
    private String nome;
    private static double salarioFixo = 1200;
    private double valorVendas;
    private double comissao;
    private double salarioTotal;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public void calculaComissao() {
        this.comissao = valorVendas * 0.10;
    }

    public void calculaSalarioTotal() {
        this.salarioTotal = Vendedor.salarioFixo + this.comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas += valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public double getSalarioTotal() {
        return comissao + salarioFixo;
    }
}
