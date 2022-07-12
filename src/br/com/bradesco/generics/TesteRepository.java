package br.com.bradesco.generics;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.BaseRepository;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class TesteRepository {

    public static void main(String[] args) {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        Conta conta1 = new Conta();
        conta1.adicionaSaldo(100);

        Conta conta2 = new Conta();
        conta2.adicionaSaldo(50);

        repository.adiciona(conta1);
        repository.adiciona(conta2);

        System.out.println(repository.findById(0).getSaldo());
        System.out.println("Agora outra conta!");
        System.out.println(repository.findById(1).getSaldo());
    }
}
