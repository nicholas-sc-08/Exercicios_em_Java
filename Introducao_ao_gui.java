import javax.swing.JOptionPane;
import java.util.Scanner;

public class GUI {

    public static void main(String[] args){

        //Maneira de fazer com a biblioteca Scanner

        //Scanner scanner = new Scanner(System.in);

        //System.out.println("Digite qual o modelo do carro:");
        //String modelo_carro = scanner.nextLine();

        //System.out.println("Modelo do carro:"+modelo_carro+".");

        //Maneira de fazer com a biblioteca JOptionPane

        String modelo_carro = JOptionPane.showInputDialog("Digite o modelo do carro");

        //Como o prompt vai devolver um valor string, vamos utilizar o
        //parseInt para devolver o ano do carro como inteiro

        int ano_do_carro = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o ano do carro:"));

        JOptionPane.showMessageDialog(null,"O modelo do carro: "+modelo_carro+", já o ano dele: "+ano_do_carro+".");

    }
}
