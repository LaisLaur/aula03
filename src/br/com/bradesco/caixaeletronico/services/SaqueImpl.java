package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class SaqueImpl implements Saque {

    private final MemoriaContaRepository repository;

    public SaqueImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public double execute (double valorASerSacado, int numeroDaConta) {
        Conta conta;
        conta = repository.findById(numeroDaConta);
        conta.retirarSaldo(valorASerSacado);
        System.out.printf("Saque realizado! Seu saldo atual é de R$ %.2f (sujeito a alteração até o final do dia)!%n", conta.getSaldo());
        return valorASerSacado;

    }
}
