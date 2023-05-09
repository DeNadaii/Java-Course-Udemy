package EstruturasDeControle.Controle;

public class Controle_ContinueRotulado {
    public static void main(String[] args) {

        System.out.printf("neste caso, o break sai do laço externo");

        externo:
        for (int i = 0; i < 3; i++) {
            interno:
            for (int j = 0; j < 3; j++) {

                if (i == 1) {
                    continue externo;
                }
                System.out.printf("[i = %d][j = %d] \n", i, j);
            }
        }
    }
}
