import java.util.Scanner;

public class SistemaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int CAPACIDADE_MAXIMA = 5;
        String[] nomes = new String[CAPACIDADE_MAXIMA];
        int[] quantidades = new int[CAPACIDADE_MAXIMA];
        int qtd = 0;

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE CONTROLE DE PRODUTOS ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (qtd < CAPACIDADE_MAXIMA) {
                        System.out.print("Digite o nome do produto: ");
                        nomes[qtd] = scanner.nextLine();

                        System.out.print("Digite a quantidade em estoque: ");
                        quantidades[qtd] = scanner.nextInt();
                        scanner.nextLine();

                        qtd++;
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Capacidade máxima de produtos atingida (5/5).");
                    }
                    break;

                case 2:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado no sistema.");
                    } else {
                        System.out.println("\n--- Lista de Produtos ---");
                        for (int i = 0; i < qtd; i++) {
                            System.out.printf("Índice [%d] | Nome: %s | Quantidade: %d%n", i, nomes[i], quantidades[i]);
                        }
                    }
                    break;

                case 3:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado para pesquisar.");
                    } else {
                        System.out.print("Digite o nome do produto para pesquisar: ");
                        String termoBusca = scanner.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(termoBusca)) {
                                System.out.printf("Produto Encontrado -> Índice [%d] | Nome: %s | Quantidade: %d%n", 
                                                  i, nomes[i], quantidades[i]);
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Produto não encontrado no sistema.");
                        }
                    }
                    break;

                case 4:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado para alterar.");
                    } else {
                        System.out.print("Digite o nome do produto que deseja alterar: ");
                        String nomeAlterar = scanner.nextLine();
                        int indiceAlterar = -1;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
                                indiceAlterar = i;
                                break;
                            }
                        }

                        if (indiceAlterar != -1) {
                            System.out.print("Digite o novo nome do produto: ");
                            nomes[indiceAlterar] = scanner.nextLine();

                            System.out.print("Digite a nova quantidade em estoque: ");
                            quantidades[indiceAlterar] = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Produto alterado com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 5:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado para remover.");
                    } else {
                        System.out.print("Digite o nome do produto que deseja remover: ");
                        String nomeRemover = scanner.nextLine();
                        int indiceRemover = -1;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                                indiceRemover = i;
                                break;
                            }
                        }

                        if (indiceRemover != -1) {
                            for (int i = indiceRemover; i < qtd - 1; i++) {
                                nomes[i] = nomes[i + 1];
                                quantidades[i] = quantidades[i + 1];
                            }

                            nomes[qtd - 1] = null;
                            quantidades[qtd - 1] = 0;
                            qtd--;

                            System.out.println("Produto removido e lista reorganizada com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
