package EstruturasDeControle.Controle;

import javax.swing.*;

public class Controle_SwitchComBreak {
    public static void main(String[] args) {

        String nota = JOptionPane.showInputDialog("digite o dia da semana");

        nota = nota.toLowerCase();
        nota = nota.trim();

        boolean aprovado = false;

        int notaToInt = Integer.parseInt(nota);

        switch (notaToInt) {
            case 60: case 30:
                aprovado = false;
                break;
            case 90: case 100:
                aprovado = true;
                break;
            default:
                System.out.println("caso n encontrado");
        }
        System.out.println(aprovado);
    }
}
