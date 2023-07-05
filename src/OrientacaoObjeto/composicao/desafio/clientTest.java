package OrientacaoObjeto.composicao.desafio;

public class clientTest {
    public static void main(String[] args) {
        ClienteFromDesafio cliente = new ClienteFromDesafio("jose");

        CompraFromDesafio compra1 = new CompraFromDesafio();
        compra1.adicionarItem("caneta", 5.50,100);
        compra1.adicionarItem(new ProdutoFromDesafio("notebook lenovo", 1000.50),2);

        CompraFromDesafio compra2= new CompraFromDesafio();
        compra2.adicionarItem("caneta azul", 2.50,200);
        compra2.adicionarItem(new ProdutoFromDesafio("notebook dell", 1500.50),1);

        //cliente.adicionarCompra(compra1);
        cliente.listaCompra.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
