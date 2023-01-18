package br.uern.di.poo.unidade1.construcao;

public class Bola {
  private int VelocidadeHorizontal;
  private int VelocidadeVertical;
  private final double Raio;
  private ParOrdenado PosicaoDoCentro;

  public Bola(int x, int y, int velocidadeX, int velocidadeY, double raio){
    PosicaoDoCentro = new ParOrdenado(x, y);
    VelocidadeHorizontal = velocidadeX;
    VelocidadeVertical = velocidadeY;
    Raio = raio;
  }
  public void Movimenta(){
    PosicaoDoCentro.setx(this.VelocidadeHorizontal + PosicaoDoCentro.getx());
    PosicaoDoCentro.sety(this.VelocidadeVertical + PosicaoDoCentro.gety());
  }

  public double getRaio(){
    return Raio;
  }
  
  public int getVelocidadeHorizontal(){
    return VelocidadeHorizontal;
  }

  public int getVelocidadeVertical(){
    return VelocidadeVertical;
  }

  public void setVelocidadeHorizontal(int VelocidadeHorizontal){
    this.VelocidadeHorizontal = VelocidadeHorizontal;
  }

  public void setVelocidadeVertical(int VelocidadeVertical){
    this.VelocidadeVertical = VelocidadeVertical;
  }

  public int getPosX(){
    return PosicaoDoCentro.getx();
  }

  public int getPosY(){
    return PosicaoDoCentro.gety();
  }

  public String toString() {
    return ("A bola está na posição" + PosicaoDoCentro.toString() + " se movendo a uma velocidade (" + getVelocidadeHorizontal()+","+ getVelocidadeVertical() + ")" + " pixels por movimento");
  }

}