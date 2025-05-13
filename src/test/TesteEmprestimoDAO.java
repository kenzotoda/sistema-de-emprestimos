package test;

import dao.EmprestimoDAO;
import model.Aluno;
import model.Emprestimo;
import model.Publicacao;

import java.util.Date;
import java.util.List;

public class TesteEmprestimoDAO {
    public static void main(String[] args) {
        EmprestimoDAO dao = new EmprestimoDAO();

        // Criando objetos
        Aluno aluno = new Aluno(1, "João da Silva");
        Publicacao pub = new Publicacao(101, "Java Básico", 2020, "Ana Souza", "Livro");

        // INCLUIR
        Emprestimo emp1 = new Emprestimo(1L, new Date(), null, aluno, pub);
        dao.salvar(emp1);
        System.out.println("model.Emprestimo salvo.");

        // CONSULTAR
        Emprestimo encontrado = dao.buscarPorId(1L);
        if (encontrado != null) {
            System.out.println("Consultado: " + encontrado.getAluno().getNome() + " - " + encontrado.getPublicacao().getTitulo());
        }

        // ALTERAR
        emp1.setDataDevolucao(new Date());
        dao.atualizar(emp1);
        System.out.println("model.Emprestimo atualizado com data de devolução.");

        // LISTAR TODOS
        List<Emprestimo> todos = dao.listarTodos();
        System.out.println("Todos os empréstimos:");
        for (Emprestimo e : todos) {
            System.out.println("ID: " + e.getId() + " | model.Aluno: " + e.getAluno().getNome() + " | Título: " + e.getPublicacao().getTitulo());
        }

        // DELETAR
        dao.remover(1L);
        System.out.println("model.Emprestimo removido.");

        // Verifica se foi removido
        if (dao.buscarPorId(1L) == null) {
            System.out.println("model.Emprestimo realmente foi excluído.");
        }
    }
}
