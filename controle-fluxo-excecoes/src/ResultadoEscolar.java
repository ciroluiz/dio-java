public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 8;

        // Condicional Composta
        if (nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");

        // Condicional Encadeada
        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        // Condicionais Ternárias
        // Cenário 1
		String resultado1 = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado1);
	
        // Cenário 2
		String resultado2 = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);
    }
}