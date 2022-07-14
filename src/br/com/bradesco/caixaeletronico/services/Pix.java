package br.com.bradesco.caixaeletronico.services;

public interface Pix {

    /**
     * Método usado para transferir dinheiro:
     *
     * @param valorASerTransferido valor que será transaferido
     * @param numeroDaConta        conta que debitará o valor
     * @param chavePix             conta que receberá o valor
     */

    // void transferir (double valor, Conta destino, Conta origem);
    double execute(double valorASerTransferido, int numeroDaConta, String chavePix); // método

}
