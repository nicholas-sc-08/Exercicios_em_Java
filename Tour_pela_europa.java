import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tour_pela_europa{

    // 5) Você está fazendo um mochilão pela Europa e precisa saber qual a distância que vai percorrer em determinada viagem ou trecho da viagem, utilizando trem. De Bruxelas até Berlim são 764km e de Berlim até Praga são 350km. De Praga até Viena são mais 292km. De Viena até Budapeste, são outros 242km. Faça um sistema no qual o usuário digite a cidade de origem, em seguida a cidade de destino. Mostrar na tela a distância total (km) da viagem.

    // Bruxelas <-> Berlim = 764km
    // Berlim <-> Praga = 350km
    // Praga <-> Viena = 292km
    // Viena <-> Budapeste = 242km

    public static void main(String[] args){

        int bruxelas_ate_berlim = 764;
        int berlim_ate_praga = 350;
        int praga_ate_viena = 292;
        int viena_ate_budapeste = 242;

        boolean cidade_de_origem_escolhida = false;
        boolean cidade_de_chegada_escolhida = false;

        String cidade_de_partida;
        String cidade_de_destino;

        int soma_da_distancia = 0;

        while(!cidade_de_origem_escolhida){

        String cidade_de_origem = JOptionPane.showInputDialog("Seja Bem-vindo(a)!\n\nFavor escolher a cidade de origem entre as opções a seguir:\n\n1) Bruxelas\n2) Berlim\n3) Praga\n4) Viena\n5) Budapeste");
        
            switch(cidade_de_origem){

                case "1":

                cidade_de_origem_escolhida = true;
                cidade_de_partida = "Bruxelas";

                break;

                case "2":

                cidade_de_origem_escolhida = true;
                cidade_de_partida = "Berlim";

                break;

                case "3":

                cidade_de_origem_escolhida = true;
                cidade_de_partida = "Praga";

                break;

                case "4":

                cidade_de_origem_escolhida = true;
                cidade_de_partida = "Viena";
                break;

                case "5":

                cidade_de_origem_escolhida = true;
                cidade_de_partida = "Budapeste";
                break;

                default:

                    JOptionPane.showMessageDialog(null, "Favor escolher uma das opções acima! Seja elas, 1, 2, 3, 4 ou 5.");
                    break;
            };
        };

        while(!cidade_de_chegada_escolhida){

        String cidade_de_chegada = JOptionPane.showInputDialog("Seja Bem-vindo(a)!\n\nFavor escolher a cidade de chegada entre as opções a seguir:\n\n1) Bruxelas\n2) Berlim\n3) Praga\n4) Viena\n5) Budapeste");
        
            switch(cidade_de_chegada){

                case "1" && cidade_de_partida != "Bruxelas":

                cidade_de_chegada_escolhida = true;
                cidade_de_destino = "Bruxelas";
                break;

                case "2" && cidade_de_partida != "Berlim":

                cidade_de_chegada_escolhida = true;
                cidade_de_destino = "Berlim";

                break;

                case "3" && && cidade_de_partida != "Praga":

                cidade_de_chegada_escolhida = true;
                cidade_de_destino = "Praga";
                
                break;

                case "4" && cidade_de_partida != "Viena":

                cidade_de_chegada_escolhida = true;
                cidade_de_destino = "Viena";

                break;

                case "5" && cidade_de_partida != "Budapeste":

                cidade_de_chegada_escolhida = true;
                cidade_de_destino = "Budapeste";

                break;

                default:

                JOptionPane.showMessageDialog(null, "Favor escolher uma opção válida!");
                break;
            };
            
            switch(true){


                case cidade_de_partida == "Bruxelas" && cidade_de_destino == "Berlim":

                JOptionPane.showMessageDialog(null, "Distância da viagem a percorrer: "+ bruxelas_ate_berlim+"km");
                break;

                case cidade_de_partida == ""
            };
        };
    }
}
