package ArrayCollections;

public class ArrayMaiorMenorMedia {
    public static void main(String[] args) {
        int[] numeros = {1, 23, 5, 6, 75};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media / numeros.length);

    }
}
