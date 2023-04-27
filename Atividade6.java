import java.util.Scanner;
public class Atividade6{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("\nInforme a base do logaritmo: ");
        double num2 = scanner.nextDouble();
        
        double resultado = Math.log(num1) / Math.log(num2);

        System.out.println("\nLogaritmo de: " + num1 + "\nNa base " + num2 + " = " + resultado);

        scanner.close();


        
    }
    
}