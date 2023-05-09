package fundamentos.operadores;

public class atribuicao {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = a + b;

        System.out.println("c = c + b: " + (c += b));
        System.out.println("c = c - b: " + (c -= b));
        System.out.println("c = c * b: " + (c *= b));
        System.out.println("c = c / b: " + (c /= b));
        System.out.println("c = c % b: " + (c %= b));

    }
}
