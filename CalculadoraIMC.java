import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Seu Índice de Massa Corporal (IMC) é: %.2f%n", imc);

        scanner.close();
    }
}