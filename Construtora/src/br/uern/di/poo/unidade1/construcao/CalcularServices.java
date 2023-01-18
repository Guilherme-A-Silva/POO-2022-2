package br.uern.di.poo.unidade1.construcao;

public class CalcularServices {
  private final static double Percentual_Luxo = 0.1;
  private final static double MetroQuad = 70.00;
  private final static double Taxa_Pivo = 250;

  public static double Instalacao(Porta Door){
    double Custo = 0.0;
    double MetroQuadrado = (Door.getAltura() * Door.getLargura());

    if (Door.TypeDoor == TipoPorta.Porta_de_Luxo && Door.Pivotante == true) {
      Custo = (MetroQuad*MetroQuadrado) + Taxa_Pivo;
      Custo = Custo + (Custo*Percentual_Luxo)/100;
      return Custo;
  }
  else if(Door.TypeDoor == TipoPorta.Porta_de_Luxo && Door.Pivotante == false){
    Custo = (MetroQuad*MetroQuadrado);
    Custo = Custo + (Custo*Percentual_Luxo)/100;
    return Custo;
  }
  else if(Door.TypeDoor == TipoPorta.Porta_Padrao && Door.Pivotante == false){
    Custo = (MetroQuad*MetroQuadrado);
    Custo = Custo + (Custo/100);
    return Custo;
  }
  else if(Door.TypeDoor == TipoPorta.Porta_Padrao && Door.Pivotante == true){
    Custo = (MetroQuad*MetroQuadrado) + Taxa_Pivo;
    Custo = Custo + (Custo/100);
    return Custo;
  }
  else if(Door.TypeDoor == TipoPorta.Porta_Simples && Door.Pivotante == false){
    Custo = (MetroQuad*MetroQuadrado);
    Custo = Custo + (Custo/100);
    return Custo;
  }
  else if(Door.TypeDoor == TipoPorta.Porta_Simples && Door.Pivotante == true){
    Custo = (MetroQuad*MetroQuadrado) + Taxa_Pivo;
    Custo = Custo + (Custo/100);
    return Custo;
  }
    return 0;
  }
}
