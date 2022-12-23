package br.uern.di.poo.primeiraunidade.uernbets;

public class Aposta {
    private Evento Etapa ;
    private double ValorDaAposta;
    Resultado resultado;
    public Aposta(Evento Etapa, Resultado resultado, int ValorDaAposta) {
        this.Etapa = Etapa;
        this.resultado = resultado;
        this.ValorDaAposta = ValorDaAposta;
    }
    public Evento getEtapa() {
        return Etapa;
    }
    public Resultado getResultado() {
        return resultado;
    }
    public double getValorDaAposta() {
        return ValorDaAposta;
    }
    
    public double CalcularLucro(Evento Etapa){
        double Lucro = 0.0;
        if (Etapa.getResultado() == Resultado.TIME1){
            Lucro = (ValorDaAposta*(double)Etapa.getODDTime1()) - ValorDaAposta;
            return Lucro;
        }
        else if (Etapa.getResultado() == Resultado.EMPATE){
            Lucro = (ValorDaAposta*(double)Etapa.getODDEmpate()) - ValorDaAposta;
            return Lucro;
        }
        else{
            Lucro = (ValorDaAposta*(double)Etapa.getODDTime2()) - ValorDaAposta;
            return Lucro;
        }
            
            
    }

}