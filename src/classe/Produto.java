package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;
    static String marca = "LG";

    //quando se cria um construtor na classe, o contrutor padrao deixa de existir

    //criando um construtor padrao, sem parametros
    Produto(){

    }
    //criando um construtor, com parametros
    Produto(String nomeInicial, double precoInicial) {
        this.nome = nomeInicial;
        this.preco = precoInicial;

    }
    public double calculaDesconto() {

        double precoFinal = this.preco * (1 - this.desconto);
        return precoFinal;
    }
}
