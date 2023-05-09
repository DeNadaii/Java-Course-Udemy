public class Main {
    public static void main(String[] args) {

        int entrada1 = Integer.parseInt(args[0]);
        int entrada2 = Integer.parseInt(args[1]);
        int soma = entrada1 + entrada2;


        System.out.println("primeiro numero");
        System.out.println(args[0]);
        System.out.println("segundo numero");
        System.out.println(args[1]);
        System.out.printf("resultado é : %d", soma);

    }
}