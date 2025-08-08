package com.smartagenda.observer;

import com.smartagenda.model.Tarefa;

/**
 * Subject interface for Observer pattern
 */
public interface Subject {
    void adicionarObserver(Observer o);
    void removerObserver(Observer o);
    void notificarObservers(Tarefa tarefa);
}
