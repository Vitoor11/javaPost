/**
 *
 * @author 824218123
 */
import javax.swing.JOptionPane;
public class senha {
    public static void main (String []args){
        int contador, senha, leitura;
        senha=54321;
        leitura=0;
        contador=0;
        leitura= Integer.parseInt(JOptionPane.showInputDialog("Digite a senha"));
        if (leitura!=senha){
            JOptionPane.showInputDialog(null,"Senha errada");
    }else{
    JOptionPane.showInputDialog(null,"Acesso permitido");
        
    }
    }
    
}
