package com.smartagenda.command;

/**
 * Comando para enviar e-mail (simulado no console).
 * PATTERN: Command
 */
public class EnviarEmailCommand implements Command {
    private String destinatario;
    private String assunto;

    public EnviarEmailCommand(String destinatario, String assunto) {
        this.destinatario = destinatario;
        this.assunto = assunto;
    }

    @Override
    public void executar() {
        System.out.println("[COMANDO] Enviando email para " + destinatario + " com assunto '" + assunto + "'...");
        // Aqui você integraria com um serviço de email real.
    }

    @Override
    public void desfazer() {
        System.out.println("[COMANDO] Desfazer envio de email para " + destinatario);
    }
}
