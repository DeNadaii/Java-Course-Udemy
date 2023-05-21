package classe;

public class valorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuicao por valor (primitivo)

        a++;
        b--;
        System.out.println("a++ " + a + "\nb-- " + b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; // atribuicao por referencia (objeto)

        d1.dia = 25;
        d1.mes = 11;
        d1.ano = 2025;

        System.out.println(d1.formatDate());
        System.out.println(d2.formatDate());

        voltarData(d1);

        System.out.println(d1.formatDate());
        System.out.println(d2.formatDate());

        int c = 5;
        alteraPrimitivo(c);
        System.out.println(c);
    }

    static void voltarData(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    static void alteraPrimitivo(int a){
        a++;
    }

}
