package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 3.6;

        String resultado = media >= 7.0 ?
                "aprovado" : media >=5.6 ?
                "em recuperacao" : "reprovado";

        System.out.println("o aluno esta " + resultado);
    }
}
