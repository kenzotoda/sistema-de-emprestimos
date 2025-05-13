package model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Emprestimo {
    @Id
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dataEmprestimo;

    @Temporal(TemporalType.DATE)
    private Date dataDevolucao;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Publicacao publicacao;

    public Emprestimo() {}

    public Emprestimo(Long id, Date dataEmprestimo, Date dataDevolucao, Aluno aluno, Publicacao publicacao) {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.aluno = aluno;
        this.publicacao = publicacao;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Date getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(Date dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }
    public Date getDataDevolucao() { return dataDevolucao; }
    public void setDataDevolucao(Date dataDevolucao) { this.dataDevolucao = dataDevolucao; }
    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }
    public Publicacao getPublicacao() { return publicacao; }
    public void setPublicacao(Publicacao publicacao) { this.publicacao = publicacao; }
}
