import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Fila{

// >>>>>>>>>>>>>>>>>>> Atividade 1 (2,0) <<<<<<<<<<<<<<<<<<<

// Um parque aquático recém inaugurou uma das suas mais incríveis 
// atrações: ComboLoco, um toboágua gigante. Para organização das filas, 
// resolveu separar em grupos de 10 pessoas por vez, onde as crianças 
// tem preferência em relação aos adultos. Criar um sistema que simule 
// essa fila. Deve-se perguntar o nome e a idade de cada uma das 10 
// pessoas, caso seja criança (menor que 12 anos) vai para o início da 
// fila, caso não seja criança, vai para o final da fila. Ao final, 
// mostrar a fila com os nomes.

//Exemplo: João, 60 anos, chegou. Astrogildo, 67 anos chegou. 
//Alícia, 9 anos, chegou. Enzo, 10 anos, chegou. 
//Suzana, 25 anos, chegou.
// Fila: Enzo, Alícia, João, Astrogildo, Suzana

// Critérios de avaliação:

// (0,5) Receber nome e idade das pessoas.
// (1,0) Adicionar no local correto (início ou fim) da fila. 
// (0,5) Mostrar a lista completa com os nomes.

    public static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args){

        JOptionPane.showMessageDialog(null, "Seja bem-vindo(a)!");

        for(int i = 0; i < 10; i++){
        
        String nome_pessoa = JOptionPane.showInputDialog("Favor digite seu nome:");

        int idade_pessoa = Integer.parseInt(JOptionPane.showInputDialog("Favor digite sua idade:"));
        
        Pessoa nova_pessoa = new Pessoa(nome_pessoa, idade_pessoa);
        
        if(idade_pessoa < 12){
            
            pessoas.add(0, nova_pessoa);

            nova_pessoa.chegada_de_pessoas();

        } else {

            pessoas.add(nova_pessoa);

            nova_pessoa.chegada_de_pessoas();
        };
        };

        for(Pessoa pessoa : pessoas){

            pessoa.mostrar_informacoes();
        };      
    };
}
