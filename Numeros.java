import javax.swing.JOptionPane;

public class Numeros {

    public static void main(String[] args){

//        7.12 - Faça um algoritmo que:
// ° leia vários números e,
//º informe quantos números entre 100 e 200 foram digitados (o 100
//        e o 200 não contam),

//        Use input para entrar os números;

//        um botão para mandar ler o número digitado

//        um botão para mostrar os resultados

        boolean nao_mostrar_perguntas = false;
        int contador = 0;

        while(!nao_mostrar_perguntas){

            int resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite um número, caso não queira mais digitar números, digite 0"));

            if(resposta > 100 && resposta < 200){

                contador++;
            };

            nao_mostrar_perguntas = resposta == 0 ? true : false;
        };

        JOptionPane.showMessageDialog(null, "Números digitos entre 100 a 200: "+contador+" números!");
    }
}
