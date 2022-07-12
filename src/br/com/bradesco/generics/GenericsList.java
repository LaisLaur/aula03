package br.com.bradesco.generics;

import br.com.bradesco.caixaeletronico.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class GenericsList {

    public static void main(String[] args) {
//        int [] nomeDaVariavel = new int [10]; // 10 espaços na memória
//        nomeDaVariavel[0] = 5; // armazenou o número 5 na posição 0 do espaço
//        nomeDaVariavel[5] = 100; // armazenou o número 100 na posição 5 do espaço

//        List lista = new ArrayList();
//        lista.add("Elemento 1");
//        lista.add(1);
//        lista.add(1.2535);
//        lista.add(new Conta());
//        System.out.println(lista);

//        List primos = new ArrayList();
//        primos.add(1);
//        primos.add(2);
//        primos.add(3);
//        primos.add("quatro"); // a pessoa quebra o código, por ser livre  o que fica no parênteses
//        int numero = 0;
//        // numero = numero + primos.get(0); // necessário transformar a variável do tipo objeto para int
//        numero = numero + (int) primos.get(0);
//        numero = numero + (int) primos.get(3); // isso não vai rodar porque o objeto 4 é string e não int
//        System.out.println(numero);

        List <Integer> primos = new ArrayList(); // uso <> para travar o tipo que será minha variável
        primos.add(1);
        primos.add(2);
        primos.add(3);
        int numero = 0;
        numero = numero + primos.get(0); // não tem mais necessidade de colocar "(int)"


    }
}
