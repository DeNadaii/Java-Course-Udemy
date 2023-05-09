package fundamentos.aplicacoes;

public class temperatural {
    public static void main(String[] args) {

        double tempFahrenheit = 86;
        double multiplicador = 5.0/9.0;
        double temperaturaTransformada = (tempFahrenheit - 32.0)*multiplicador;

        System.out.println(temperaturaTransformada);

    }
}
