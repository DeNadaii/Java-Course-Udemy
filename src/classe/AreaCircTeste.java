package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        //forma correta, associado a classe
        //AreaCirc.pi = 4;

        //Como pi esta estatico, n é possivel altera-lo
        System.out.println(AreaCirc.pi);

        AreaCirc a1 = new AreaCirc(5.6);
        //a1.pi = 10;
        System.out.println(a1.area());

        System.out.println(AreaCirc.area(100));

    }
}
