
/**
 *
 * @author vitor
 */

public class Exercicio4 {
    public static void main (String [] args){
        int numero;
        System.out.println("Informe um número para calcular o fatorial");
        Scanner scanner = new Scanner (System.int);
        numero = scanner.nextInt();
        long fatorial = 1;
        int i = 1;
        
        while (i<= numero) {
            fatorial = fatorial * 1;
            i++;
        }
        System.out.println("O fatorial de " + numero + "é" + fatorial);
    }
    
}
