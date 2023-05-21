package classe.DesafioModulo;

public class Jantar {
    public static void main(String[] args) {

        Comida guarnicao = new Comida("Arroz", 0.500);
        Comida salada = new Comida("alface", 0.750);
        Comida proteina = new Comida("frango", 0.250);

        Pessoa pessoa1 = new Pessoa("joaozinho", 75.0);

        pessoa1.comer(guarnicao);
        pessoa1.comer(salada);
        pessoa1.comer(proteina);

        System.out.println(pessoa1.pesoPessoa);
    }
}
