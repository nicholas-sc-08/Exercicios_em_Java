import java.util.Scanner;

public class Ternario {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        boolean pode_dirigir = false;

        int idade_minima = 18;

        if(idade >= idade_minima) {

            pode_dirigir = true;

        } else {

            pode_dirigir = false;
        };

        String mensagem = pode_dirigir ? "Pode dirigir!" : "Não pode dirigir.. :(";

        System.out.println(mensagem);
    }
