package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {

        // E (%%)
        System.out.println("\nTabela verdade E (%%)");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        // OU (||)
        System.out.println("\nTabela verdade OU (||)");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // XOR (^)
        System.out.println("\nTabela verdade OU EXCLUSIVO (^) ");
        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));

        // NOT (!)
        System.out.println("\nTabela verdade NOT (!) ");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
    }
}
