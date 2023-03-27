public class Feriado {
    private String dataFeriado;
    private String texto;

    public String getDataFeriado(String data) {
        if("21/02/2023".equals(data)){
            return "A data 01/01/2023" + "corresponde a Confraternização mundial";
        }else if("01/01/2023".equals(data)){
            return "A data 21/02/2023 " + "corresponde ao carnaval";
        }else if("17/04/2023".equals(data)){
            return "A data 17/04/2023 " + "corresponde a Páscoa";
        }else if("01/05/2023".equals(data)){
            return "A data 01/05/2023 " + "corresponde ao Dia do trabalho";
        }else if("08/06/2023".equals(data)){
            return "A data 08/06/2023 " + "corresponde a Corpus Christi";
        }else if("07/09/2023".equals(data)){
            return "A data 07/09/2023 " + "corresponde a Independência do Brasil";
        }else if("12/10/2023".equals(data)){
            return "A data 12/10/2023 " + "corresponde a Nossa Senhora Aparecida";
        }else if("02/11/2023".equals(data)){
            return "A data 02/11/2023 " +  "corresponde a Finados";
        }else if("15/11/2023".equals(data)){
            return "A data 15/11/2023 " + "corresponde a Proclamação da República";
        }
        else if("25/12/2023".equals(data)){
            return "A data 25/12/2023" + "é Natal";
        }
        return data + " Não é feriado!";
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
