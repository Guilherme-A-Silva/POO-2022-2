
/* 
    Aluno: Guilherme Augusto Silva 
    Disciplina: Programação Orientada a Objetos 
    Professor: Sebastião Emidio Alves Filho 
    Data de Ultima Modificação: 22/12/2022 
*/

import javax.swing.JOptionPane;
import java.text.ParseException;

import java.util.Date;
import java.text.SimpleDateFormat;



public class ConversorDeData {
    public static void main(String[] args) throws ParseException {
       

        
        
            String EntradaDeData = JOptionPane.showInputDialog(null, "Insira a data no formato Mes/Dia/Ano.");

            JOptionPane.showMessageDialog(null, EntradaDeData,  "Data inicial", 1);
            
            SimpleDateFormat FormatoInicial = new SimpleDateFormat("MM/dd/yyyy");
            Date Data = FormatoInicial.parse(EntradaDeData);
            FormatoInicial.applyPattern("MMMM dd, yyyy");
            String NovoFormato = FormatoInicial.format(Data);
            
            JOptionPane.showMessageDialog(null, NovoFormato, "Nova data",1);
       
            
        }
    }