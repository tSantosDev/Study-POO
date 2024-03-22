package domain.cliente;

import domain.Loja;
public class ImprimirRelatorioClientesCadastrados {
    public void imprimeClientesCadastrados(Loja loja) {
        if (loja.getClientes() == null) {
            System.out.println("Não existe clientes cadastrados na loja");
            return;
        }
        System.out.println("-------Relatório dos Clientes-------");
        for (Cliente cliente : loja.getClientes()) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("----------------------------------");
        }
    }
}
