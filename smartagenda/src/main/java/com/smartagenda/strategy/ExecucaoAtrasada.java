package com.smartagenda.strategy;

import com.smartagenda.command.Command;

/**
 * Execução atrasada (simples delay).
 * PATTERN: Strategy
 */
public class ExecucaoAtrasada implements EstrategiaExecucao {
    private long delayMillis;

    public ExecucaoAtrasada(long delayMillis) {
        this.delayMillis = delayMillis;
    }

    @Override
    public void executar(Command comando) {
        try {
            System.out.println("[STRATEGY] Execução atrasada por " + delayMillis + " ms...");
            Thread.sleep(delayMillis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        comando.executar();
    }
}
