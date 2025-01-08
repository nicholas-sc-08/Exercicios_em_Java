import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Produtos {

    public static void main(String[] args){

        //4) Faça um programa em que o usuário digite o nome de 5 produtos e seus preços (“Digite o produto” / “Digite o seu preço”) e armazene esses nomes e preços em dois vetores separados. O programa deve calcular e mostrar:

        //a) A quantidade de produtos com preço inferior a R$50;
        //b) O nome dos produtos com preço de R$50 a R$100;
        //c) A média dos preços dos produtos com preço superior a R$100.

        ArrayList<String> nomes_dos_produtos = new ArrayList<>();

        ArrayList<Double> preco_dos_produtos = new ArrayList<>();

        int quantidade_produtos_inferior_a_cinquenta = 0;
        int quantidade_produtos_superior_a_cem = 0;
        double soma_dos_produtos_acima_de_cem = 0;
        ArrayList<String> nome_dos_produtos_com_preco_de_cincquenta_a_cem = new ArrayList<>();

        for(int i = 0; i < 5; i++){

            String resposta_a = JOptionPane.showInputDialog("Digite o nome do "+ (i + 1) +"º produto:");

            double resposta_b = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do "+ (i + 1) + "º produto:"));

            if(resposta_b < 0 ){

                JOptionPane.showMessageDialog(null, "Favor inserir um preço válido!");
                i--;
            } else {

                nomes_dos_produtos.add(resposta_a);
                preco_dos_produtos.add(resposta_b);
            };
        };

        for(int i = 0; i < preco_dos_produtos.size(); i++){

            if(preco_dos_produtos.get(i) < 50){

                quantidade_produtos_inferior_a_cinquenta += 1;

            } else if(preco_dos_produtos.get(i) >= 50 && preco_dos_produtos.get(i) < 100){

                nome_dos_produtos_com_preco_de_cincquenta_a_cem.add(nomes_dos_produtos.get(i));
            } else {

                soma_dos_produtos_acima_de_cem += Double.parseDouble(String.valueOf(preco_dos_produtos.get(i)));

                quantidade_produtos_superior_a_cem += 1;
            };
        };

        soma_dos_produtos_acima_de_cem /= quantidade_produtos_superior_a_cem;

        JOptionPane.showMessageDialog(null, "Quantidade de produtos com preço abaixo de R$50: " + quantidade_produtos_inferior_a_cinquenta + "\n Nome dos produtos com preço entre R$50 a R$100: "+ nome_dos_produtos_com_preco_de_cincquenta_a_cem + "\nMédia dos preços dos produtos acima de R$100: R$"+ soma_dos_produtos_acima_de_cem);
    }
}
