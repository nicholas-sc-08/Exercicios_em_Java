import javax.swing.JOptionPane;

public class Copo_Meio_Cheio {

    public static void main(String[] args){

        //5.29 - Copo meio cheio: Ler um número e informar se ele é positivo,
        //negativo ou nulo.

        int numero_inicial = 0;

        double numero_a_inserir = Double.parseDouble(JOptionPane.showInputDialog(null, "Favor insira um número:"));

        if(numero_a_inserir > numero_inicial){

            JOptionPane.showMessageDialog(null,"Número positívo!");

        } else if(numero_a_inserir < numero_inicial){

            JOptionPane.showMessageDialog(null,"Número negatívo!");
        } else {

            JOptionPane.showMessageDialog(null, "Número nulo ;(");
        }
    }
}
