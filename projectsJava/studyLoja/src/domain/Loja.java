package domain;

import domain.cliente.Cliente;
import domain.produto.Produto;
import domain.venda.Venda;
import domain.vendedor.Vendedor;

public class Loja {
    private Cliente[] clientes;
    private Vendedor[] vendedores;
    private Produto[] produtos;
    private Venda[] vendas;

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Venda[] getVendas() {
        return vendas;
    }

    public void setVendas(Venda[] vendas) {
        this.vendas = vendas;
    }

}
