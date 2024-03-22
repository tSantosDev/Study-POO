package domain.venda;


import domain.Loja;
import domain.vendedor.Vendedor;

import java.util.Objects;

public class ImprimirRelatorioVendas {
    public void imprimeRelatorioVendas(Loja loja) {
        if (loja.getVendas() == null) {
            System.out.println("Não existe vendas cadastradas");
            return;
        }
        System.out.println("-------Relatório de Vendas-------");
        for (Venda venda : loja.getVendas()) {
            System.out.println("Produto: " + venda.getNomeProduto());
            System.out.println("Valor da venda: " + venda.getValorVenda());
            System.out.println("Nome do Vendedor: " + venda.getNomeVendedor());
            System.out.println("Nome do Cliente: " + venda.getNomeCliente());
            System.out.println("----------------------------------");
        }
    }

    public void imprimeRelatorioVendasVendedorEspecifico(Vendedor vendedor, Loja loja) {
        Venda [] vendas = loja.getVendas();
        if (vendas == null) {
            System.out.println("Nao existe registro de vendas para o vendedor(a) " + vendedor.getNome());
            return;
        }
        System.out.println("-------Relatório das Vendas do Vendedor(a) " + vendedor.getNome() + "-------");
        for (int i = 0; i < vendas.length; i++) {
            if (Objects.equals(vendedor.getNome(), vendas[i].getNomeVendedor())) {
                System.out.println("Produto: " + vendas[i].getNomeProduto());
                System.out.println("Valor da venda: " + vendas[i].getValorVenda());
                System.out.println("----------------------------------");
            }
        }
    }
}
