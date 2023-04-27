import java.util.Scanner;

public class Atividade2{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nPor Favor, informe um número: ");
        float num1 = scanner.nextFloat();

        float porcentagem = (num1 * 10 / 100);
        scanner.close();

        System.out.println("\nO número informado acrescido de 10% é: " + (num1 + porcentagem));

    }
}