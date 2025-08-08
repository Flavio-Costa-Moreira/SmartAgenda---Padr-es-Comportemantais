package com.smartagenda.command;

/**
 * Interface Command - PATTERN: Command
 */
public interface Command {
    void executar();
    void desfazer();
}
