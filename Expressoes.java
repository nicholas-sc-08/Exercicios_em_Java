import java.util.Scanner;

public class Expressoes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero_um;
        double numero_dois;
        double resultado;

        System.out.println("Digite o primeiro número: ");
        numero_um = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        numero_dois = scanner.nextInt();

        resultado = numero_um + numero_dois;

        System.out.println("O resultado da soma é de... ");
        System.out.println(resultado);
    }
}
