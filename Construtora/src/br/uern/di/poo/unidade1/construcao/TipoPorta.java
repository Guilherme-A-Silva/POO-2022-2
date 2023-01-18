package br.uern.di.poo.unidade1.construcao;

public enum TipoPorta {
  
  Porta_Simples("madeira compensada", "fechadura simples", 50.00),
  Porta_Padrao("madeira andiroba", "fechadura de encaixe", 140.00),
  Porta_de_Luxo("madeira ipê", "fechadura tetra", 350.00);

  private final String TipoDeMadeira, TipoDeFechadura;
  private final double Custo;
  
  private TipoPorta(String tipoDeMadeira, String tipoDeFechadura, double custo) {
    TipoDeMadeira = tipoDeMadeira;
    TipoDeFechadura = tipoDeFechadura;
    Custo = custo;
  }

  public String getTipoDeMadeira() {
    return TipoDeMadeira;
  }

  public String getTipoDeFechadura() {
    return TipoDeFechadura;
  }

  public double getCusto() {
    return Custo;
  }

  
}
