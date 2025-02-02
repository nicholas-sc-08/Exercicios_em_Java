import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Consecionaria{

    public static ArrayList<Carro> carros = new ArrayList<>();

    public static void main(String[] args){  

        JOptionPane.showMessageDialog(null, "Seja Bem vindo(a) a consecionária!");

        boolean saiu_da_consecionaria = false;

        while(!saiu_da_consecionaria){

            int resposta = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções a seguir:\n\n1) Comprar Carro\n2) Visualizar Carro\n3) Cadastrar Carro\n4) Sair"));

            switch(resposta){

                case 1:
                    comprar_carro();
                    break;
                
                case 2:
                    visualizar_carro();
                    break;

                case 3:

                    cadastrar_carro();
                    break;

                case 4:
                    saiu_da_consecionaria = true;
                    JOptionPane.showMessageDialog(null, "Obrigado por visitar a Consecionária!");
                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas!");
                    break;
            };
        };
    };

    private static void comprar_carro(){

        int minimo_de_carros_necessario = 1;

        if(carros.size() < minimo_de_carros_necessario){

            JOptionPane.showMessageDialog(null, "Não há nenhum carro disponível para compra!");
        } else {

            String resposta = JOptionPane.showInputDialog("Digite o modelo do veículo: ");

            if(carros.contains(resposta)){


            } else {


            };
        };
    };

    private static void cadastrar_carro(){

        String modelo_do_carro = JOptionPane.showInputDialog("Digite o modelo do carro que deseja cadastrar:");

        if(modelo_do_carro != null){

            String ano_de_lancamento = JOptionPane.showInputDialog("Digite o ano de lançamento do carro:");

            if(ano_de_lancamento != null){

                double preco_do_carro = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do carro:"));

                if(preco_do_carro > 0){
                    
                    Carro carro = new Carro(modelo_do_carro, ano_de_lancamento, preco_do_carro);

                    JOptionPane.showMessageDialog(null, "Carro cadastrado na consecionária com sucesso!");
                    carros.add(carro);

                } else {

                    JOptionPane.showMessageDialog(null, "Favor digitar um preço");
                };

            } else {

                JOptionPane.showMessageDialog(null, "Favor digitar um ano de lançamento!");
            };

        } else {

            JOptionPane.showMessageDialog(null, "Digite um modelo de carro!");
        };
    };

    private static void visualizar_carro(){

        if(carros.size() > 0){

            for(Carro carro : carros){

                JOptionPane.showMessageDialog(null, "Modelo do carro: "+carro.modelo+"\nAno de Lançamento: "+carro.ano_de_lancamento+"\nPreço: "+carro.preco);
            };

        } else {

            JOptionPane.showMessageDialog(null, "Parece que não há nenhum carro em sua consecionária!");
        };
    };
}
