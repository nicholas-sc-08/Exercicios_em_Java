import java.util.Scanner;

public class Inputs_no_java{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Quantos anos você tem?");
        int idade = scanner.nextInt();
        scanner.nextLine();
        /*Caso você insira um .nextInt() por exemplo e logo *após, outro tipo de entrada de dado, como exemplo o *.nextLine(), ele ira pular está leitura, para *previnir isso, basta fazer nextLine() vazio por exemplo, veja ali em cima.*/

        System.out.println("Qual sua comida favorita?");
        String comida = scanner.nextLine();

        System.out.println("Olá " +nome+"!");
        System.out.println("Você tem "+idade+" anos.");
        System.out.println("Sua comida favorita é: "+comida);
    }
}
