package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributo
    List<Integer> numeros;

    //construtor
    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        //instanciando um objeto do tipo OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        //adicionando números
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
        numeros.adicionarNumero(4335);
        numeros.adicionarNumero(0);
        numeros.adicionarNumero(99);
        numeros.adicionarNumero(34);
        numeros.adicionarNumero(27);
        numeros.adicionarNumero(33);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(-8);

        //exibir lista
        numeros.exibirNumeros();

        //ordenar crescente
        System.out.println(numeros.ordenarAscendente());

        //exibir lista
        numeros.exibirNumeros();

        //ordenar decrescente
        System.out.println(numeros.ordenarDescendente());

        //exibir lista
        numeros.exibirNumeros();
    }
}
