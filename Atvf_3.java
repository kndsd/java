import java.util.Scanner;
public class Atvf_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String cliente = teclado.nextLine();

        System.out.print("Digite o nome do produto: ");
        String produto = teclado.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = teclado.nextInt();

        System.out.print("Digite o valor unitário: ");
        double valorUnitario = teclado.nextDouble();

        double total = quantidade * valorUnitario;

        System.out.println("---------- NOTA FISCAL ----------");
        System.out.printf("Cliente: %s%n", cliente);
        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Valor unitário: R$ %.2f%n", valorUnitario);
        System.out.printf("Total: R$ %.2f%n", total);
        System.out.println("---------------------------------");

        teclado.close();
    }
}

