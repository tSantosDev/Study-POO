package domain.vendedor;

import domain.Loja;

import java.util.Objects;

public class ImprimirRelatorioVendedor {
    public void imprimeRelatorioTodosVendedores(Loja loja){
        if (loja.getVendedores() == null) {
            System.out.println("Não existe vendedores cadastrados na loja");
            return;
        }
        System.out.println("-------Relatório dos Vendedores-------");
        for(Vendedor vendedor : loja.getVendedores()){
            vendedor.calculaComissao();
            System.out.println("Nome:" + vendedor.getNome());
            System.out.println("Valor das vendas: " + vendedor.getValorVendas());
            System.out.println("Comissão: " + vendedor.getComissao());
            System.out.println("----------------------------------");
        }
    }

    public void imprimeRelatorioVendedorEspecifico(Vendedor vendedor, Loja loja) {
        Vendedor [] vendedores = loja.getVendedores();
        if (vendedores == null) {
            System.out.println("O vendedor(a) " + vendedor.getNome() + " não está registrado na loja");
            return;
        }
        for (int i = 0; i < vendedores.length; i++) {
            if (Objects.equals(vendedores[i].getNome(), vendedor.getNome())) {
                vendedor.calculaComissao();
                System.out.println("-------Relatório do Vendedor(a) " + vendedor.getNome() + "-------");
                System.out.println("Nome:" + vendedor.getNome());
                System.out.println("Comissão: " + vendedor.getComissao());
                System.out.println("Salário Total: " + vendedor.getSalarioTotal());
                System.out.println("----------------------------------");
            }
        }
    }
}
