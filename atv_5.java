import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite seu peso : ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura : ");
        double altura = scanner.nextDouble();

        
        double imc = peso / Math.pow(altura, 2); 

    
        System.out.println("\n--- Resultado ---");
        System.out.printf("Seu IMC é: ", imc);

        
        System.out.print("Classificação: ");
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Peso normal");
        } else if (imc < 30.0) {
            System.out.println("Sobrepeso");
        } else if (imc < 35.0) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40.0) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        
        scanner.close();
    }
}
