package repeticao;

public class ExemploForArray {

    public static void main(String[] args) {
        String alunos[] = { "Daniel", "Lucas", "Marcos", "João" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno do indice " + x + " e: " + alunos[x]);
        }


        // FOR EACH
        for (String aluno : alunos) {
            System.out.println("O aluno do índice é o " + aluno);
        }

    }
}