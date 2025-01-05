public class Metodos_Math {

    public static void main(String[] args){

        int w = 81;
        int x = -10;
        double y = 3.14;

        double a = Math.min(x, y);
        double b = Math.max(x, y);
        double c = Math.abs(x);
        double d = Math.sqrt(w);

        System.out.println("Menor número: "+a);
        System.out.println("Maior número: "+b);
        System.out.println("Número absoluto: "+c);
        System.out.println("Raiz quadrada do "+w+" é de: "+d);
    }
}
