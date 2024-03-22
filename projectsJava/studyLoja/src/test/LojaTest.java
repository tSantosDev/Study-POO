package test;

import domain.vendedor.*;
import domain.cliente.*;
import domain.venda.*;
import domain.produto.*;
import domain.Loja;

public class LojaTest {
    public static void main(String[] args) {
        ImprimirRelatorioVendedor impressoraRelatorioVendedores = new ImprimirRelatorioVendedor();
        ImprimirRelatorioClientesCadastrados impressoraRelatorioCliente = new ImprimirRelatorioClientesCadastrados();
        ImprimirRelatorioVendas impressoraRelatorioVendas = new ImprimirRelatorioVendas();

        Vendedor vendedor01 = new Vendedor("Carlos");
        Vendedor vendedor02 = new Vendedor("Nicolly");

        Produto produto01 = new Produto("Geladeira", 3500.00);
        Produto produto02 = new Produto("Monitor", 950);

        Cliente cliente01 = new Cliente("André", 43);
        Cliente cliente02 = new Cliente("Amanda", 24);

        Venda venda01 = new Venda();
        Venda venda02 = new Venda();
        Venda venda03 = new Venda();
        Venda venda04 = new Venda();

        Loja loja = new Loja();

        loja.setVendedores(new Vendedor[]{vendedor01, vendedor02});
        loja.setClientes(new Cliente[]{cliente01, cliente02});
        loja.setProdutos(new Produto[]{produto01, produto02});
        loja.setVendas(new Venda[]{venda01, venda02, venda03, venda04});

        venda01.registraVenda(cliente01, produto02, vendedor02);
        venda02.registraVenda(cliente02, produto01, vendedor01);
        venda03.registraVenda(cliente01, produto01, vendedor01);
        venda04.registraVenda(cliente02, produto02, vendedor02);

        vendedor01.setValorVendas(venda02.getValorVenda());
        vendedor01.setValorVendas(venda03.getValorVenda());
        vendedor02.setValorVendas(venda01.getValorVenda());
        vendedor02.setValorVendas(venda04.getValorVenda());


        impressoraRelatorioCliente.imprimeClientesCadastrados(loja);
        System.out.println("**********************************");
        impressoraRelatorioVendedores.imprimeRelatorioTodosVendedores(loja);
        impressoraRelatorioVendedores.imprimeRelatorioVendedorEspecifico(vendedor01, loja);
        impressoraRelatorioVendedores.imprimeRelatorioVendedorEspecifico(vendedor02, loja);
        System.out.println("**********************************");
        impressoraRelatorioVendas.imprimeRelatorioVendas(loja);
        impressoraRelatorioVendas.imprimeRelatorioVendasVendedorEspecifico(vendedor01, loja);
        impressoraRelatorioVendas.imprimeRelatorioVendasVendedorEspecifico(vendedor02, loja);

    }
}
