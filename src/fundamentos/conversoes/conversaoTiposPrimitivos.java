package fundamentos.conversoes;

public class conversaoTiposPrimitivos {

    public static void main(String[] args) {

        //cast
        double a = 1.12345678910;
        System.out.println(a);

        float b = (float) a;
        System.out.println(b);

        int c = 127; //maior numero possivel
        System.out.println(c);

        byte d = (byte) c;
        System.out.println(d);

        double e = 1.99999;
        System.out.println(e);
        int i = (int) e;
        System.out.println(i);


    }

}
