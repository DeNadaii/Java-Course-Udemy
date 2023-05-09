package fundamentos.aplicacoes;

public class artimeticosProblema {

    public static void main(String[] args) {
//      equacaoOriginal: (([6*(3+2)]^2/3*2) - (((1-5)*(2-7))/2)^2)^3 / 10^3

        int primeiraDivisao = ((int) Math.pow(6*(3+2),2))/(3*2);
        int segundaDivisao = (int) Math.pow((((1-5)*(2-7))/2),2);
        int equacaoDividendo = (int) Math.pow((primeiraDivisao - segundaDivisao),3);
        int divisor = (int) Math.pow(10,3);
        int resultadoFinal = equacaoDividendo/divisor;

        System.out.println(primeiraDivisao);
        System.out.println(segundaDivisao);
        System.out.println(equacaoDividendo);
        System.out.println(divisor);
        System.out.println(resultadoFinal);
    }


}
