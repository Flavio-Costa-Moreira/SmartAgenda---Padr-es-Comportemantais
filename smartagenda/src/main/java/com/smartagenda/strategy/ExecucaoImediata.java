package com.smartagenda.strategy;

import com.smartagenda.command.Command;

/**
 * Execução imediata do comando.
 * PATTERN: Strategy
 */
public class ExecucaoImediata implements EstrategiaExecucao {
    @Override
    public void executar(Command comando) {
        comando.executar();
    }
}
