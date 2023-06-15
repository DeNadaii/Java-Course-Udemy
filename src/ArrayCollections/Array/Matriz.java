package ArrayCollections.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("qnts alunos");
        int qtdeAlunos = entrada.nextInt();

        System.out.println("qnts notas por aluno");
        int qtdeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++){
            for (int b = 0; b < notasDaTurma[a].length; b++){

                System.out.printf("intorme a nota %d do aluno %d: ",b+1,a+1);
                notasDaTurma[a][b] = entrada.nextDouble();
                total += notasDaTurma[a][b];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.printf("media: %.2f \n", media);

        for(double[] notas : notasDaTurma) {
            System.out.println(Arrays.toString(notas));
        }
        entrada.close();
    }
}
