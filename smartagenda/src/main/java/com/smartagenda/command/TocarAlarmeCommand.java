package com.smartagenda.command;

/**
 * Comando para tocar alarme.
 * PATTERN: Command
 */
public class TocarAlarmeCommand implements Command {
    @Override
    public void executar() {
        System.out.println("[COMANDO] Alarme tocando! 🛎️");
    }

    @Override
    public void desfazer() {
        System.out.println("[COMANDO] Alarme parado.");
    }
}
