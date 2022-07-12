package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;

public interface Transferencia {

    /**
     * Método usado para transferir dinheiro:
     *
     * @param valor   valor que será transaferido
     * @param destino conta que receberá o valor
     * @param origem  conta que debitará o valor
     */

    void transferir (double valor, Conta destino, Conta origem);

}
