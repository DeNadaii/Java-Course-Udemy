package fundamentos.operadores;

public class unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("a = "+ a);
        System.out.println("a = a + 1 -> " + (++a));
        System.out.println("a = "+ a);
        System.out.println("a = a - 1 -> " + (--a));

        System.out.println("\nb = "+ b);
        System.out.println("b = b - 1 -> " + (b--));
        System.out.println("b = "+ b);
        System.out.println("b = b + 1 -> " + (b++));

        //a incrementação antes da variavel(++a) tem uma prioridade maior do que
        //a decrementacao depois da variavel(b--), mesmo elas executando
        //a mesma funcao. O java primeiro incrementa a, compara, e depois
        //decrementa b
        System.out.println("\n++a -->" + (++a));
        System.out.println("b-- -->" + (b--));
        System.out.println("--b -->" + (--b));

        System.out.println("++a == b-- ? -->" + (++a == b--));
        System.out.println("++a == --b ? -->" + (++a == --b));



    }
}
