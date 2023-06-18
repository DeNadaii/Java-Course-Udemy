package ArrayCollections.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        //FIFO - first in first out
        //o tamanho da fila pode ser definido previamente.
        Queue<String> fila = new LinkedList<>();

        //caso a fila esteja cheia, .add() e .offer() se comportarao diferente
        fila.add("gui");//.add() -> lançará uma exceção caso a fila esteja cheia.
        fila.offer("rafa");//.offer() -> retorna falso caso a fila esteja cheia.

        //olha o primeiro elemento da lista
        //caso a fila esteja vazia, .peek() e .element() se comportarão diferente
        fila.peek();//.peek() -> retornara "null" se a fila estiver vazia
        fila.element();//.element() -> lançará uma exceção caso a fila esteja vazia

        //pega o primeiro item da fila e o remove.
        //caso a fila esteja vazia, .poll() e .remove() se comportarão diferente
        fila.poll();//.poll() -> se estiver vazia retorna null
        fila.remove();//.remove() -> se estiver vazia retorna exerçap

        //outros metodos uteis:
        fila.size();//.size() -> retorna o tamanho da fila
        fila.clear();//.clear() -> limpa a fila
        fila.isEmpty();//.isEmpty() -> checa se a fila está vazia
        fila.contains("argumento");//.contains("argumento") -> checa se a fila contem o argumento

    }
}
