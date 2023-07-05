package OrientacaoObjeto.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class CompraFromDesafio {
    List<ItemFromDesafio> listaItem = new ArrayList<>();
    public void adicionarItem(ProdutoFromDesafio p, int qtd){
        this.listaItem.add(new ItemFromDesafio(qtd,p));
    }
    public void adicionarItem(String nome,double preco, int qtd){
        var produto = new ProdutoFromDesafio(nome,preco);
        this.listaItem.add(new ItemFromDesafio(qtd,produto));
    }
    public double valorTotal(){
        double total = 0;
        for (ItemFromDesafio item : listaItem){
            total += item.qtd * item.produto.preco;
        }
        return total;
    }
}
