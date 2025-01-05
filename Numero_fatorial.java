import javax.swing.JOptionPane;

public class Numero_fatorial {

    public static void main(String[] args){

       // 2) Fazer um programa que calcule o fatorial de um número. Fatorial 
       //é a multiplicação do próprio número por todos abaixo dele até 1. (Exemplo do fatorial de 5 seria: 5x4x3x2x1 = 120. Fatorial de 5 é 120).

        int numero_fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número fatorial."));

        int resultado = 0;

        for(int i = numero_fatorial; i > 0; i--){

            if(i != numero_fatorial){

                if(resultado == 0){

                resultado = numero_fatorial * i;

                } else {

                    resultado *= i;
                };
            };
        };

        JOptionPane.showMessageDialog(null,"Resultado é de: "+resultado);
    }
}
