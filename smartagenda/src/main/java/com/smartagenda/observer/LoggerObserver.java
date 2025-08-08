package com.smartagenda.observer;

import com.smartagenda.model.Tarefa;

/**
 * LoggerObserver - exemplo de Observer que registra logs.
 * PATTERN: Observer
 */
public class LoggerObserver implements Observer {
    @Override
    public void update(Tarefa tarefa) {
        System.out.println("[LOGGER] Nova tarefa registrada: " + tarefa.getNome());
    }
}
