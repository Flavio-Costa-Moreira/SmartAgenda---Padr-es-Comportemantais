# SmartAgenda - Projeto de Padrões de Projeto

**Objetivo:** Implementar um mini-sistema *SmartAgenda* em Java aplicando os padrões:
- **Observer**: notificar módulos quando nova tarefa é criada.
- **Command**: cada tarefa encapsulada como um comando executável/desfazer.
- **Strategy**: diferentes estratégias de execução (imediata, atrasada).

## Estrutura do projeto
```
smartagenda/
├─ pom.xml
├─ README.md
└─ src/main/java/com/smartagenda/
   ├─ command/
   ├─ observer/
   ├─ strategy/
   ├─ model/
   └─ main/
```

## Como compilar e executar (com Maven)
1. Certifique-se de ter Java 17+ e Maven instalados.
2. No terminal, rode:
   ```
   mvn clean package
   ```
3. Execute o jar:
   ```
   java -jar target/smartagenda-1.0-SNAPSHOT-jar-with-dependencies.jar
   ```

## Padrões aplicados (resumo)
- **Observer**: `Agenda` é o Subject; `LoggerObserver` e `NotificationObserver` são Observers. Quando `Agenda.adicionarTarefa(...)` é chamado, todos os observers são notificados.
- **Command**: Interface `Command` com `executar()` e `desfazer()`. Ex.: `EnviarEmailCommand`, `TocarAlarmeCommand`.
- **Strategy**: Interface `EstrategiaExecucao` com implementações `ExecucaoImediata` e `ExecucaoAtrasada`. A `Tarefa` recebe uma estratégia no momento da criação.

## Entrega
Inclui comentários no código indicando onde cada padrão foi aplicado (procure por `// PATTERN: ...`).

