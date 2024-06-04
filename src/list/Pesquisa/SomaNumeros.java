package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    //Adiciona um número à lista de números.
    public void adicionarNumero(int numero) {
        this.numerosInteiros.add(numero);
    }

    //Calcula a soma de todos os números na lista e retorna o resultado.
    public int calcularSoma() {
        int soma = 0;
        if(!numerosInteiros.isEmpty()) {
            for(Integer numero : numerosInteiros) {
                soma += numero;
            }
            return soma;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Encontra o maior número na lista e retorna o valor.
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if(!numerosInteiros.isEmpty()) {
            for (Integer numero : numerosInteiros) {
                if(numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Encontra o menor número na lista e retorna o valor.
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!numerosInteiros.isEmpty()) {
            for (Integer numero : numerosInteiros) {
                if(numero < menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Retorna uma lista contendo todos os números presentes na lista.
    public void exibirNumeros() {
        if(!numerosInteiros.isEmpty()) {
            System.out.println(this.numerosInteiros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        //instanciando
        SomaNumeros numeros = new SomaNumeros();

        //adicionando numeros
        numeros.adicionarNumero(33);
        numeros.adicionarNumero(34);
        numeros.adicionarNumero(27);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(484);
        numeros.adicionarNumero(155);
        numeros.adicionarNumero(99);

        //exibindo numeros
        numeros.exibirNumeros();

        //calculando numeros
        System.out.println("A soma dos números é = " + numeros.calcularSoma());

        //exibindo o maior numero
        System.out.println("O maior número é = " + numeros.encontrarMaiorNumero());

        //exibindo o menor numero
        System.out.println("O menor número é = " + numeros.encontrarMenorNumero());

    }
}
