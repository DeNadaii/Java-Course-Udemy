package ArrayCollections.Collections;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "metodo toString():" + this.nome;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Usuario usuario = (Usuario) o;
//        return Objects.equals(nome, usuario.nome);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public boolean equals(Object obj){
        Usuario outroUsuario = (Usuario) obj;
        return this.nome.equals(outroUsuario.nome);
    }
}
