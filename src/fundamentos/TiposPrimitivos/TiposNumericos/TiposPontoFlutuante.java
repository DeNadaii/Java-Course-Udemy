package fundamentos.TiposPrimitivos.TiposNumericos;

public class  TiposPontoFlutuante {
    public static void main(String[] args) {
        //float
        float floatPositivo = 1.5555555f;
        float floatNegativo = -1.5555555f;
        System.out.printf("tipo float tem tamanho de 4 bytes e guarda por volta de 6 casas decimais: %f e %f",floatPositivo,floatNegativo);
        //double
        double doubleNegativo = 1.555555555555555;
        double doublePositivo = -1.555555555555555;
        System.out.printf("\ntipo double tem tamanho de 8 bytes e guarda por volta de 15 casas decimais: %.15f e %.15f",doublePositivo,doubleNegativo);
    }
}
