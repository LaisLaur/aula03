package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {

    private final Deposito deposito;
    private final Saque saque;
    private final AbrirConta abrirConta;

    public ExecutarComandoEspecificoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository ();
        this.deposito = new DepositoImpl(repository);
        this.saque = new SaqueImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
    }

    @Override // sobrepor o método da Interface
    public boolean execute(int comando) {
        boolean resultado = true;
        Scanner entrada = new Scanner(System.in);

        if (comando == 0) {
            System.out.println("Operação encerrada!");
            resultado = false;

        } else if (comando == 1) {
            this.abrirConta.execute();

        } else if (comando == 2) {
            System.out.println("Digite o número da conta: ");
            int numeroDaConta = entrada.nextInt();
            System.out.println("Digite o valor a ser depositado: ");
            double valorASerDepositado = entrada.nextInt();
            this.deposito.execute(valorASerDepositado, numeroDaConta);

        } else if (comando == 3) {
            System.out.println("Digite o número da conta: ");
            int numeroDaConta = entrada.nextInt();
            System.out.println("Digite o valor a ser sacado: ");
            double valorASerSacado = entrada.nextInt();
            this.saque.execute(valorASerSacado, numeroDaConta);

        } else {
            System.out.println("Comando inválido!");
        }
        return resultado;
    }
}