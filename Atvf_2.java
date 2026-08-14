import java.util.Scanner;

public class Atvf_2 {
    public static void main(String[] args) {

        Scanner Boletin = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = Boletin.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = Boletin.nextInt();

        System.out.print("Digite sua nota 2: ");
        double nota2 = Boletin.nextDouble();

        double media = (nota1 + nota2) / 2;

        
        System.out.printf("%s sua media final foi %.2f",nome,media);
        
        Boletin.close();
    }
}
