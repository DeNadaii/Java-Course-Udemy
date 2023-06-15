package ArrayCollections.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        SortedSet<String> lista = new TreeSet<>();
        lista.add("jao");
        lista.add("Ana");
        lista.add("Pedro");
        for(String candidaato : lista){
            System.out.println(candidaato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(3);
        nums.add(2);
        nums.add(1);
        //nums.get(3); n é possivel

        for(int numero : nums){
            System.out.println(numero);
        }
    }
}
