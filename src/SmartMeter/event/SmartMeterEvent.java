package SmartMeter.event;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class SmartMeterEvent {
    //public String X_Timestamp;

    public double potencia;
    public double voltagem;
    public double corrente;
    public double frequencia;
    public String meter;

    public String location;

    public int hora;
    public int minutos;
    public int dia;
    public int mes;
    public int ano;

    public SmartMeterEvent(double potencia, double voltagem, double corrente, double frequencia, String meter, int hora, int minutos, int dia, int mes, int ano) {
        this.potencia = potencia;
        this.voltagem = voltagem;
        this.corrente = corrente;
        this.frequencia = frequencia;
        this.meter = meter;
        this.hora = hora;
        this.minutos = minutos;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.setLocation();
    }


    public void setLocation() {
        int num = Integer.parseInt(this.getMeter().substring(2));

        if (num <= 17) {
            this.location = "Turu";
        } else if (num <= 34) {
            this.location = "Cohab";
        } else {
            this.location = "Angelim";
        }


    }

   /* public void setMes() {
        Date dataformatada = this.data;
        String mes = dataformatada.toString();
        String num = mes.substring(4, 7);
        if (num.equals("Jan")) {
            this.Mes = "Janeiro";
        } else if (num.equals("Feb")) {
            this.Mes = "Fevereiro";
        } else if (num.equals("Mar")) {
            this.Mes = "Março";
        } else if (num.equals("Abr")) {
            this.Mes = "Abril";
        } else if (num.equals("Mai")) {
            this.Mes = "Maio";
        }
    }*/

    public double getPotencia() {
        return potencia;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public double getCorrente() {
        return corrente;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public String getMeter() {
        return meter;
    }

    public String getLocation() {
        return location;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}