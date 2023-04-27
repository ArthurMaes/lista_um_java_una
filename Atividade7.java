import java.util.Scanner;
public class Atividade7{

public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nInforme o valor total das vendas: ");
    double vendasT = scanner.nextDouble();

    System.out.println("\nInforme o percentual das vendas: ");
    double percentualV = scanner.nextDouble();

    System.out.println("\nInforme o salario fixo: ");
    double salarioF = scanner.nextDouble();

    double salarioT = ((vendasT * percentualV) / 100) + salarioF;

    System.out.println("\nSalario total: " + salarioT );

    scanner.close();




}
}