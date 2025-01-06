import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cores {

    public static void main(String[] args){

       /* 3) Fazer um programa no qual o usuário deve digitar as
        três cores primárias (amarelo, vermelho, azul) e
        armazenar em um vetor. Solicitar três vezes “Digite uma
        cor primária: ”. Em seguida deve digitar as três cores
        secundárias (laranja, verde, violeta) e armazenar em
        outro vetor. Solicitar três vezes “Digite uma cor
        secundária:
        ”. Um novo vetor deve ser criado com cores
        primárias + secundárias (amarelo, vermelho, azul, laranja,verde, violeta). No início dessa lista
    deve-se adicionar preto e no final branco. Perguntar
        “Adicionar no início da lista: ” e “Adicionar ao final
        da lista: ”. Mostrar na tela a sequência completa,
        incluindo preto e branco.*/

        ArrayList<String> cores_primarias = new ArrayList<>();
        ArrayList<String> cores_secundarias = new ArrayList<>();
        ArrayList<String> todas_as_cores = new ArrayList<>();

        boolean cores_primarias_adicionadas = false;
        boolean azul_adicionado = false;
        boolean vermelho_adicionado = false;
        boolean amarelo_adicionado = false;

        boolean cores_secundarias_adicionadas = false;
        boolean laranja_adicionado = false;
        boolean violeta_adicionado = false;
        boolean verde_adicionado = false;

        while(!cores_primarias_adicionadas){

            String resposta = JOptionPane.showInputDialog("Digite uma cor primária:");

            String resposta_para_analizar = resposta.toUpperCase();

            if(resposta_para_analizar.equals("AMARELO") && !amarelo_adicionado){

                amarelo_adicionado = true;
                cores_primarias.add(resposta_para_analizar);
            }

            if(resposta_para_analizar.equals("VERMELHO") && !vermelho_adicionado){

                vermelho_adicionado = true;
                cores_primarias.add(resposta_para_analizar);
            };

            if(resposta_para_analizar.equals("AZUL") && !azul_adicionado){

                azul_adicionado = true;
                cores_primarias.add(resposta_para_analizar);
            };

            if(azul_adicionado && vermelho_adicionado && amarelo_adicionado){

                cores_primarias_adicionadas = true;
            };
        };

        while(!cores_secundarias_adicionadas){

            String resposta = JOptionPane.showInputDialog("Digite uma cor secundária:");

            String resposta_a_analizar = resposta.toUpperCase();

            if(resposta_a_analizar.equals("LARANJA") && !laranja_adicionado){

                cores_secundarias.add(resposta_a_analizar);
                laranja_adicionado = true;
            };

            if(resposta_a_analizar.equals("VIOLETA") && !violeta_adicionado){

                cores_secundarias.add(resposta_a_analizar);
                violeta_adicionado = true;
            };

            if(resposta_a_analizar.equals("VERDE") && !verde_adicionado){

                cores_secundarias.add(resposta_a_analizar);
                verde_adicionado = true;
            };

            if(verde_adicionado && violeta_adicionado && laranja_adicionado){

                cores_secundarias_adicionadas = true;
            };
        };

        
    }
}
