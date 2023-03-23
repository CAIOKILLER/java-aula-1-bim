import javax.swing.JOptionPane;


public class Addition 
        
{ 
   public static void main ( String[] args )
   {  
       String firstNumber =
	      JOptionPane.showInputDialog( "digite o primeiro numero");
		String secondNumber =
		   JOptionPane.showInputDialog(" coloca o segundo numero ");
		  
		   
		   int number1 = Integer.parseInt (firstNumber);
		   int number2 = Integer.parseInt (secondNumber);
		  
                   String opc = JOptionPane.showInputDialog(" digite o numero correspondente a sua operação: 1 somar,  2 subtrair, 3 dividir, 4 multiplicar  ");
                   int op = Integer.parseInt (opc);
                   
                   if (op  == 1) {
                       int soma = number1 + number2;
                       JOptionPane.showMessageDialog(null, "A soma é " + soma," Soma de dois numeros inteiros", JOptionPane.PLAIN_MESSAGE );
                         }
                  
                   if (op  == 2) {
                       int sub = number1 - number2;
                       JOptionPane.showMessageDialog(null, "A subtração é " + sub," Subtracao de dois numeros inteiros", JOptionPane.PLAIN_MESSAGE );
                         }
                    if (op  == 3) {
                       int div = number1 / number2;
                       JOptionPane.showMessageDialog(null, "A divisão é " + div," divisao e dois numeros inteiros", JOptionPane.PLAIN_MESSAGE );
                         }
                   if (op  == 4) {
                       int mult = number1 + number2;
                       JOptionPane.showMessageDialog(null, "A multiplicação é " + mult," a multiplicacao de dois numeros inteiros", JOptionPane.PLAIN_MESSAGE );
                         }
		  
		
		  
	}
}
