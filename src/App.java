public class App {
    public static void main(String[] args) throws Exception {
        Feriado Feriado = new Feriado();

        System.out.println(Feriado.ehFeriado("17/04/2023"));

        Feriado.setNovoFeriado("14/05/2023 ", "corresponde ao dia das mães");
        System.out.println(Feriado.getDataFeriado());

    }
}
