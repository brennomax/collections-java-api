package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    Set<Tarefa> tarefasSet;

    //construtor
    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    //métodos
    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if(!(tarefasSet.isEmpty())){
            for(Tarefa c : tarefasSet) {
                if(c.getDescricao() == descricao) {
                    tarefaRemover = c;
                    break;
                }
            }
            if(tarefaRemover == null) {
                System.out.println("Tarefa não encontrada!");
            }
            tarefasSet.remove(tarefaRemover);
        } else {
            System.out.println("O conjunto de tarefas está vazio!");
        }
    }

    public void exibirTarefas() {
        if(!(tarefasSet.isEmpty())){
            System.out.println(tarefasSet);
        } else {
            System.out.println("O conjunto de tarefas está vazio!");
        }
    }

    public void contarTarefas() {
        if(!(tarefasSet.isEmpty())){
            System.out.println("O número de tarefas é " + tarefasSet.size());
        } else {
            System.out.println("O conjunto de tarefas está vazio!");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!(tarefasSet.isEmpty())){
            for(Tarefa t : tarefasSet) {
                if(t.getConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("O conjunto de tarefas está vazio!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!(tarefasSet.isEmpty())){
            for(Tarefa t : tarefasSet) {
                if(!t.getConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
        } else {
            System.out.println("O conjunto de tarefas está vazio!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        boolean estaNaLista = false;
        if(!(tarefasSet.isEmpty())){
            for(Tarefa t : tarefasSet) {
                if(t.getDescricao().equalsIgnoreCase((descricao))) {
                    t.setConcluida(true);
                    estaNaLista = true;
                    break;
                }
            }
        } else {
            System.out.println("O conjunto de tarefas está vazio!");
        }
        if(!estaNaLista) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        boolean estaNaLista = false;
        if(!(tarefasSet.isEmpty())){
            for(Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase((descricao))) {
                    t.setConcluida(false);
                    estaNaLista = true;
                    break;
                }
            }
        } else {
            System.out.println("O conjunto de tarefas está vazio!");
        }
        if(!estaNaLista) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void limparListaTarefas() {
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        //instanciando um objeto do tipo ListaTarefas
        ListaTarefas tarefas = new ListaTarefas();

        //exibir tarefas
        tarefas.exibirTarefas();

        //adiconando tarefas ao conjunto
        tarefas.adicionarTarefa("Limpar");
        tarefas.adicionarTarefa("Jogar");
        tarefas.adicionarTarefa("Alongar");
        tarefas.adicionarTarefa("Organizar");
        tarefas.adicionarTarefa("Abastecer");

        //contando o número de tarefas
        tarefas.contarTarefas();

        //exibir tarefas
        tarefas.exibirTarefas();

        //removendo tarefas do conjunto
        tarefas.removerTarefa("Jogar");

        //contando o número de tarefas
        tarefas.contarTarefas();

        //exibir tarefas
        tarefas.exibirTarefas();

        //obtendo tarefas pendentes
        System.out.println("Tarefas pendentes: " + tarefas.obterTarefasPendentes());

        //marcando tarefas como concluídas
        tarefas.marcarTarefaConcluida("Alongar");
        tarefas.marcarTarefaConcluida("Abastecer");

        //obtendo tarefas pendentes
        System.out.println("Tarefas pendentes: " + tarefas.obterTarefasPendentes());

        //exibindo tarefas concluídas
        System.out.println("Tarefas concluídas: " + tarefas.obterTarefasConcluidas());

        //marcando tarefa como pendente
        tarefas.marcarTarefaPendente("Alongar");

        //obtendo tarefas pendentes
        System.out.println("Tarefas pendentes: " + tarefas.obterTarefasPendentes());

        //exibindo tarefas concluídas
        System.out.println("Tarefas concluídas: " + tarefas.obterTarefasConcluidas());

        //limpando o conjunto de tarefas
        tarefas.limparListaTarefas();

        //exibir tarefas
        tarefas.exibirTarefas();
    }
}
