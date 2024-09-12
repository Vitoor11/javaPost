/*Semana 23/08/2024 aula de soma de números*/
/**
 *
 * @author 824218123
 */

import javax.swing.JOptionPane;
public class soma {
    public static void main(String[] args){
        //Declaração de variáveis 
        double primeiroValor, segundoValor, resultado;
        //Captura de números
        primeiroValor=Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º valor"));
        segundoValor=Double.parseDouble(JOptionPane.showInputDialog("Digite 2° valor:"));
        //processamento
        resultado=primeiroValor+segundoValor;
        JOptionPane.showMessageDialog(null,"soma ="+ resultado);
         
    }
    
}
