package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatosSet;

    //construtor
    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    //métodos
    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if((!contatosSet.isEmpty())) {
            for(Contato c : contatosSet) {
                if(c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatosSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        //atributo
        AgendaContatos contatos = new AgendaContatos();

        //exibindo os contatos (vazio)
        contatos.exibirContatos();

        //adicionando contatos à agenda
        contatos.adicionarContato("João", 123456789);
        contatos.adicionarContato("Maria", 987654321);
        contatos.adicionarContato("Maria Fernandes", 55555555);
        contatos.adicionarContato("Ana", 88889999);
        contatos.adicionarContato("Fernando", 77778888);
        contatos.adicionarContato("Carolina", 55555555);

        //exibindo os contatos na agenda
        contatos.exibirContatos();

        //pesquisando contatos pelo nome
        System.out.println(contatos.pesquisarPorNome("Maria"));

        //atualizando o número de um contato
        Contato contatoAtualizado = contatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        //exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        contatos.exibirContatos();
    }
}
