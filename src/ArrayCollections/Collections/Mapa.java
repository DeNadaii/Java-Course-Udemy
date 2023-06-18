package ArrayCollections.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer,String> usuarios = new HashMap<>();
        //adicionou usuario roberto com key 1
        usuarios.put(1, "roberto");
        //alterou oq tem no key 1 por ricardo
        usuarios.put(1, "ricardo");

        usuarios.keySet();
        usuarios.values();
        usuarios.entrySet();

        usuarios.containsKey(1);//pergunta se tem a key com o valor igual do argumento
        usuarios.containsValue("argumento");//pergunta se tem a value com o valor igual do argumento

        usuarios.get(1);//retorna o valor da key passada

        //como percorrer os map
        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        for (String valor: usuarios.values()){
            System.out.println(valor);
        }
        for (Entry<Integer,String> parametro: usuarios.entrySet()){
            System.out.println(parametro.getKey());
            System.out.println(parametro.getValue());
        }

        usuarios.remove(1);
        usuarios.remove(1,"roberto");
    }
}
