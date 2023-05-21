package classe;

public class AreaCirc {

    double raio;
    static final double pi = 3.1415;

    AreaCirc(double raioInicial){

        this.raio = raioInicial;
    }
    double area(){
        return pi * Math.pow(raio, 2);
    }
    static double area(double raio){
        return pi * Math.pow(raio, 2);
    }
}
