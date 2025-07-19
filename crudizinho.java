
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class crudizinho{

    public static ArrayList<clientela> vetor_clientes = new ArrayList<>();
    
    public static void cadastrar(){

        String novo_nome = JOptionPane.showInputDialog("Insira o nome de usuário: ");
        String nova_idade = JOptionPane.showInputDialog("Insira a idade de usuário: ");
        String novo_email = JOptionPane.showInputDialog("Insira seu email: ");

        for(clientela cliente : vetor_clientes){

            if(cliente.email.equals(novo_email)){

                JOptionPane.showMessageDialog(null, "Email já cadastrado!");
                return;
            
            } else {

                clientela novo_cliente = new clientela(novo_nome, Integer.parseInt(nova_idade), novo_email);
                vetor_clientes.add(novo_cliente);
            };
        };
    };

    public static void editar(){


    };

    public static void atualizar(){


    };

    public static void excluir(){


    };

    public static void main(String[] args){

        boolean fim_do_crudizinho = false;

        while(!fim_do_crudizinho){

           String opcao_selecionada = JOptionPane.showInputDialog("1) Cadastrar\n2) Editar\n3) Atualizar\n4) Excluir\n4) Excluir\n5) Sair");

            switch(opcao_selecionada){

                case "1":
                
                cadastrar();
                break;

                case "2":

                editar();
                break;

                case "3":

                atualizar();
                break;

                case "4":

                excluir();
                break;

                case "5":

                fim_do_crudizinho = true;
                break;

                default:

                JOptionPane.showMessageDialog(null, "Favor selecionar uma opção válida!");
                break;
            };            
        };

    };
    
}
