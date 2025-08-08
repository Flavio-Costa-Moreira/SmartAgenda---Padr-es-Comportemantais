package com.smartagenda.observer;

import com.smartagenda.model.Tarefa;

/**
 * ActionSuggestor - sugere uma ação com base no nome da tarefa.
 * Exemplo simples para demonstrar múltiplos observers.
 */
public class ActionSuggestor implements Observer {
    @Override
    public void update(Tarefa tarefa) {
        System.out.println("[SUGESTAO] Sugestão: associe um comando à tarefa '" + tarefa.getNome() + "' se necessário.");
    }
}
