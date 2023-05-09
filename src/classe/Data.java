package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        this.dia = 01;
        this.mes = 01;
        this.ano = 1970;
    }

    Data(int inputDay, int inputMouth, int inputYear){
        this.dia = inputDay;
        this.mes = inputMouth;
        this.ano = inputYear;
    }

    public String formatDate(){
        String DataFormatada = String.format("%d/%d/%d",this.dia,this.mes,this.ano);

//        if(this.dia <= 9 || this.mes <= 9){
//            DataFormatada = String.format("0%d/0%d/%d",this.dia,this.mes,this.ano);
//        }
        return DataFormatada;
    };

}
