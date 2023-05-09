package fundamentos.notacao;

public class tipoStringEquals {
    public static void main(String[] args) {

        String s = new String("2");
        String s1 = "          palavra";
        String S2 = "palavra";

        System.out.println("2" == s);
        System.out.println("2".equals(s));
        System.out.println("primeira string: " + s1);
        System.out.println("segunda string: " + S2);
        System.out.println("aplicando trim: " + s1.trim());
        System.out.println("aplicando trim e equals : " + s1.trim().equals(S2));

    }
}
