import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int CAPACIDADE = 5;
        int[] numeros = new int[CAPACIDADE];
        int qtd = 0;
        int opcao;

        do {
            System.out.println("\n=== GERENCIADOR DE NÚMEROS ===");
            System.out.println("1 - Inserir número");
            System.out.println("2 - Listar números");
            System.out.println("3 - Remover número por índice");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (qtd < CAPACIDADE) {
                        System.out.print("Digite o número a ser inserido: ");
                        numeros[qtd] = scanner.nextInt();
                        qtd++;
                        System.out.println("Número inserido com sucesso!");
                    } else {
                        System.out.println("Erro: O array está cheio. Não é possível inserir mais números.");
                    }
                    break;

                case 2:
                    if (qtd == 0) {
                        System.out.println("Não há números cadastrados.");
                    } else {
                        System.out.println("\n--- Números Armazenados ---");
                        for (int i = 0; i < qtd; i++) {
                            System.out.printf("Índice [%d]: %d%n", i, numeros[i]);
                        }
                    }
                    break;

                case 3:
                    if (qtd == 0) {
                        System.out.println("Erro: O array está vazio. Não há números para remover.");
                    } else {
                        System.out.print("Digite o índice do número a ser removido: ");
                        int indice = scanner.nextInt();

                        if (indice < 0 || indice >= qtd) {
                            System.out.println("Erro: Índice inválido!");
                        } else {
                            for (int i = indice; i < qtd - 1; i++) {
                                numeros[i] = numeros[i + 1];
                            }
                            numeros[qtd - 1] = 0;
                            qtd--;
                            System.out.println("Número removido com sucesso!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
