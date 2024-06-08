package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    Map<String, String> palavrasMap;

    //construtor
    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    //métodos
    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!(palavrasMap.isEmpty())){
            if(palavrasMap.containsKey(palavra)) {
                palavrasMap.remove(palavra);
            } else {
                System.out.println("Palavra inexistente!");
            }
        } else {
            System.out.println("Dicionario vazio!");
        }
    }

    public void exibirPalavras() {
        if(!(palavrasMap.isEmpty())){
            System.out.println(palavrasMap);
        } else {
            System.out.println("Dicionario vazio!");
        }
    }

    public void pesquisarPorPalavra(String palavra) {
        if(!(palavrasMap.isEmpty())){
            if(palavrasMap.containsKey(palavra)) {
                System.out.println(palavrasMap.get(palavra));
            } else {
                System.out.println("Palavra inexistente!");
            }
        } else {
            System.out.println("Dicionario vazio!");
        }
    }

    public static void main(String[] args) {
        //instanciando objeto do tipo Dicionario
        Dicionario dicionario = new Dicionario();

        //exibir itens do dicionário
        dicionario.exibirPalavras();

        //adicionando palavras ao dicionário
        dicionario.adicionarPalavra("Lutar", "bater-se (com ou sem armas); brigar, combater, pelejar, pujar.");
        dicionario.adicionarPalavra("Vencer", "obter vitória ou triunfo (sobre); derrotar.");
        dicionario.adicionarPalavra("Jogar", "praticar (desporto).");
        dicionario.adicionarPalavra("Enriquecer", "Tornar-se rico; adquirir fortuna.");

        //exibir itens do dicionário
        dicionario.exibirPalavras();

        //pesquisando por palavra
        dicionario.pesquisarPorPalavra("Negligenciar");
        dicionario.pesquisarPorPalavra("Vencer");

        //removendo palavra
        dicionario.removerPalavra("Aguar");
        dicionario.removerPalavra("Jogar");

        //exibir itens do dicionário
        dicionario.exibirPalavras();
    }
}
