import java.util.Scanner;
public class Atividade4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o valor do capital: ");
        double capital = scanner.nextDouble();

        System.out.println("\nPor favor, digite o prazo de aplicação: ");
        int prazo = scanner.nextInt();

        System.out.println("\nDigite a taxa de juros: ");
        double taxa = scanner.nextDouble();

        double total = (capital * Math.pow( 1 + prazo,capital));

        System.out.println("\nO valor do montante é: " + total);

        scanner.close();

    }
}