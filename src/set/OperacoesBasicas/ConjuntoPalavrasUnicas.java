package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    Set<String> palavrasUnicas;

    //construtor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavraRemover) {
        if(!(palavrasUnicas.isEmpty())) {
            for(String palavra : palavrasUnicas) {
                if(palavra == palavraRemover) {
                    palavrasUnicas.remove(palavra);
                }
            }
        } else {
            System.out.println("Conjunto vazio!");
        }
    }

    public void verificarPalavra(String palavraAVerificar) {
        int existe = 0;
        if(!(palavrasUnicas.isEmpty())) {
            for(String palavra : palavrasUnicas) {
                if(palavra == palavraAVerificar) {
                    System.out.println("A palavra existe no conjunto!");
                    existe++;
                    break;
                }
            }
        } else {
            System.out.println("Conjunto vazio!");
        }
        if(existe == 0) {
            System.out.println("A palavra não existe no conjunto!");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavrasUnicas, that.palavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavrasUnicas);
    }

    public static void main(String[] args) {
        //atributo
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        //exibindo palavras
        conjuntoPalavras.exibirPalavrasUnicas();

        //adicionando palavras
        conjuntoPalavras.adicionarPalavra("Bola");
        conjuntoPalavras.adicionarPalavra("Bola");
        conjuntoPalavras.adicionarPalavra("Colher");
        conjuntoPalavras.adicionarPalavra("PC");
        conjuntoPalavras.adicionarPalavra("Mouse");
        conjuntoPalavras.adicionarPalavra("Dry");
        conjuntoPalavras.adicionarPalavra("Pipe");

        //exibindo palavras
        conjuntoPalavras.exibirPalavrasUnicas();

        //pesquisando palavra
        conjuntoPalavras.verificarPalavra("Eclipse");
        conjuntoPalavras.verificarPalavra("Pipe");

        //removendo palavra
        conjuntoPalavras.removerPalavra("Bola");

        //exibindo palavras
        conjuntoPalavras.exibirPalavrasUnicas();
    }
}
