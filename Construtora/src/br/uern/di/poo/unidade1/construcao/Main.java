package br.uern.di.poo.unidade1.construcao;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {

  public static void ExibirDadosGerais(Porta Door) {
    Door.exibePorta(Door);
    DecimalFormat Decimal = new DecimalFormat("0.00");
    String PrecoFormatado = Decimal.format(Door.calculaPreco(Door));
    String PrecoInstalacao = Decimal.format(CalcularServices.Instalacao(Door));

    JOptionPane.showMessageDialog(null, "PREÇO : R$ " + PrecoFormatado, "Dados Porta", 0, null);
    JOptionPane.showMessageDialog(null, "VALOR DA INSTALAÇÃO : R$ " + PrecoInstalacao, "Dados Porta",
        0, null);
  }

  public static void main(String[] args) {

    Porta PortaSimples = new Porta();
    Porta PortaPadrao = new Porta(TipoPorta.Porta_Padrao, 2.1, 0.9, false);
    Porta PortaDeLuxo = new Porta(TipoPorta.Porta_de_Luxo, 2.3, 1.2, false);
    Porta PortaDeLuxoPivotante = new Porta(TipoPorta.Porta_de_Luxo, 2.5, 1.5, true);

    ExibirDadosGerais(PortaSimples);
    ExibirDadosGerais(PortaPadrao);
    ExibirDadosGerais(PortaDeLuxo);
    ExibirDadosGerais(PortaDeLuxoPivotante);
  }
}
