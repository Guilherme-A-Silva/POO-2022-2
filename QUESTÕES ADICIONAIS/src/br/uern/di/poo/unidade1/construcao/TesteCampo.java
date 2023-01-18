package br.uern.di.poo.unidade1.construcao;

import javax.swing.JOptionPane;

public class TesteCampo {
  public static void main(String[] args) {
    // Entrada de Dados da Bola

    String PosXBola = JOptionPane.showInputDialog(null, "Insira a Posicao X da Bola: ");
    String PosYBola = JOptionPane.showInputDialog(null, "Insira a Posicao Y da Bola:  ");
    String Raio = JOptionPane.showInputDialog(null, "Insira o Raio da Bola: ");
    String VelocidadeX = JOptionPane.showInputDialog(null, "Informe a VelocidadeX da Bola: ");
    String VelocidadeY = JOptionPane.showInputDialog(null, "Informe a VelocidadeY da Bola: ");

    int InterPosXBola = Integer.parseInt(PosXBola);
    int InterPosYBola = Integer.parseInt(PosYBola);
    double InterRaio = Double.parseDouble(Raio);
    int InterVelocidadeX = Integer.parseInt(VelocidadeX);
    int InterVelocidadeY = Integer.parseInt(VelocidadeY);

    Bola bol = new Bola(InterPosXBola, InterPosYBola, InterVelocidadeX, InterVelocidadeY, InterRaio);

    // Entrada de Dados do Campo

    String PosX = JOptionPane.showInputDialog(null, "Insira a Posicao X do Canto Superior Esquerdo: ");
    String PosY = JOptionPane.showInputDialog(null, "Insira a Posicao Y do Canto Superior Esquerdo: ");
    String Altura = JOptionPane.showInputDialog(null, "Insira a Altura do Campo: ");
    String Largura = JOptionPane.showInputDialog(null, "Insira a Largura do Campo: ");

    int InterPosX = Integer.parseInt(PosX);
    int InterPosY = Integer.parseInt(PosY);
    int InterAltura = Integer.parseInt(Altura);
    int InterLargura = Integer.parseInt(Largura);

    CampoRetangular Campo = new CampoRetangular(InterPosX, InterPosY, InterAltura, InterLargura, bol);

    for(int i = 0; i<30; i++){
      JOptionPane.showMessageDialog(null,bol.toString());
      Campo.movimentaBola();
    }
  }
}
