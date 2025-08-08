package com.smartagenda.observer;

import com.smartagenda.model.Tarefa;

/**
 * NotificationObserver - notifica o usuário (simulado via console).
 * PATTERN: Observer
 */
public class NotificationObserver implements Observer {
    @Override
    public void update(Tarefa tarefa) {
        System.out.println("[NOTIFICACAO] Você criou a tarefa: " + tarefa.getNome());
    }
}
