package fundamentos.TiposPrimitivos.TiposNumericos;

public class TiposIntegrais {
    public static void main(String[] args) {
        //tipo integrais
        //byte
        byte varByteNegativa = -127;
        byte varBytePositiva = 127;
        System.out.println("tipo byte tem tamanho de 1 byte e vai de: " + varBytePositiva + " a " + varByteNegativa + "\n");
        //short
        short varShortNegativa = -32768;
        short varShortPositiva = 32767;
        System.out.println("tipo short tem tamanho de 2 bytes e vai de: " + varShortPositiva + " a " + varShortNegativa + "\n");
        //int
        int varIntNegativa = -2147483648;
        int varIntPositiva = 2147483647;
        System.out.println("tipo int tem tamanho de 4 bytes e vai de: " + varIntPositiva + " a " + varIntNegativa + "\n");
        //long
        long varlongNegativa = -9223372036854775808L;
        long varlongPositiva = 9223372036854775807L;
        System.out.println("tipo long tem tamanho de 8 bytes e vai de: " + varlongPositiva + " a " + varlongNegativa + "\n");

        char o = 111;
        char l = 108;
        char a = 97;
        System.out.println("tipo char tem tamanho de 2 bytes e usa a tabela ASCII");
        System.out.println("o = 111, l = 108, a = 97");
        System.out.printf("ola com char: %c%c%c",o,l,a);

    }
}
