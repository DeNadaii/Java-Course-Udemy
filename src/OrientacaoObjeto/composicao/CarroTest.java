package OrientacaoObjeto.composicao;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.ligar();
        System.out.println(c1.estaLigado());
        c1.acelerar();
        c1.acelerar();
        c1.frear();
        System.out.println(c1.motor.giros());

        //n deveria ser possivel, aqui entra o cenceito de emcapsulamento
        c1.motor.fatorInjecao = -30;
    }
}
