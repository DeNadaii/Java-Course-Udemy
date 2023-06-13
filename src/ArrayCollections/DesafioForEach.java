package ArrayCollections;

import java.util.Scanner;

public class DesafioForEach {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdNotas = 0;
        double somaNotas = 0;

        System.out.println("Quantas Notas vc quer calcular a média ?");
        qtdNotas = Integer.parseInt(entrada.nextLine());

        double[] notasAluno = new double[qtdNotas];

        for (int i = 0; i < notasAluno.length; i++){
            System.out.println("digite uma nota");
            notasAluno[i] = Double.parseDouble(entrada.nextLine());
        }

        for (double nota : notasAluno){
            somaNotas += nota;
        }

        double media = somaNotas/notasAluno.length;
        System.out.println("média: " + media);

        entrada.close();
    }
}
