import java.util.Scanner;

public class Atividade3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempF = scanner.nextDouble();

        double tempC = (tempF - 32) / 1.8;

        System.out.printf("A temperatura em Celsius é: %.2f", tempC);
        
        

    }
}