# SmartAgenda - Projeto de Padrões de Projeto

Atividade de padrões de projeto, onde de forma prática usaremos os padrões comportamentais para desenvolver uma parte de um sistema chamado SmartAgenda para gerenciamento de atividades automatizadas

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

## Padrões de Projeto Aplicados

### 1. **Observer**
- **Objetivo:** Permitir que múltiplos módulos sejam notificados automaticamente quando uma nova tarefa for criada.
- **Implementação no projeto:**
  - **`Subject`** e **`Observer`**: interfaces base para implementar o padrão.
  - **`Agenda`**: classe que gerencia tarefas e notifica observadores.
  - **`LoggerObserver`**, **`NotificationObserver`**, **`ActionSuggestor`**: observadores concretos que reagem ao evento.
- **Localização:** `src/main/java/com/smartagenda/observer/`

---

### 2. **Command**
- **Objetivo:** Encapsular tarefas como comandos que podem ser executados, agendados ou desfeitos.
- **Implementação no projeto:**
  - **`Command`**: interface base para comandos.
  - **`EnviarEmailCommand`**, **`TocarAlarmeCommand`**: comandos concretos que executam ações específicas.
  - Cada tarefa criada é associada a um comando para execução.
- **Localização:** `src/main/java/com/smartagenda/command/`

---

### 3. **Strategy**
- **Objetivo:** Definir diferentes formas de executar uma tarefa (flexibilidade no comportamento).
- **Implementação no projeto:**
  - **`EstrategiaExecucao`**: interface para diferentes estratégias.
  - **`ExecucaoImediata`**, **`ExecucaoAtrasada`**: estratégias concretas que definem como a tarefa será executada.
  - A escolha da estratégia pode ser feita dinamicamente.
- **Localização:** `src/main/java/com/smartagenda/strategy/`

## 👨‍💻 Autores

- **Flávio Costa**
- **Saulo Melo**

📚 **Disciplina:** Padrões de Projeto  
🏫 **Instituição:** Instituto Federal de Educação, Ciência e Tecnologia da Bahia – Campus Santo Antônio de Jesus - Ba.
