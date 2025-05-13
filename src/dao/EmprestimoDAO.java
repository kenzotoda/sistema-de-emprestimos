package dao;

import model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void salvar(Emprestimo e) {
        emprestimos.add(e);
    }

    public void atualizar(Emprestimo e) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getId().equals(e.getId())) {
                emprestimos.set(i, e);
                break;
            }
        }
    }

    public void remover(Long id) {
        emprestimos.removeIf(e -> e.getId().equals(id));
    }

    public Emprestimo buscarPorId(Long id) {
        for (Emprestimo e : emprestimos) {
            if (e.getId().equals(id)) return e;
        }
        return null;
    }

    public List<Emprestimo> listarTodos() {
        return emprestimos;
    }
}
