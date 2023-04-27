import java.util.Scanner;
public class Atividade10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme um valor: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("\nInforme o valor: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nInforme um valor: ");
        double num3 = scanner.nextDouble();

        double mediaAritmetica = (num1 + num2 + num3) / 3;

        System.out.println("\nA media aritmética dos numeros: " + mediaAritmetica);

        double mediaHarmonica = 3/((1/num1) + (1/num2) + (1/num3));

        System.out.println("\nO resultado da média harmônica é: " + mediaHarmonica);

        double mediaGeo = Math.sqrt((num1 * num2 * num3));

        System.out.println("\nO resultado da média geometrica: " + mediaGeo);







    }
}