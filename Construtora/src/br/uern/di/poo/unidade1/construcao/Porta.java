package br.uern.di.poo.unidade1.construcao;

import javax.swing.JOptionPane;

public class Porta {
  TipoPorta TypeDoor;
  Double Altura, Largura;
  boolean Pivotante;
  private final double AlturaPadrao = 1.8;
  private final double LarguraPadrao = 0.7;
  private final double Taxa_Pivo = 350.00;
  public Porta() {
    TypeDoor = TipoPorta.Porta_Simples;
    Altura = AlturaPadrao;
    Largura = LarguraPadrao;
    Pivotante = false;
  }
  public Porta(TipoPorta typeDoor, Double altura, Double largura, boolean pivotante) {
    TypeDoor = typeDoor;
    Altura = altura;
    Largura = largura;
    Pivotante = pivotante;
  }

  public TipoPorta getTypeDoor() {
    return TypeDoor;
  }
  public void setTypeDoor(TipoPorta typeDoor) {
    TypeDoor = typeDoor;
  }
  public Double getAltura() {
    return Altura;
  }
  public void setAltura(Double altura) {
    Altura = altura;
  }
  public Double getLargura() {
    return Largura;
  }
  public void setLargura(Double largura) {
    Largura = largura;
  }
  public boolean isPivotante() {
    return Pivotante;
  }
  public void setPivotante(boolean pivotante) {
    Pivotante = pivotante;
  }
  public double getAlturaPadrao() {
    return AlturaPadrao;
  }
  public double getLarguraPadrao() {
    return LarguraPadrao;
  }
  public double getTaxa_Pivo() {
    return Taxa_Pivo;
  }

  public double calculaPreco(Porta Door){
    Double Price = 0.0;
    if(Door.TypeDoor == TipoPorta.Porta_Simples && Door.Pivotante == false){
      Price = TipoPorta.Porta_Simples.getCusto();
      return Price;
    }
    else if(Door.TypeDoor == TipoPorta.Porta_Simples && Door.Pivotante == true){
      Price = TipoPorta.Porta_Simples.getCusto()+Taxa_Pivo;
      return Price;
    }
    else if(Door.TypeDoor == TipoPorta.Porta_Padrao && Door.Pivotante == false){
      Price = TipoPorta.Porta_Padrao.getCusto();
      return Price;
    }
    else if(Door.TypeDoor == TipoPorta.Porta_Padrao && Door.Pivotante == true){
      Price = TipoPorta.Porta_Padrao.getCusto()+Taxa_Pivo;
      return Price;
    }
    else if(Door.TypeDoor == TipoPorta.Porta_de_Luxo && Door.Pivotante == false){
      Price = TipoPorta.Porta_de_Luxo.getCusto();
      return Price;
    }
    else if(Door.TypeDoor == TipoPorta.Porta_de_Luxo && Door.Pivotante == true){
      Price = TipoPorta.Porta_de_Luxo.getCusto()+Taxa_Pivo;
      return Price;
    }
    return 0;
  }
  public void exibePorta(Porta Door){
      JOptionPane.showMessageDialog(null,"Tipo de madeira da porta: " + Door.TypeDoor.getTipoDeMadeira(), "Exibindo Dados", 0, null);
      JOptionPane.showMessageDialog(null,"Tipo de fechadura da porta: " + Door.TypeDoor.getTipoDeFechadura(), "Exibindo Dados", 0, null);
      JOptionPane.showMessageDialog(null,"Altura da porta: " + Door.getAltura() + " metros. ", "Exibindo Dados", 0, null);
      JOptionPane.showMessageDialog(null,"Largura da porta: " + Door.getLargura() + " metros.", "Exibindo Dados", 0, null);

      if(Door.Pivotante == true){
        JOptionPane.showMessageDialog(null, "Pivotante: Sim.");
      }
      else{
        JOptionPane.showMessageDialog(null, "Pivotante: Nao.");
      }
  }
  
}
