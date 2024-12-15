public class Trocando_duas_variaveis {

    public static void main(String[] args){

        String x = "Água";
        String y = "Tang";
        String temp = null;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
