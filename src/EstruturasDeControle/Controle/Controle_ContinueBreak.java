package EstruturasDeControle.Controle;

public class Controle_ContinueBreak {
    public static void main(String[] args) {

        System.out.printf("para no 5\n");

        for (int i = 0; i <= 10; i++) {

            System.out.printf("i = %d\n", i);
            if (i == 5) {
                break;
            }
        }

        System.out.printf("\nelimina os impares\n");

        for (int y = 0; y <= 10; y++) {
            if (y % 2 == 1) {
                continue;
            }
            System.out.printf("y = %d\n", y);

        }

        System.out.printf("\npula o 5\n");

        for (int x = 0; x <= 10; x++) {
            if (x == 5) {
                continue;
            }
            System.out.printf("x = %d\n", x);

        }
    }
}
