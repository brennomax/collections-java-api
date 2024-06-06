package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> listConvidados;

    public ConjuntoConvidados() {
        this.listConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        listConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if(!(listConvidados.isEmpty())) {
            for(Convidado c : listConvidados) {
                if(c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            listConvidados.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarConvidados() {
        return listConvidados.size();
    }

    public void exibirConvidados() {
        if(!(listConvidados.isEmpty())) {
            System.out.println(listConvidados);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        //instanciando um objeto do tipo ConjuntoConvidados
        ConjuntoConvidados convidadosList = new ConjuntoConvidados();

        //exibir os convidados
        convidadosList.exibirConvidados();

        //adicionando convidados ao objeto
        convidadosList.adicionarConvidado("Tainah", 342733);
        convidadosList.adicionarConvidado("Claytin", 25553);
        convidadosList.adicionarConvidado("Cabelin", 114568);
        convidadosList.adicionarConvidado("Fulanin", 4485);
        convidadosList.adicionarConvidado("Bazottin", 556245);
        convidadosList.adicionarConvidado("Tangzada", 455322);
        convidadosList.adicionarConvidado("Crespera", 22475);

        //contagem de convidados
        System.out.println("O número de convidados é " + convidadosList.contarConvidados());

        //exibir os convidados
        convidadosList.exibirConvidados();

        //remover convidado
        convidadosList.removerConvidadoPorCodigoConvite(4485);

        //contagem de convidados
        System.out.println("O número de convidados é " + convidadosList.contarConvidados());

        //exibir os convidados
        convidadosList.exibirConvidados();
    }
}
