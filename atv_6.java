import java.util.Scanner;

public class atv_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double operando1 = sc.nextDouble();
        double operando2 = sc.nextDouble();
        char operador = sc.next().charAt(0);

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = operando1 + operando2;
                break;
            case '-':
                resultado = operando1 - operando2;
                break;
            case '*':
                resultado = operando1 * operando2;
                break;
            case '/':
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                } else {
                    System.out.println("Erro: Divisão por zero");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido");
                sc.close();
                return;
        }

        System.out.println(resultado);

        sc.close();
    }
}
