# Sistema de Empréstimos (Simulação com JPA e DAO)

## 👥 Integrantes do Projeto

- Kenzo Ribeiro Toda – Matrícula: 202307907287
- Marcelo Hitoshi Kondo Oya – Matrícula: 202307907288

## 📚 Descrição do Projeto

Este projeto simula um sistema de empréstimos utilizando o padrão DAO e mapeamento com JPA (Java Persistence API), **sem o uso de banco de dados real**. Todos os dados são armazenados temporariamente em listas de memória.

O projeto foi desenvolvido como parte de uma atividade acadêmica da disciplina de **Aplicação de Banco de Dados** com foco em persistência de dados.

---

## 📦 Estrutura de Pacotes

```bash
src/
│
├── model/           # Contém as classes de modelo JPA (Entidades)
│   ├── model.Aluno.java
│   ├── model.Publicacao.java
│   └── model.Emprestimo.java
│
├── dao/             # Contém a classe DAO com simulação de persistência
│   └── dao.EmprestimoDAO.java
│
└── test/            # Contém a classe de teste que executa o CRUD
    └── test.TesteEmprestimoDAO.java
    