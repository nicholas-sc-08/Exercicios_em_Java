import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Sabores_de_sorvete {

    private static void adicionar_sabor(){
        
    };
    
    private static void remover_sabor(){
        
    };
    
    private static void visualizar_sorvete(){
        
    };
    
    private static void finalizar_pedido(){
        
    };

    public static void main(String[] args){

        /*6) Uma sorveteria possui um sistema de self-service de
        sorvetes no qual o cliente pode montar seu sorvete com
        até 4 bolas (sabores). Criar um programa que simule esse
        sistema. A montagem do sorvete segue o modelo de
        estrutura PILHA, onde os sabores são "empilhados" um
        após o outro e quando algum tiver que ser removido,
        será sempre o último da pilha.

        1- Adicionar sabor
        2- Remover sabor
        3- Visualizar sorvete
        4- Finalizar pedido

                ======== MENSAGENS e VALIDAÇÕES ========
        Opção 1-> “Sabor adicionado!”   OU   “Limite de sabores atingido, remova um sabor!”
        Opção 2-> “Sabor removido!”   OU   “Não existem sabores adicionados!”
        Opção 3-> “"Camada 1 - Sabor X, Camada 2 - Sabor Y, etc.”   OU   “Seu sorvete não possui sabores!”
        Opção 4-> “Pedido realizado!”   OU   “Adicione pelo menos um sabor!”
        */

        ArrayList<String> sorvete = new ArrayList<>();
        boolean pedido_finalizado = false;

        while(!pedido_finalizado){

        String resposta = JOptionPane.showInputDialog("1- Adicionar saber\n2- Remover sabor\n3- Visualizar sorvete\n4- Finalizar pedido");

        switch(resposta){

            case "1":
                adicionar_sabor();
                break;

            case "2":
                remover_sabor();
                break;

            case "3":
                visualizar_sorvete();
                break;

            case "4":
                finalizar_pedido();
                break;
        };
        };

    }

}
