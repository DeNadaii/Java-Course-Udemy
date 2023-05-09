package fundamentos;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;


public class Import {

    public static void main(String[] args) {

        Date d = new Date();
        System.out.println("exemplo Import Data(digite um inteiro)" + (d.getYear()));

        String valor2 = JOptionPane.showInputDialog("exemplo Import input dialog");
        int valorDigitado = Integer.parseInt(valor2);
        System.out.println(valorDigitado);

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite algo no terminal");
        String entradaViaTerminal = entrada.next();
        System.out.println("exemplo import Scanner :" + entradaViaTerminal);

    }
}

