package ArrayCollections;

import java.util.Objects;

public class Usuario {
    public String nome;
    public String email;
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public Usuario(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "metodo toString():" + this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
