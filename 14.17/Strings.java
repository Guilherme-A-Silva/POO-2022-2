/*

    Aluno: Guilherme Augusto Silva
    Disciplina: Programação Orientada a Objetos
    Professor: Sebastião Emidio Alves Filho
    Data de Ultima Modificação: 23/12/2022

*/

import javax.swing.JOptionPane;
import java.util.LinkedHashSet;
import java.util.HashSet;


public class Strings {
    public static void main(String[] args) {
        HashSet<String> Combinações = new LinkedHashSet<String>();
        String String_5 = "";

        while (String_5.length() != 5) {
            String_5 = JOptionPane.showInputDialog("Informe a Palavra com Limitação de 5 caracteres: ");
            if (String_5.length() != 5) {
                JOptionPane.showMessageDialog(null,
                        "Palavra informada com algum erro, a palavra precisa ter 5 letras. Porfavor, Insira novamente !!! ", "Erro", 2);
            }

            Combinacao(Combinações, String_5, "", 5, 3);
            for (String Str_3 : Combinações) {
                System.out.printf("Combinacao Gerada: ");
                System.out.printf(Str_3);
                System.out.printf("\n");
            }
            

        }

    }

    public static void Combinacao(HashSet<String> combinacoes, String String_5, String ControleDeString, int NumeroDeElementos,
            int NumeroDeArranjos) {

        if (NumeroDeArranjos == 0) {

            combinacoes.add(ControleDeString);
            return;

        }

        for (int i = 0; i < NumeroDeElementos; i++) {

            String Nova_String = ControleDeString + String_5.charAt(i);

            Combinacao(combinacoes, String_5, Nova_String, NumeroDeElementos, NumeroDeArranjos - 1);

        }

    }

}