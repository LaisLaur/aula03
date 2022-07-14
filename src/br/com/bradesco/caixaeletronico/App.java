package br.com.bradesco.caixaeletronico;

// SHIFT + F6 = RENOMEAR
// CTRL + ALT + L = FORMATAR LAYOUT DO CÓDIGO

import br.com.bradesco.caixaeletronico.services.SelecionaComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa eletrônico ligado! Escolha uma operação:");
        SelecionaComando selecionaComando = new SelecionaComando();
        while (selecionaComando.executar()) {
            System.out.println("Se já terminou, selecione SAIR. Caso contrário, escolha o novo serviço desejado:");
        }
        System.out.println("Caixa eletrônico desligado!");
    }

}
