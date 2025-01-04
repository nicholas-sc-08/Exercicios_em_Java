import javax.swing.JOptionPane;

public class Nao_tem_garcom_de_cara_feia {

    public static void main(String[] args){

        /*5.31 - Não tem garçom de cara feia: Uma empresa abriu uma linha de
        crédito para os funcionários. O valor da prestação não pode ultrapassar
        30% do salário. Faça um programa que receba o salário, o valor do
            empréstimo e quantas prestacoes e informe se o empréstimo pode ser
        concedido. Nenhum dos valores informados pode ser zero ou negativo.*/

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Favor informar qual é seu salário."));

        boolean emprestimo_valido = false;
        double valor_do_emprestimo = 0;
        int trinta_porcento = 30;
        int cem_porcento = 100;
        double trinta_porcento_do_salario;


        while(!emprestimo_valido){

            valor_do_emprestimo = Double.parseDouble(JOptionPane.showInputDialog("Digite qual será o valor do empréstimo:"));

            trinta_porcento_do_salario = (salario * trinta_porcento) / cem_porcento;

           boolean validacao =  valor_do_emprestimo <= trinta_porcento_do_salario && valor_do_emprestimo > 0 ? true : false;

           emprestimo_valido = validacao ? true : false;

           if(!emprestimo_valido){

             JOptionPane.showMessageDialog(null, "Favor inserir um valor menor que 30% do seu salário!");
           };
        };

       int quantias_de_prestacoes = Integer.parseInt(JOptionPane.showInputDialog("Informe em quantas parcelas o empréstimo será pago."));

        JOptionPane.showMessageDialog(null, "O empréstimo pode ser concedido!");

        if (quantias_de_prestacoes > 0) {
        
            JOptionPane.showMessageDialog(null, "Valor a pagar por prestação: R$" + (valor_do_emprestimo / quantias_de_prestacoes));

        } else {

            JOptionPane.showMessageDialog(null, "Valor a pagar do empréstimo realizado: R$" + valor_do_emprestimo);
        }


    }
}
