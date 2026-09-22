package siga;

import java.util.List;

// criação do AlunoDAO que vai ser utilizada para seguir os conceitos de DAO

public interface AlunoDAO {
    void inserir(Aluno aluno);
    Aluno buscarPorMatricula(String matricula);
    List<Aluno> listarTodos();
    void atualizar(Aluno aluno);
    void remover(String matricula);
}