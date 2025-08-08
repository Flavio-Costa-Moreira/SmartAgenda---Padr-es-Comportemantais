package com.smartagenda.model;

import com.smartagenda.command.Command;
import com.smartagenda.strategy.EstrategiaExecucao;

/**
 * Modelo de Tarefa.
 * Contém um Command (padrão Command) e uma estratégia de execução (Strategy).
 */
public class Tarefa {
    private String nome;
    private Command comando;
    private EstrategiaExecucao estrategia;

    public Tarefa(String nome, Command comando, EstrategiaExecucao estrategia) {
        this.nome = nome;
        this.comando = comando;
        this.estrategia = estrategia;
    }

    public String getNome() {
        return nome;
    }

    // Executa usando a estratégia definida (PATTERN: Strategy)
    public void executar() {
        estrategia.executar(comando);
    }

    // Permite desfazer o comando (Command)
    public void desfazer() {
        comando.desfazer();
    }
}
