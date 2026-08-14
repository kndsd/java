import java.util.Scanner;

public class atv_4 {


    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor da força : ");
        double força = scanner.nextDouble();

        System.out.print("Digite a distância/deslocamento : ");
        double distancia = scanner.nextDouble();

    
        double trabalho = força * distancia;

        // Exibição do resultado
        System.out.println("\n--- Resultado ---");
        System.out.printf("Força (F): ", força);
        System.out.printf("Distância (d):", distancia);
        System.out.printf("Trabalho realizado (T): ", trabalho);

    
        scanner.close();
    }
}
