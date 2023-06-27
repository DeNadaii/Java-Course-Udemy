package OrientacaoObjeto.composicao.UmPraMuitos;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itensNaLista = new ArrayList<Item>();
    void adicionarItem(Item item){
        itensNaLista.add(item);
        item.compra = this;
    }
    double getValorTotal(){
        double total = 0;
        for (Item itens : itensNaLista){
            total += itens.quantidade * itens.preco;
        }
        return total;
    }
}
