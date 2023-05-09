package fundamentos.conversoes;

import javax.swing.*;

public class conversaoStringNumero {
    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("digite 1");
        String valor2 = JOptionPane.showInputDialog("digite 2");

        valor2 = valor2.replace(",",".");
        valor1 = valor1.replace(",",".");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma = numero1 + numero2;
        double media = soma / 2;


        System.out.println(soma);
        System.out.println(media);


    }
}
