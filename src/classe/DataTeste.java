package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data getInfoOfDate = new Data();
        getInfoOfDate.dia = 5;
        getInfoOfDate.mes = 12;
        getInfoOfDate.ano = 2010;

        System.out.println(getInfoOfDate.formatDate());

        Data date1 = new Data();
        System.out.println(date1.formatDate());

        Data data2 = new Data(27,01,2000);
        System.out.println(data2.formatDate());
    }


}
