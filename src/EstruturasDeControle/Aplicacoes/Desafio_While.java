package EstruturasDeControle.Aplicacoes;

import java.util.Scanner;

public class Desafio_While {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        int NumeroDeNotas = 0;
        double SomaDasNotas = 0;

        System.out.println("para parar de executar o programar, digite -1");
        System.out.println("digite Somente Notas entre 1 e 10");

        //nota >=10 nota <=0
        while (nota != -1) {

            nota = Double.parseDouble(entrada.nextLine());

            if (nota <= 10 && nota >= 0) {
                NumeroDeNotas++;
                SomaDasNotas += nota;
                System.out.printf("quantidade de notas digitadas: %d \n", NumeroDeNotas);
            } else if (nota == -1) {
                System.out.println("calculando Media: ");
            } else {
                System.out.println("nota invalida, pfvr digite uma nota valida");
            }
        }

        double Media = SomaDasNotas / NumeroDeNotas;
        System.out.printf("a media da turma eh: %.2f ", Media);

        entrada.close();
    }
}
