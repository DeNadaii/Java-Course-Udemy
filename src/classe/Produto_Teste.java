package classe;

public class Produto_Teste {

    public static void main(String[] args) {

        //Criando um objeto com os parametros
        Produto p1 = new Produto("Notebook",4000,0.20 );
        double resultado = p1.calculaDesconto();

        //criando um objeto Sem os parametros e declarando eles depois
        Produto p2 = new Produto();
        p2.nome = "monitor";
        p2.preco = 2000;
        p2.desconto = 0.0;

        System.out.println("p2 " + p2.calculaDesconto());
        System.out.println("p1 " + resultado);
        System.out.println(Produto.marca);
    }

}
