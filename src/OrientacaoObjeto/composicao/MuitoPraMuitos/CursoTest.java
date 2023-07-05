package OrientacaoObjeto.composicao.MuitoPraMuitos;

public class CursoTest {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("jao");
        Aluno a2 = new Aluno("maria");

        Curso c1 = new Curso("java");
        Curso c2 = new Curso("C++");

        c1.adicionarAluno(a1);
        c1.adicionarAluno(a2);

        a1.adicionarCurso(c2);

        for (Aluno aluno : c1.alunos){
            System.out.println(aluno.nome);
        }

        System.out.println(a1.cursos.get(0).alunos);

        a1.obterCursoPorNome("java");
    }
}
