import javax.swing.JOptionPane;

public class Dois_copos_meio_cheio {

    public static void main(String[] args){

        /*5.30 - Dois copos meio cheios: Faça um programa para ler um número e
        imprimir uma mensagem dizendo se o mesmo é par e positivo ao mesmo
        tempo.*/

        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a)! Verifique se este número é positivo ou negativo/par ou impar.");

        double numero_a_inserir = Double.parseDouble(JOptionPane.showInputDialog(null, "Favor insira um número:"));

        boolean par = numero_a_inserir % 2 == 0 ? true : false;

        boolean positivo = numero_a_inserir > 0 ? true : false;

        if(par && positivo){

            JOptionPane.showMessageDialog(null, "Número par & positivo!");

        } else if (!par && !positivo) {

            JOptionPane.showMessageDialog(null, "Número impar & negativo");

        } else if (par && !positivo) {

            JOptionPane.showMessageDialog(null, "Número par & negativo!");

        } else {

            JOptionPane.showMessageDialog(null, "Número impar & positivo!");
        }
    }
}
