# API REST para Gerenciamento de Tarefas

## 📄 Descrição do Projeto

Este projeto é uma API RESTful desenvolvida com **Spring Boot** e **MongoDB**, destinada ao gerenciamento de tarefas.  
A aplicação permite criar, listar, buscar, atualizar e deletar tarefas, armazenando os dados em um banco NoSQL.

Cada tarefa possui os seguintes campos:

- `id`: identificador único (gerado automaticamente)
- `titulo`: título da tarefa
- `descricao`: descrição detalhada
- `dataCriacao`: data de criação
- `dataConclusao`: data prevista para conclusão
- `status`: estado da tarefa (**PENDENTE**, **EM_ANDAMENTO**, **CONCLUIDA**)

---

## 🚀 Instruções de Execução

### Pré-requisitos
- Java 17 ou superior
- Maven
- MongoDB rodando localmente
- IntelliJ IDEA ou outra IDE de sua preferência

### Passos para rodar a aplicação

- Baixe e faça a instação do MongoDB
- Execute o MongoDB como um serviço
- Clone esse repositório
- importe o repositório clonado em alguma IDE que aceite Java e Spring Boot
- Execute a aplicação

### Endpoints

#### url base: http://localhost:8080

| Método | Endpoint        | Descrição                |
| ------ | --------------- | ------------------------ |
| POST   | `/tarefas`      | Cria uma nova tarefa     |
| GET    | `/tarefas`      | Lista todas as tarefas   |
| GET    | `/tarefas/{id}` | Busca uma tarefa pelo ID |
| PUT    | `/tarefas/{id}` | Atualiza uma tarefa      |
| DELETE | `/tarefas/{id}` | Deleta uma tarefa        |

