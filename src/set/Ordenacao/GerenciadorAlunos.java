package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    Set<Aluno> alunoSet;

    //construtor
    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    //métodos
    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if(!(alunoSet.isEmpty())) {
            for(Aluno a : alunoSet) {
                if(a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            System.out.println("O conjunto está vazio!");
        }
        if(alunoParaRemover == null) {
            System.out.println("Matrícula inexistente!");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        if(!(alunoSet.isEmpty())){
            return alunoPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!(alunoSet.isEmpty())){
            alunoPorNota.addAll(alunoSet);
            return alunoPorNota;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    //método principal
    public static void main(String[] args) {
        //instanciando um objeto do tipo GerenciadorAlunos
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        //adicionando alunos
        alunos.adicionarAluno("João", 123456L, 7.5);
        alunos.adicionarAluno("Maria", 123457L, 9.0);
        alunos.adicionarAluno("Carlos", 123458L, 5.0);
        alunos.adicionarAluno("Ana", 123459L, 6.8);

        //exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        alunos.exibirAlunos();

        //removendo um aluno com matrícula inválida e válida
        alunos.removerAluno(000L);
        alunos.removerAluno(123457L);
        alunos.exibirAlunos();

        //exibindo alunos ordenados por nome
        System.out.println(alunos.exibirAlunosPorNome());

        // Exibindo alunos ordenados por nota
        System.out.println(alunos.exibirAlunosPorNota());
    }
}
