package ArrayCollections.DesafioModulo;

import ArrayCollections.Usuario;

import java.util.HashSet;

public class HashCodeNaPratica {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        //hashCode e equals são metodos usados para achar um elemento
        //dentro de uma collection. o hashcode consegue procurar de uma
        //forma bem mais rapida

        usuarios.add(new Usuario("jao"));
        usuarios.add(new Usuario("ana"));
        usuarios.add(new Usuario("pedro"));

        //equals e hashcode deves estar implementados de forma correta
        System.out.println(usuarios.contains(new Usuario("julio")));
    }
}
