package domain.venda;

import domain.cliente.Cliente;
import domain.produto.Produto;
import domain.vendedor.Vendedor;

public class Venda {
    private String nomeCliente;
    private String nomeProduto;
    private String nomeVendedor;
    private double valorVenda;

    public void registraVenda(Cliente cliente, Produto produto, Vendedor vendedor) {
        this.nomeCliente = cliente.getNome();
        this.nomeProduto = produto.getNome();
        this.nomeVendedor = vendedor.getNome();
        this.valorVenda = produto.getPreco();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
