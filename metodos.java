
import java.util.ArrayList;

public class metodos{

    
    
    public static void main(String[] args){
        
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();

        // Métodos de Arrays

        //javascript para java

        // .push(), .pop(), .unshift()
        // .add(), .remove(), .add(0, variavel);

        // .push() -> .add()

        nomes.add("User 1");
        nomes.add("User 2");

        numeros.add(1);
        numeros.add(2);

        System.out.println("Array nomes: "+ nomes);
        System.out.println("Array números: "+ numeros);

        // .pop() -> .remove()

        nomes.remove(nomes.size() - 1);
        numeros.remove(numeros.size() - 1);
    
        System.out.println("Array nomes pós .remove(): "+ nomes);
        System.out.println("Array números pós .remove(): "+ numeros);
    }
}
