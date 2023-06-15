package EstruturasDeControle.DesafioModulo;

public class Desafio_For {
    public static void main(String[] args) {
        String valor = "#";
        for (int i = 1; i<= 5; i++){
            System.out.println(valor);
            valor += "#";
        }
        //sem usar valor numerico
        for (String v = "#"; !v.equals("#####"); v += "#"){
            System.out.println(v);
        }
    }
}
