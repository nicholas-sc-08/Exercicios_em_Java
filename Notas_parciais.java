import javax.swing.JOptionPane;
import java.util.Arrays;

public class Notas_parciais {

    public static void main(String[] args){

        double notas[] = new double[3];
        double nota_a_colocar;
        double soma_das_notas = 0;

        for(int i = 0; i < notas.length; i++){

            nota_a_colocar = Double.parseDouble(JOptionPane.showInputDialog("Coloque a" + (i + 1)+"º nota."));

            if(nota_a_colocar >= 0 && nota_a_colocar <= 10){

                notas[i] = nota_a_colocar;
                soma_das_notas += notas[i];

            } else if(nota_a_colocar > 10){

                JOptionPane.showMessageDialog(null, "Favor inserir um número menor que 10!");
                i--;
            } else {

                JOptionPane.showMessageDialog(null, "Favor inserir um número maior que 0!");
                i--;
            };

        };

        soma_das_notas /= notas.length;

        JOptionPane.showMessageDialog(null, "Notas adicionadas: "+ Arrays.toString(notas));

        JOptionPane.showMessageDialog(null,"Média final: "+ soma_das_notas);
    }
}
