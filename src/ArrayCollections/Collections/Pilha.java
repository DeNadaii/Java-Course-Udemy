package ArrayCollections.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        //LIFO -> last in first out
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("livro 1");
        livros.push("livro 2");

        livros.peek();
        livros.element();

        livros.poll();
        livros.remove();
        livros.pop();

        livros.size();
        livros.clear();
        livros.contains("argumento");
        livros.isEmpty();
    }
}
