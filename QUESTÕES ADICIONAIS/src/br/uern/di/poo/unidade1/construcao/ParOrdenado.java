package br.uern.di.poo.unidade1.construcao;

public class ParOrdenado {
  private int x, y;

  public ParOrdenado(int X, int Y) {
    x = X;
    y = Y;
  }

  public int getx() {
    return x;
  }

  public int gety() {
    return y;
  }

  public void setx(int X) {
    this.x = X;
  }

  public void sety(int Y) {
    this.y = Y;
  }

  public String toString() {
    return ("(" + this.x + "," + this.y + ")");
  }
}
