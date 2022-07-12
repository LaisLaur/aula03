package br.com.bradesco.caixaeletronico.services;

public class SelecionaComando {

    private final ListarComandos listarComandos;
    private final ObtemComando obtemComando;
    private final ExecutarComandoEspecifico executarComandoEspecifico;

    public SelecionaComando() {
        this.listarComandos = new ListarComandosImpl();
        this.obtemComando = new ObtemComandoImpl();
        this.executarComandoEspecifico = new ExecutarComandoEspecificoImpl();
    }

    public boolean executar() {
        listarComandos.execute();
        int comando = obtemComando.execute();
        return executarComandoEspecifico.execute(comando);
    }

}
