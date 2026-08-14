import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;

        
        System.out.println("\n--- Resultados ---");
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + subtracao);
        System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + multiplicacao);

        
        if (num2 != 0) {
            double divisao = num1 / num2;
            System.out.println("Divisão: " + num1 + " / " + num2 + " = " + divisao);
        } else {
            System.out.println("Divisão: Não é possível dividir por zero!");
        }


        scanner.close();
    }
}
