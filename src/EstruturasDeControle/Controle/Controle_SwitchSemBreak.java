package EstruturasDeControle.Controle;

public class Controle_SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "verde";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("sai golpe 1");
            case "marrom":
                System.out.println("sei golpe 2");
            case "roxa":
                System.out.println("sei golpe 3");
            case "verde":
                System.out.println("sei golpe 4");
            default:
                System.out.println("nao sei nada");
        }

        int key = 4;

        switch (key){
            case 1:
                System.out.println("cond 1");
            case 2:
                System.out.println("cond 2");
            case 3:
                System.out.println("cond 3");
            case 4:
                System.out.println("cond 4");
        }
    }
}
