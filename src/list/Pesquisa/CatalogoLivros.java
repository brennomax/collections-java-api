package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livrosList = new ArrayList<>();

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor( String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarLivrosPorIntervaloDeAno (int anoInicial, int anoFinal) {
        List<Livro> pesquisaPorAno = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for(Livro l : livrosList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    pesquisaPorAno.add(l);
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }
        return pesquisaPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        // instanciando um objeto do tipo CatalogoDeLivros
        CatalogoLivros listaDeLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        listaDeLivros.adicionarLivros("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        listaDeLivros.adicionarLivros("Java Guia do Programador", "Peter Jandl Junior", 2021);
        listaDeLivros.adicionarLivros("Código Limpo", "Robert C. Martin", 2009);
        listaDeLivros.adicionarLivros("O Codificador Limpo", "Robert C. Martin", 2012);

        // Exibindo livros pelo mesmo autor
        System.out.println(listaDeLivros.pesquisarPorAutor("Robert C. Martin"));

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(listaDeLivros.pesquisarPorAutor("Autor Inexistente"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println(listaDeLivros.pesquisarLivrosPorIntervaloDeAno(2010, 2022));

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(listaDeLivros.pesquisarLivrosPorIntervaloDeAno(2025, 2030));

        // Exibindo livros por título
        System.out.println(listaDeLivros.pesquisarPorTitulo("Java Guia do Programador"));

        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(listaDeLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
