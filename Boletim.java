import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        System.out.printf("%nAluno: %s%nNota 1: %.2f%nNota 2: %.2f%nMédia: %.2f%n", 
                          nomeAluno, nota1, nota2, media);

        scanner.close();
    }
}
