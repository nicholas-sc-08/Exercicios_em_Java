import javax.swing.JOptionPane;

//Objeto para o arquivo "Fila.java"

public class Pessoa{

    String nome;
    int idade;

    public Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;
    };

    void mostrar_informacoes(){

        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade);
    };
}
