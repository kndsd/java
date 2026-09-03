import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_QUARTOS = 5;
        final int MAX_RESERVAS = 25;

        int[] numeroQuartos = new int[MAX_QUARTOS];
        int[] camasDisponiveis = new int[MAX_QUARTOS];
        int totalQuartos = 0;

        int[] reservaQuarto = new int[MAX_RESERVAS];
        String[] reservaHospede = new String[MAX_RESERVAS];
        int totalReservas = 0;

        boolean quartosCadastrados = false;
        boolean camasCadastradas = false;

        int opcao;

        do {
            System.out.println("\n=== REDE DE HOTÉIS SUNSTAY - GERENCIAMENTO ===");
            System.out.println("1 – Registrar número dos quartos");
            System.out.println("2 – Registrar quantidade de camas");
            System.out.println("3 – Reservar quarto");
            System.out.println("4 – Consultar reservas por quarto");
            System.out.println("5 – Consultar reservas por hóspede");
            System.out.println("6 – Encerrar sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de quartos disponíveis no hotel (máx. 5): ");
                    int qtdInput = scanner.nextInt();
                    scanner.nextLine();

                    if (qtdInput < 1 || qtdInput > MAX_QUARTOS) {
                        System.out.println("Quantidade inválida! O hotel pode possuir no máximo 5 quartos.");
                    } else {
                        totalQuartos = qtdInput;
                        for (int i = 0; i < totalQuartos; i++) {
                            System.out.printf("Digite o número para o Quarto %d: ", i + 1);
                            numeroQuartos[i] = scanner.nextInt();
                            scanner.nextLine();
                        }
                        quartosCadastrados = true;
                        camasCadastradas = false;
                        System.out.println("Número dos quartos registrado com sucesso!");
                    }
                    break;

                case 2:
                    if (!quartosCadastrados) {
                        System.out.println("Cadastre os quartos na opção 1 antes de registrar as camas!");
                    } else {
                        for (int i = 0; i < totalQuartos; i++) {
                            System.out.printf("Quantidade de camas para o Quarto %d: ", numeroQuartos[i]);
                            camasDisponiveis[i] = scanner.nextInt();
                            scanner.nextLine();
                        }
                        camasCadastradas = true;
                        System.out.println("Quantidade de camas registrada com sucesso!");
                    }
                    break;

                case 3:
                    if (!quartosCadastrados || !camasCadastradas) {
                        System.out.println("É necessário registrar os quartos (Opção 1) e as camas (Opção 2) antes de realizar reservas!");
                    } else if (totalReservas >= MAX_RESERVAS) {
                        System.out.println("Limite total de reservas (25) atingido no sistema!");
                    } else {
                        System.out.print("Digite o número do quarto: ");
                        int numQuartoReserva = scanner.nextInt();
                        scanner.nextLine();

                        int indiceQuarto = -1;
                        for (int i = 0; i < totalQuartos; i++) {
                            if (numeroQuartos[i] == numQuartoReserva) {
                                indiceQuarto = i;
                                break;
                            }
                        }

                        if (indiceQuarto == -1) {
                            System.out.println("Este quarto não existe!");
                        } else if (camasDisponiveis[indiceQuarto] <= 0) {
                            System.out.println("Não há camas disponíveis neste quarto!");
                        } else {
                            System.out.print("Digite o nome do hóspede: ");
                            String nomeHospede = scanner.nextLine();

                            reservaQuarto[totalReservas] = numQuartoReserva;
                            reservaHospede[totalReservas] = nomeHospede;
                            totalReservas++;

                            camasDisponiveis[indiceQuarto]--;

                            System.out.println("Reserva realizada com sucesso!");
                        }
                    }
                    break;

                case 4:
                    if (!quartosCadastrados) {
                        System.out.println("Nenhum quarto cadastrado no sistema.");
                    } else {
                        System.out.print("Digite o número do quarto: ");
                        int numQuartoConsulta = scanner.nextInt();
                        scanner.nextLine();

                        boolean existeQuarto = false;
                        for (int i = 0; i < totalQuartos; i++) {
                            if (numeroQuartos[i] == numQuartoConsulta) {
                                existeQuarto = true;
                                break;
                            }
                        }

                        if (!existeQuarto) {
                            System.out.println("Este quarto não existe!");
                        } else {
                            boolean encontrouReserva = false;
                            for (int i = 0; i < totalReservas; i++) {
                                if (reservaQuarto[i] == numQuartoConsulta) {
                                    System.out.printf("Hóspede: %s%n", reservaHospede[i]);
                                    encontrouReserva = true;
                                }
                            }
                            if (!encontrouReserva) {
                                System.out.println("Não há reservas para este quarto!");
                            }
                        }
                    }
                    break;

                case 5:
                    if (totalReservas == 0) {
                        System.out.println("Não há reservas para este hóspede!");
                    } else {
                        System.out.print("Digite o nome do hóspede: ");
                        String nomeConsulta = scanner.nextLine();

                        boolean encontrouReserva = false;
                        for (int i = 0; i < totalReservas; i++) {
                            if (reservaHospede[i].equalsIgnoreCase(nomeConsulta)) {
                                System.out.printf("Quarto reservado: %d%n", reservaQuarto[i]);
                                encontrouReserva = true;
                            }
                        }
                        if (!encontrouReserva) {
                            System.out.println("Não há reservas para este hóspede!");
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