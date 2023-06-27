package OrientacaoObjeto.composicao.UmPraMuitos;

public class compraTest {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "jao";
        c1.adicionarItem(new Item("caneta",20,2.5));
        c1.adicionarItem(new Item("caderno",3,15.5));
        System.out.println(c1.itensNaLista.size());
        System.out.println(c1.getValorTotal());
    }
}
