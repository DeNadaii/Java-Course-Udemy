package fundamentos.aplicacoes;

import javax.swing.*;

public class LogicosProblema {
    //Um pai prometeu a sua familia que se, dois dois trabalhos
    //marcados para a semana, os dois derem certo, eles iriam ao shopping
    //comprar uma TV de 50 polegadas e tomar um sorvete, caso só
    //um trabalho der certo, eles iriam comprar um TV de
    // 30 polegadas e tomar um sorvete. Caso nenhum trabalho der certo,
    //infelizmente eles ficariam em casa

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Trabalho 1 deu certo ?(digite true ou false)");
        String valor2 = JOptionPane.showInputDialog("Trabalho 2 deu certo ?(digite true ou false)");

        boolean trabalho1 = Boolean.parseBoolean(valor1);
        boolean trabalho2 = Boolean.parseBoolean(valor2);

        System.out.println("Comprou TV de 50? " + (trabalho1 && trabalho2));
        System.out.println("Comprou TV de 30? " + (trabalho1 ^ trabalho2));
        System.out.println("Tomou sorvete? " + (trabalho1 || trabalho2));
        System.out.println("ficou em casa? " + (!(trabalho1 || trabalho2)));

    }

}
