import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Tour_pela_europa{

    // 5) Você está fazendo um mochilão pela Europa e precisa saber qual Tour_pela_europa distância que vai percorrer em determinada viagem ou trecho da viagem, utilizando trem. De Bruxelas até Berlim são 764km e de Berlim até Praga são 350km. De Praga até Viena são mais 292km. De Viena até Budapeste, são outros 242km. Faça um sistema no qual o usuário digite a cidade de origem, em seguida a cidade de destino. Mostrar na tela a distância total (km) da viagem.

    // Bruxelas <-> Berlim = 764km
    // Berlim <-> Praga = 350km
    // Praga <-> Viena = 292km
    // Viena <-> Budapeste = 242km

    public static String cidade_de_partida;
    public static String cidade_de_destino;

    public static int bruxelas_ate_berlim = 764;
    public static int berlim_ate_praga = 350;
    public static int praga_ate_viena = 292;
    public static int viena_ate_budapeste = 242;

    public static void main(String[] args){


        escolher_cidade_de_origem();
    }

    private static void escolher_cidade_de_origem(){

        boolean cidade_escolhida = false;

        while(!cidade_escolhida){

        int cidade_de_origem = Integer.parseInt(JOptionPane.showInputDialog("Seja Bem-vindo(a)!\n\nFavor escolher a cidade de origem entre as opções a seguir:\n\n1) Bruxelas\n2) Berlim\n3) Praga\n4) Viena\n5) Budapeste"));

        if(cidade_de_origem == 1){

            Tour_pela_europa.cidade_de_partida = "Bruxelas";
            cidade_escolhida = true;
        
        } else if(cidade_de_origem == 2){

            Tour_pela_europa.cidade_de_partida = "Berlim";
            cidade_escolhida = true;

        } else if(cidade_de_origem == 3){

            Tour_pela_europa.cidade_de_partida = "Praga";
            cidade_escolhida = true;
        
        } else if(cidade_de_origem == 4){

            Tour_pela_europa.cidade_de_partida = "Viena";
            cidade_escolhida = true;
        } else if(cidade_de_origem == 5){

            Tour_pela_europa.cidade_de_partida = "Budapeste";
            cidade_escolhida = true;
        } else {

            JOptionPane.showMessageDialog(null, "Favor escolher uma opção válida");
        };
        };

        escolher_cidade_de_destino();
    };

    private static void escolher_cidade_de_destino(){

        boolean cidade_escolhida = false;

        while(!cidade_escolhida){

        int cidade_de_origem = Integer.parseInt(JOptionPane.showInputDialog("Seja Bem-vindo(a)!\n\nFavor escolher a cidade de origem entre as opções a seguir:\n\n1) Bruxelas\n2) Berlim\n3) Praga\n4) Viena\n5) Budapeste"));

        if(cidade_de_origem == 1 && Tour_pela_europa.cidade_de_partida != "Bruxelas"){

            Tour_pela_europa.cidade_de_destino = "Bruxelas";
            cidade_escolhida = true;
        
        } else if(cidade_de_origem == 2 && Tour_pela_europa.cidade_de_partida != "Berlim"){

            Tour_pela_europa.cidade_de_destino = "Berlim";
            cidade_escolhida = true;

        } else if(cidade_de_origem == 3 && Tour_pela_europa.cidade_de_partida != "Praga"){

            Tour_pela_europa.cidade_de_destino = "Praga";
            cidade_escolhida = true;
        
        } else if(cidade_de_origem == 4 && Tour_pela_europa.cidade_de_partida != "Viena"){

            Tour_pela_europa.cidade_de_destino = "Viena";
            cidade_escolhida = true;
        } else if(cidade_de_origem == 5 && Tour_pela_europa.cidade_de_partida != "Budapeste"){

            Tour_pela_europa.cidade_de_destino = "Budapeste";
            cidade_escolhida = true;
        } else {

            JOptionPane.showMessageDialog(null, "Favor escolher uma opção válida");
        };
        };

        exibir_resultados();
    };

    private static void exibir_resultados(){

        if(Tour_pela_europa.cidade_de_partida == "Bruxelas" && Tour_pela_europa.cidade_de_destino == "Berlim"){

            JOptionPane.showMessageDialog(null, "Distância até a cidade de destino: "+ bruxelas_ate_berlim+"km");
        
        } else if(Tour_pela_europa.cidade_de_partida == "Berlim" && Tour_pela_europa.cidade_de_destino == "Praga"){

            JOptionPane.showMessageDialog(null, "Distância até a cidade de destino: "+berlim_ate_praga+"km");
        
        } else if(Tour_pela_europa.cidade_de_partida == "Praga" && Tour_pela_europa.cidade_de_destino == "Viena"){

            JOptionPane.showMessageDialog(null, "Distância até a cidade de destino: "+praga_ate_viena+"km");
        
        } else {

            JOptionPane.showMessageDialog(null, "Distância até a cidade de destino"+viena_ate_budapeste+"km");

        } ;
    };
}
