import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Alistamento{

// 1) Em cidades menores, o alistamento para o exército acontece 
// esporadicamente ao longo dos anos. Criar um programa no qual 
// pergunte ao usuário se houve alistamento dos anos 2000 a 2009, uma
//  pergunta para cada ano. Se houve alistamento deve ser digitado “S”
// e se não houve alistamento “N”. Após digitar tudo, deve-se
//  mostrar na tela o último ano que houve alistamento. Caso não
// tenha ocorrido alistamento, mostrar “Não houve alistamento nos
// últimos 10 anos”

    public static ArrayList<Integer> anos_de_alistamento = new ArrayList<>();
    public static int quantidade_minima_de_anos = 1;

    public static void main(String[] args){

        verificar_anos_de_alistamento();
    };

    private static void verificar_anos_de_alistamento(){

        int ultimo_ano_de_alistamento = 2009;

        for(int i = 2000; i <= ultimo_ano_de_alistamento; i++){

            String resposta = JOptionPane.showInputDialog("Houve alistamento no ano de "+ i+"? (S/N)");

            if(resposta != null){

                if(resposta.equals("S")){

                    anos_de_alistamento.add(i);

                } else if(resposta.equals("N")){

                } else {

                    JOptionPane.showMessageDialog(null, "Favor digitar 's' para sim e 'n' para não.");

                    i--;
                };

            };
        };

        int ultimo_indice = anos_de_alistamento.size() - 1;

        if(anos_de_alistamento.size() >= quantidade_minima_de_anos){

            JOptionPane.showMessageDialog(null, "Último ano de alistamento foi no ano de: "+anos_de_alistamento.get(ultimo_indice));

        } else {

            JOptionPane.showMessageDialog(null, "Não houve alistamento nos últimos 10 anos!");
        };
    };
}
