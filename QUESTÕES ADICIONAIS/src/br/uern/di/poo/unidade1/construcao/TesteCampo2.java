package br.uern.di.poo.unidade1.construcao;

import javax.swing.JOptionPane;

public class TesteCampo2 {

  public static void main(String[] args) {

    String RaioBola = JOptionPane.showInputDialog(null, "Insira o Raio da Bola: ");
    String AlturaCampo = JOptionPane.showInputDialog(null, "Insira a Altura do Campo: ");
    String LarguraCampo = JOptionPane.showInputDialog(null, "Insira a Largura do Campo: ");

    double DoubleRaio = Double.parseDouble(RaioBola);
    int InterAltura = Integer.parseInt(AlturaCampo);
    int InterLargura = Integer.parseInt(LarguraCampo);

    int PosX = (InterLargura / 2);
    int PosY = (InterAltura / 2);

    //int VelocidadeX = 5 + (int) (6 * Math.random());
    //int VelocidadeY = 5 + (int) (6 * Math.random());

    Double VeloX = 5 + (6 * Math.random());
    Double VeloY = 5 + (6 * Math.random());

    VeloX = VeloX / 100;
    VeloY = VeloY / 100;

    VeloX = VeloX * InterLargura;
    VeloY = VeloY * InterAltura;

    int VelocidadeX = VeloX.intValue();
    int VelocidadeY = VeloY.intValue();

    Bola bol = new Bola(PosX, PosY, VelocidadeX, VelocidadeY, DoubleRaio);

    CampoRetangular Campo = new CampoRetangular(0, 0, InterLargura, InterAltura, bol);

    for (int i = 0; i < 30; i++) {
      JOptionPane.showMessageDialog(null, bol.toString());
      Campo.movimentaBola();
    }
  }
}
