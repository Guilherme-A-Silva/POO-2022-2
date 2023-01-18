package br.uern.di.poo.unidade1.construcao;

public class CampoRetangular {
  private int PosX;
  private int PosY;
  private int ComprimentoHorizontal;
  private int ComprimentoVertical;
  private Bola bola;
  
  public CampoRetangular(int posX, int posY, int comprimentoHorizontal, int comprimentoVertical, Bola bola) {
    PosX = posX;
    PosY = posY;
    ComprimentoHorizontal = comprimentoHorizontal;
    ComprimentoVertical = comprimentoVertical;
    this.bola = bola;
  }

  public int getPosX(){
    return PosX;
  }

  public int getPosY(){
    return PosY;
  }
  
  public int getComprimentoHorizontal(){
    return ComprimentoHorizontal;
  }

  public int getComprimentoVertical(){
    return ComprimentoVertical;
  }

  public boolean bolaTocaBordaEsquerda(){
    if(bola.getPosX() == 0){
      return false;
    }else
    return true;
  }

  public boolean bolaTocaBordaDireita(){
    if(bola.getPosX() == getComprimentoHorizontal()){
      return false;
    }else
    return true;
  }

  public boolean bolaTocaBordaSuperior(){
    if(bola.getPosY() == 0){
      return false;
    }else
    return true;
  }

  public boolean bolaTocaBordaInferior(){
    if(bola.getPosY() == getComprimentoVertical()){
      return false;
    }else
    return true;
  }

  public void movimentaBola(){
    bola.Movimenta();
    if(bola.getPosY() >= getComprimentoVertical()){
      bola.setVelocidadeVertical(bola.getVelocidadeVertical() * -1);
    }
    if(bola.getPosY() <= 0){
      bola.setVelocidadeVertical(bola.getVelocidadeVertical() * -1);
    }
    if(bola.getPosX() >= getComprimentoHorizontal()){
      bola.setVelocidadeHorizontal(bola.getVelocidadeHorizontal() * -1);
    }
    if(bola.getPosX() <= 0){
      bola.setVelocidadeHorizontal(bola.getVelocidadeHorizontal() * -1);
    }
    bola.toString();
  }
}
