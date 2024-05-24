public class ExemploExcecoes {
    public static void main(String[] args) {
        try {
            processarDados();
        } catch (MinhaExcecao e) {
            System.err.println("Erro ao processar dados: " + e.getMessage());
        } finally {
            System.out.println("Fim do bloco try-catch");
        }
    }

    public static void processarDados() throws MinhaExcecao {
        String[] dados = { "dado1", "dado2", "", null, "dado5", "erro" };

        for (String dado : dados) {
            try {
                validarDado(dado);
                System.out.println("Processando: " + dado);
            } catch (NullPointerException | IllegalArgumentException e) {
                System.err.println("Erro ao validar dado: " + e.getMessage());
            }
        }
    }

    public static void validarDado(String dado) throws MinhaExcecao {
        if (dado == null) {
            throw new NullPointerException("Dado é nulo");
        }
        if (dado.isEmpty()) {
            throw new IllegalArgumentException("Dado é vazio");
        }
        if (dado.contains("erro")) {
            throw new MinhaExcecao("Dado contém erro");
        }
    }
}

class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}
