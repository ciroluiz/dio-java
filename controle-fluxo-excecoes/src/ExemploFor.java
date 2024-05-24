public class ExemploFor {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 10; carneirinhos++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        String alunos[] = { "TALITA", "JONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
