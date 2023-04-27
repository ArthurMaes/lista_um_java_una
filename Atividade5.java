import java.util.Scanner;

public class Atividade5{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a quantidade de horas trabalhadas: ");
    double horas = scanner.nextDouble();

    System.out.println("Informe o valor recebido por horas trabalhadas: ");
    double valorH = scanner.nextDouble();

    System.out.println("Informe o valor do salário familia: ");
    double valorS = scanner.nextDouble();

    System.out.println("\nNúmero de filhos com idade menor que 14 anos: ");
    double numeroF = scanner.nextDouble();

    double salarioB = (horas * valorH) + (valorS * numeroF);

    System.out.println("\nValor do salario bruto de um empregado por mês: " + salarioB);
}
}