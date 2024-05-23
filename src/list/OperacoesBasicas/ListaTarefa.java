package list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if(!tarefaList.isEmpty()) {
            for(Tarefa t : tarefaList) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        if(!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefas = new ListaTarefa();

        listaTarefas.obterDescricoesTarefas();

        listaTarefas.adicionarTarefa("Levantar da cama!");
        listaTarefas.adicionarTarefa("Alongar!");
        listaTarefas.adicionarTarefa("Escovar os dentes!");
        listaTarefas.adicionarTarefa("Tomar da café da manhã!");
        listaTarefas.adicionarTarefa("Alongar!");
        listaTarefas.adicionarTarefa("Estudar!");
        listaTarefas.adicionarTarefa("Almoçar!");
        listaTarefas.adicionarTarefa("Trabalhar!");

        System.out.println("Você possui " + listaTarefas.obterNumeroTotalTarefas() + " tarefas.");

        listaTarefas.obterDescricoesTarefas();

        listaTarefas.removerTarefa("Alongar!");

        System.out.println("Você possui " + listaTarefas.obterNumeroTotalTarefas() + " tarefas.");

        listaTarefas.obterDescricoesTarefas();
    }
}