## Sua tarefa

Siga as etapas da ficha de atividade prática:

1. **Identificar** o SQL misturado à regra de negócio e registrar, por escrito, as violações de SRP e DIP e a duplicação.
2. **Definir a interface `AlunoDAO`** com as operações do domínio: `inserir`, `buscarPorMatricula`, `listarTodos`, `atualizar` e `remover`. Use o vocabulário do domínio — sem `tabela`, `coluna` ou `INSERT` nos nomes.
3. **Implementar `AlunoDAOMemoria`**, guardando os alunos em um `Map<String, Aluno>` interno. (Opcionalmente, implemente também um `AlunoDAOBanco` que use o `BancoSimulado`.)
4. **Refatorar `ServicoMatricula`** para receber um `AlunoDAO` pelo construtor e remover todo o SQL da classe; ela deve conter apenas regra de negócio.
5. **Demonstrar a troca** de implementação do DAO no `Main`, sem alterar uma linha da regra de negócio.
