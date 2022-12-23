package br.uern.di.poo.primeiraunidade.uernbets;

public class Evento {
    
    private String EtapaDoEvento, Time1,Time2;
    private double VODTime1, VODEmpate, VODTime2 ;
    private br.uern.di.poo.primeiraunidade.uernbets.Resultado Resultado;
    
    public Evento(String EtapaDoEvento, String time1, String time2, double VODTime1, double VODEmpate, double VODTime2) {
        this.EtapaDoEvento = EtapaDoEvento;
        this.time1 = time1;
        this.time2 = time2;
        this.VODTime1 = VODTime1;
        this.VODEmpate = VODEmpate;
        this.VODTime2 = VODTime2;
    }

    public br.uern.di.poo.primeiraunidade.uernbets.Resultado getResultado() {
        return Resultado;
    }

    public void setResultado(br.uern.di.poo.primeiraunidade.uernbets.Resultado empate) {
        this.Resultado = empate;
    }

    public String getEtapaDoEvento() {
        return EtapaDoEvento;
    }

    public void setEtapaDoEvento(String EtapaDoEvento) {
        this.EtapaDoEvento = EtapaDoEvento;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public double getVODTime1() {
        return VODTime1;
    }

    public void setVODTime1(double VODTime1) {
        VODTime1 = VODTime1;
    }

    public double getVODEmpate() {
        return VODEmpate;
    }

    public void setVODEmpate(double VODEmpate) {
        VODEmpate = VODEmpate;
    }

    public double getVODTime2() {
        return VODTime2;
    }

    public void setVODTime2(double VODTime2) {
        VODTime2 = VODTime2;
    }


    
    


}