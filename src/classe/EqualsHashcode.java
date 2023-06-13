package classe;

public class EqualsHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("kiko", "kiko@gmail.com");
        Usuario u2 = new Usuario("kiko", "kiko@gmail.com");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

    }
}
