import java.util.Scanner;

public class atv_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cor do CD (Verde, Azul, Amarelo, Vermelho): ");
        String cor = sc.next().toLowerCase();

        switch (cor) {
            case "verde":
                System.out.println("Preço: R$ 10,00");
                break;
            case "azul":
                System.out.println("Preço: R$ 20,00");
                break;
            case "amarelo":
                System.out.println("Preço: R$ 30,00");
                break;
            case "vermelho":
                System.out.println("Preço: R$ 40,00");
                break;
            default:
                System.out.println("Cor inválida!");
                break;
        }

        sc.close();
    }
}
