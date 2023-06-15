package ArrayCollections.Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //double -> Double
        conjunto.add(true); //boolean -> Boolean
        conjunto.add(1); //int -> Integer
        conjunto.add("test"); // String
        conjunto.add("test"); // String

        System.out.println("tamanho: " + conjunto.size());
        System.out.println(conjunto.remove("test"));
        System.out.println("tamanho: " + conjunto.size());
        System.out.println(conjunto.contains("test"));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(conjunto);
        System.out.println(nums);

        //conjunto.addAll(nums);
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
