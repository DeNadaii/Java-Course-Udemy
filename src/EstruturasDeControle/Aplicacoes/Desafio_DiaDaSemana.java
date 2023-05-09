package EstruturasDeControle.Aplicacoes;

import javax.swing.*;

public class Desafio_DiaDaSemana {
    public static void main(String[] args) {

        String diaDaSemana = JOptionPane.showInputDialog("digite o dia da semana");

        diaDaSemana = diaDaSemana.toLowerCase();
        diaDaSemana = diaDaSemana.trim();


        if (diaDaSemana.equals("domingo")){
            System.out.println(1);
        }else if (diaDaSemana.equals("segunda")) {
            System.out.println(2);
        }else if (diaDaSemana.equals("terca")) {
            System.out.println(3);
        }else if (diaDaSemana.equals("quarta")) {
            System.out.println(4);
        }else if (diaDaSemana.equals("quinta")) {
            System.out.println(5);
        }else if (diaDaSemana.equals("sexta")) {
            System.out.println(6);
        }else if (diaDaSemana.equals("sabado")) {
            System.out.println(7);
        }else{
            System.out.println("dia invalido");
        }
    }
}
