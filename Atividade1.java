import java.util.Scanner;

public class Atividade1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double num1 = scanner.nextDouble();

        System.out.println("\nDigite outro valor:");
        double num2 = scanner.nextDouble();

        double mediaAritmetica = (num1 + num2) / 2;

        System.out.println("\nmedia aritmetica: " + mediaAritmetica);

    }
}