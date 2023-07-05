package OrientacaoObjeto.composicao.desafio;

import OrientacaoObjeto.composicao.UmPraMuitos.Compra;

import java.util.ArrayList;
import java.util.List;

public class ClienteFromDesafio {
    final String nome;
    final List<CompraFromDesafio> listaCompra = new ArrayList<>();
    ClienteFromDesafio(String nome){
        this.nome = nome;
    }
    void adicionarCompra(CompraFromDesafio compra){
        this.listaCompra.add(compra);
    }
    double obterValorTotal(){
        double total = 0;
        for (CompraFromDesafio compras : listaCompra){
            total += compras.valorTotal();
        }
        return total;
    }
}
