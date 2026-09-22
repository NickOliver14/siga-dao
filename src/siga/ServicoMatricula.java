package siga;

import java.util.List;


public class ServicoMatricula {

    private final AlunoDAO dao;   // depende da ABSTRAÇÃO

    public ServicoMatricula(AlunoDAO dao) {   // injeção de dependência
        this.dao = dao;
    }

    public void matricular(Aluno aluno) {
        if (aluno.getMedia() < 0) {           // só regra de negócio
            throw new IllegalArgumentException("Média inválida");
        }
        dao.inserir(aluno);                   // não sabe como é persistido
    }

    public void gerarRelatorio() {
        // Duplicação: o mesmo acesso a dados aparece aqui de novo.
        
        List<Aluno> alunos = this.dao.listarTodos();

        System.out.println("=== Relatório de Alunos ===");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
