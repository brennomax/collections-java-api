package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributro do tipo Item
    List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    //Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.carrinhoDeCompras.add(item);
    }

    //Remove um item do carrinho com base no seu nome.
    public void removerItem(String nome) {

    }

    //Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public double calcularValorTotal() {
        return;
    }

    //Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    public void exibirItens() {

    }
}
