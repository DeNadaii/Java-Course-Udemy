package fundamentos.notacao;

public class notacaoPonto {
    public static void main(String[] args) {

        String a = "bom dia X";

        a = a.replace("X","senhora");
        a = a.toUpperCase();
        a = a.concat("!!!!");

        System.out.println(a);
    }
}
