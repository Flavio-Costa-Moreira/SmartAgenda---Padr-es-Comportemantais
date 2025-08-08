package com.smartagenda.main;

import com.smartagenda.command.Command;
import com.smartagenda.command.EnviarEmailCommand;
import com.smartagenda.command.TocarAlarmeCommand;
import com.smartagenda.model.Tarefa;
import com.smartagenda.observer.*;
import com.smartagenda.strategy.ExecucaoAtrasada;
import com.smartagenda.strategy.ExecucaoImediata;
import com.smartagenda.strategy.EstrategiaExecucao;

/**
 * Classe Main demonstrando o uso dos padrões:
 * - Observer: Agenda notifica observers ao adicionar tarefa.
 * - Command: Cada ação é encapsulada como um Command.
 * - Strategy: Diferentes formas de executar o comando.
 */
public class Main {
    public static void main(String[] args) {
        // Criando Agenda (Subject)
        Agenda agenda = new Agenda();

        // Registrando observers (PATTERN: Observer)
        agenda.adicionarObserver(new LoggerObserver());
        agenda.adicionarObserver(new NotificationObserver());
        agenda.adicionarObserver(new ActionSuggestor());

        // Criando comandos (PATTERN: Command)
        Command enviarEmail = new EnviarEmailCommand("aluno@ifba.edu.br", "Relatório de Atividades");
        Command tocarAlarme = new TocarAlarmeCommand();

        // Estratégias (PATTERN: Strategy)
        EstrategiaExecucao imediata = new ExecucaoImediata();
        EstrategiaExecucao atrasada5s = new ExecucaoAtrasada(5000);

        // Criando tarefas combinando Command + Strategy
        Tarefa tarefaEmail = new Tarefa("Enviar Relatório", enviarEmail, imediata);
        Tarefa tarefaAlarme = new Tarefa("Alarme Matinal", tocarAlarme, atrasada5s);

        // Adicionando tarefas à agenda (isso notifica os observers)
        agenda.adicionarTarefa(tarefaEmail);
        agenda.adicionarTarefa(tarefaAlarme);

        // Executando tarefas (a execução respeita a Strategy definida)
        System.out.println("\n--- Executando tarefas ---");
        tarefaEmail.executar();
        tarefaAlarme.executar();

        // Demonstrando desfazer (Command)
        System.out.println("\n--- Desfazendo tarefas ---");
        tarefaEmail.desfazer();
        tarefaAlarme.desfazer();
    }
}
