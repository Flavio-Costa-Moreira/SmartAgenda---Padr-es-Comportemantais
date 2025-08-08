package com.smartagenda.strategy;

import com.smartagenda.command.Command;

/**
 * Interface Strategy para execução de comandos.
 * PATTERN: Strategy
 */
public interface EstrategiaExecucao {
    void executar(Command comando);
}
