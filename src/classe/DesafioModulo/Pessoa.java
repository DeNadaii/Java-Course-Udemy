package classe.DesafioModulo;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }
    public void comer(Comida comida){
        this.pesoPessoa += comida.pesoComida;
    }
}
