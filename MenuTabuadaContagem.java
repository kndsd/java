import java.util.Scanner;

public class MenuTabuadaContagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número para ver a tabuada: ");
                    int numeroTabuada = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.printf("%d x %2d = %d%n", numeroTabuada, i, numeroTabuada * i);
                    }
                    break;
                case 2:
                    System.out.print("Digite o número inicial para a contagem regressiva: ");
                    int inicioContagem = scanner.nextInt();
                    for (int i = inicioContagem; i >= 0; i--) {
                        System.out.println(i);
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