import java.util.Scanner;
public class Atividade9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite um numero em segundos ");
        double segundos = scanner.nextDouble();

        double horas = segundos / 3600;

        System.out.println("\nO resultado em horas: "  + horas);

        double minutos = segundos / 60;

        System.out.println("\nResultado em minutos: " + minutos);

        double seg = segundos;

        System.out.println("\nSegundos: " + segundos);

        scanner.close();



    }
}