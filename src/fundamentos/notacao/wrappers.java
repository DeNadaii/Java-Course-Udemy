package fundamentos.notacao;

public class wrappers {
    public static void main(String[] args) {

        //wrapper (objetos dos primitivos)

        Byte b = 100; //byte
        Short s = 1000; //short
        Integer i = 10000; //int
        Long l = 100000L; //long

        Float f = 123.0F;//float
        Double d = 1234.456;//double

        Character c = '#'; //char
        Boolean bo = Boolean.parseBoolean("true");//bool
        System.out.println(b.byteValue());
        System.out.println(bo);

    }

}
