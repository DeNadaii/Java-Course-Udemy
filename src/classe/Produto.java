package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    static String marca = "LG";

    //quando se cria um construtor na classe, o contrutor padrao deixa de existir

    //criando um construtor padrao, sem parametros
    Produto(){

    }
    //criando um construtor, com parametros
    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        this.nome = nomeInicial;
        this.preco = precoInicial;
        this.desconto = descontoInicial;
    }
    public double calculaDesconto() {

        double precoFinal = this.preco * (1 - this.desconto);
        return precoFinal;
    }
}
