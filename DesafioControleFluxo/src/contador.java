import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        // Pegando o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        // Pegando o segundo parâmetro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        // Tentando executar a contagem
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage()); // Mensagem clara de erro
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validando se parametroUm é MAIOR que parametroDois e lançando a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo.");
        } else {
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem

            for (int i = 1; i <= contagem; i++) {
                System.out.println(String.format("Realizando o looping pela %dª vez", i));
            }
        }
    }
}
