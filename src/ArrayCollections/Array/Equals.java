package ArrayCollections.Array;

import ArrayCollections.Usuario;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("kiko", "kiko@gmail.com");
        Usuario u2 = new Usuario("kiko", "kiko@gmail.com");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        System.out.println(u2.equals(new Date()));

    }
}
