package EstruturasDeControle.Controle;

import javax.swing.*;

public class Controle_IfElseIf {
    public static void main(String[] args) {

        String numeroEntrada = JOptionPane.showInputDialog("digite o numero");
        int numero = Integer.parseInt(numeroEntrada);
        
        if(numero > 5 && numero < 10){
            System.out.println("numero valido");
        } else if (numero > 0) {
            System.out.println("numero invalido porem maior q zero");
        }else{
            System.out.println("numero menor q zero");
        }
    }
}
