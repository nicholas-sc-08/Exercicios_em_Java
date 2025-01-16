import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Usuarios {

    static ArrayList<String> nomes_cadastrados = new ArrayList<>();

    public static void main(String[] args){

       /* 7) Faça um programa que crie um vetor vazio.
        Esse programa deve perguntar qual opção o
        usuário deseja (1, 2, 3, 0) e as opções devem
        executar as tarefas abaixo. Criar as mensagens e a
        forma de pesquisa / lista, da forma que achar melhor.

        ======== MENU ========
        1- Cadastrar nome
        2- Excluir um nome
        3- Editar um nome
        4- Pesquisar se um nome está cadastrado
        5- Listar todos os nomes cadastrados
        0- Sair do programa
        */

        boolean loop_encerrado = false;

        while(!loop_encerrado){

        int resposta_do_usuario = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar nome\n2- Excluir um nome\n3- Editar um nome\n4- Pesquisar se um nome está cadastrado\n5- Listar todos os nomes cadastrados\n0- Sair do programa"));

            switch(resposta_do_usuario){

                case 1:
                    cadastrar_nome();
                    break;

                case 2:
                    excluir_nome();
                    break;

                case 3:
                    cadastrar_nome();
                    break;

                case 4:
                    cadastrar_nome();
                    break;

                case 5:
                    cadastrar_nome();
                    break;

                case 0:

                    loop_encerrado = true;
                    break;
            };

        };
    };

    private static void cadastrar_nome(){

        String resposta = JOptionPane.showInputDialog("Favor inserir um nome para ser cadastrado!");

        nomes_cadastrados.add(resposta);

        JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
    };

    private static void excluir_nome(){

        String resposta = JOptionPane.showInputDialog("Qual nome deseja excluir?");

        if(nomes_cadastrados.contains(resposta)){

            nomes_cadastrados.remove(resposta);

            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!");

        } else {

            JOptionPane.showMessageDialog(null, "Nome não cadastrado!");
        };
    };
}
