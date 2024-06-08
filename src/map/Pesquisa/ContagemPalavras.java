package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributo
    Map<String, Integer> conjuntoPalavrasMap;

    //construtor
    public ContagemPalavras() {
        this.conjuntoPalavrasMap = new HashMap<>();
    }

    //métodos
    public void adicionarPalavra(String palavra, Integer contagem) {
        conjuntoPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!(conjuntoPalavrasMap.isEmpty())) {
            if(conjuntoPalavrasMap.containsKey(palavra)){
                conjuntoPalavrasMap.remove(palavra);
            } else {
                System.out.println("Palavra inexistente!");
            }
        } else {
            System.out.println("Conjunto vazio!");
        }
    }

    public void exibirContagemPalavras() {
        if(!(conjuntoPalavrasMap.isEmpty())) {
            System.out.println(conjuntoPalavrasMap);
        } else {
            System.out.println("Conjunto vazio!");
        }
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : conjuntoPalavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        //insntanciando um objeto do tipo ContagemPalavras
        ContagemPalavras palavras = new ContagemPalavras();

        //adicionando palavras
        palavras.adicionarPalavra("Ótimo", 5);
        palavras.adicionarPalavra("Abençoado", 100000);
        palavras.adicionarPalavra("Vitorioso", 14552);
        palavras.adicionarPalavra("Justo", 15000);

        //exibindo palavras e contagens
        palavras.exibirContagemPalavras();

        //exibindo palavra com maior contagem
        System.out.println("Palavra mais mencionada: " + palavras.encontrarPalavrasMaisFrequente());

        //removendo palavra
        palavras.removerPalavra("Amém");
        palavras.removerPalavra("Justo");

        //exibindo palavras e contagens
        palavras.exibirContagemPalavras();
    }
}
