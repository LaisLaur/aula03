package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class PixImpl implements Pix {

    private final MemoriaContaRepository repository;

    public PixImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public double execute(double valorASerTransferido, int numeroDaConta, String chavePix) {
        Conta conta;
        conta = repository.findById(numeroDaConta);
        boolean pixRealizado = conta.retirarSaldo(valorASerTransferido);
        if (pixRealizado) {
            System.out.printf("Pix realizadao! Seu saldo atual é de R$ %.2f (sujeito a alteração até o final do dia)!%n", conta.getSaldo());
        }
        return valorASerTransferido;

    }

}
