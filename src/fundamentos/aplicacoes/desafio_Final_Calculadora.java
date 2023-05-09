package fundamentos.aplicacoes;

import javax.swing.*;

public class desafio_Final_Calculadora {
    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("digite o primeiro numero");
        String valor2 = JOptionPane.showInputDialog("digite o segundo numero");

        valor2 = valor2.replace(",",".");
        valor1 = valor1.replace(",",".");

        double valor1emDouble = Double.parseDouble(valor1);
        double valor2emDouble = Double.parseDouble(valor2);

        String operacao = JOptionPane.showInputDialog("digite a operacao(+, - , / , *)");

        double resultado = operacao.equals("+")? (valor1emDouble + valor2emDouble) :
                operacao.equals("-") ? (valor1emDouble - valor2emDouble) : operacao.equals("/") ?
                        (valor1emDouble / valor2emDouble) : (valor1emDouble * valor2emDouble);

        System.out.println(resultado);

    }
}
