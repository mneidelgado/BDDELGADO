package trabalho.eng.pkg2;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
      String numero1=JOptionPane.showInputDialog("Digite o primeiro número:");
      String numero2=JOptionPane.showInputDialog("Digite o segundo número");
      String MostreResultado = null;

      {
          switch (operador) {
          //*   case "+":
                  MostreResultado = String.valueOf(Float.parseFloat(numero1) + Float.parseFloat(numero2));
                  break;
         //*     case "-":
                  MostreResultado =String.valueOf(Float.parseFloat(numero1) - Float.parseFloat(numero2));
                  break;
              case "/":
                  MostreResultado =String.valueOf(Float.parseFloat(numero1) / Float.parseFloat(numero2));
                  break;
              case "*":
                  MostreResultado =String.valueOf(Float.parseFloat(numero1) * Float.parseFloat(numero2));
                  break;
              default:
                  break;
          }
  JOptionPane.showMessageDialog(null,"O Resultado é:"+ MostreResultado);
      System.exit( 0 );
          
      }
    }
    
}
