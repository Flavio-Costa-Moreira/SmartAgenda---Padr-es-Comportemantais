package com.smartagenda.observer;

import com.smartagenda.model.Tarefa;

/**
 * Observer interface - PATTERN: Observer
 */
public interface Observer {
    void update(Tarefa tarefa);
}
