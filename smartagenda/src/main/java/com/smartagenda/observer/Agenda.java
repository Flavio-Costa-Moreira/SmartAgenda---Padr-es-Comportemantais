package com.smartagenda.observer;

import com.smartagenda.model.Tarefa;
import java.util.ArrayList;
import java.util.List;

/**
 * Agenda é o Subject que mantém Observers e notifica quando uma nova tarefa é adicionada.
 * PATTERN: Observer
 */
public class Agenda implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificarObservers(Tarefa tarefa) {
        for (Observer o : observers) {
            o.update(tarefa);
        }
    }

    // Ao adicionar tarefa, notifica todos os observers.
    public void adicionarTarefa(Tarefa tarefa) {
        System.out.println("[AGENDA] Tarefa adicionada: " + tarefa.getNome());
        notificarObservers(tarefa);
    }
}
