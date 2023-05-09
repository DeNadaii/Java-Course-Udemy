package EstruturasDeControle.Controle;

import javax.swing.*;

public class Controle_IfElse {
    public static void main(String[] args) {
        String numeroEntrada = JOptionPane.showInputDialog("digite o numero");
        int numeroSaida = Integer.parseInt(numeroEntrada);

        if (numeroSaida % 2 == 0){
            System.out.printf("%d eh um numero par", numeroSaida);
        }
        else {
            System.out.printf("%d eh um numero impar", numeroSaida);
        }

    }
}
