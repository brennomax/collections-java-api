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
        List<Item> itemRemovidoDoCarrinho = new ArrayList<>();
        if(!carrinhoDeCompras.isEmpty()) {
            for (Item item : carrinhoDeCompras) {
                if(item.getNome().equalsIgnoreCase(nome)) {
                    itemRemovidoDoCarrinho.add(item);
                }
            }
        } else {
            System.out.println("O carrinho está vazio!");
        }
    }

    //Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if(!carrinhoDeCompras.isEmpty()) {
            for(Item item : carrinhoDeCompras) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
        } else {
            System.out.println("O carrinho está vazio!");
        }
        return valorTotal;
    }

    //Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    public void exibirItens() {
        if(!carrinhoDeCompras.isEmpty()) {
            for(Item item : carrinhoDeCompras) {
                System.out.println(this.carrinhoDeCompras);
            }
        } else {
            System.out.println("O carrinho está vazio!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras = " + carrinhoDeCompras;
    }

    public static void main(String[] args) {
        //instancia carrinho1 de CarrinhoDeCompras
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();

        //adicionando itens ao carrinho
        carrinho1.adicionarItem("Frango", 15.76d, 1);
        carrinho1.adicionarItem("Frango", 12d, 5);
        carrinho1.adicionarItem("Achocolatado", 7.5d, 2);
        carrinho1.adicionarItem("Leite", 4d, 4);

        //exibindo os itens no carrinho
        carrinho1.exibirItens();

        //removendo um item do carrinho
        carrinho1.removerItem("Frango");

        //exibindo os itens atualizados no carrinho
        carrinho1.exibirItens();

        //calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinho1.calcularValorTotal());
    }
}