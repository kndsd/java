import java.util.Scanner;

public class atv_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234abcd";

        String senha = sc.nextLine();

        if (senha.equals(senhaCorreta)) {
            System.out.println("PORTA ABERTA");
        } else {
            System.out.println("SENHA NAO CONFERE");
        }

        sc.close();
    }
}
