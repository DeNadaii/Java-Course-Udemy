package EstruturasDeControle.Controle;

import javax.swing.*;

public class Controle_If {
    public static void main(String[] args) {

        String media = JOptionPane.showInputDialog("digite a media");
        media = media.replace(",", ".");
        double mediaemDouble = Double.parseDouble(media);

        if (mediaemDouble >= 7.0) {
            System.out.println("aprovado");
        }
        if (mediaemDouble <7.0 && mediaemDouble >= 4.0){
            System.out.println("recuperacao");
        }
        if (mediaemDouble < 4.0 && mediaemDouble >= 0){
            System.out.println("reprovado");
        }
    }
}
