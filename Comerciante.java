import javax.swing.JOptionPane;

public class Comerciante {

    public static void main(String[] args){

        /*5.23 – Um comerciante comprou um produto e quer vendê-lo com lucro de
        45% se o valor da compra for menor que R$20,00; caso contrário, o lucro
        será de 30%. Faça um programa que entre com o valor do produto e mostre
        o valor de venda.*/

        double valor_a_comparar = 20.00;
        int menor_lucro = 30;
        int maior_lucro = 45;
        int cem_porcento = 100;
        double valor_final_da_compra;

        String valor_da_compra = JOptionPane.showInputDialog(null, "Qual será o valor da compra?");

        if(Double.parseDouble(valor_da_compra) > valor_a_comparar){

          valor_final_da_compra = (Double.parseDouble(valor_da_compra) * menor_lucro) / cem_porcento;

        } else {

            valor_final_da_compra = (Double.parseDouble(valor_da_compra) * maior_lucro) / cem_porcento;
        }
        valor_final_da_compra += Double.parseDouble(valor_da_compra);

        JOptionPane.showMessageDialog(null, "Total da compra de: R$"+valor_final_da_compra);

    }
