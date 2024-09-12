

/**
 *
 * @author 824218123
 */
import javax.swing.JOptionPane;
public class atividadeFor {
    public static void main (String [] args){
        double contador,leitura,senha;
        senha = 54321;
        leitura = 0;
        contador = 3;
        for (contador=3; contador<=3;){
        leitura= Integer.parseInt(JOptionPane.showInputDialog("Digite a senha"));
        contador = contador +1;
            JOptionPane.showMessageDialog(null,"Senha errada");
            contador = contador +3;
        if (contador>=3){
              JOptionPane.showMessageDialog(null,"Contate o administrador");
        }else{
                JOptionPane.showMessageDialog(null, "Acesso permitido");
                break;
        }
        }
        }
    }

    
    

