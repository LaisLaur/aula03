package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class DepositoImpl implements Deposito {

    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public double execute (double valorASerDepositado, int numeroDaConta){
        Conta conta;
        conta = repository.findById(numeroDaConta);
        conta.adicionaSaldo(valorASerDepositado);
        System.out.printf("Depósito realizado! Seu saldo atual é de R$ %.2f (sujeito a alteração até o final do dia)!%n", conta.getSaldo());
        return valorASerDepositado;
    }
}
