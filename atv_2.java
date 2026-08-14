import java.util.Scanner;


public class atv_2 {
 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Cálculo da média aritmética
        double media = (num1 + num2) / 2;

        
        System.out.println("\n--- Resultado ---");
        System.out.println("A média entre " + num1 + " e " + num2 + " é: " + media);

    
        scanner.close();
    }
}   

