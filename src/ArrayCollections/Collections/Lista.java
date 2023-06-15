package ArrayCollections.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("ana"));
        lista.add(new Usuario("carlos"));
        lista.add(new Usuario("jao"));
        lista.add(new Usuario("jao"));
        lista.add(new Usuario("Roberto"));

        //metodo toString cria uma resposta padrao
        System.out.println(lista.get(3));

        System.out.println("usuario: " + lista.remove(new Usuario("jao")));
        System.out.println("index:" + lista.remove(1));

        System.out.println(lista.contains(new Usuario("ana")));

        for(Usuario u : lista){
            System.out.println(u.nome);
        }

    }
}
