
package calcularimpostos;

import java.util.Scanner;


public class IPI extends Impostos {
    Scanner entrada = new Scanner(System.in);

    public IPI() {
    }

    public IPI(double totalDebito, double totalCredito, double debito, double credito) {
        super(totalDebito, totalCredito, debito, credito);
        
      
       }
     public void calcular(){ 
        System.out.println("Digite Total de débitos "); 
         debito = entrada.nextDouble();
         entrada.nextLine();
         System.out.println("Digite o total de credito ");
         credito = entrada.nextDouble();
         double resultado = 0;
         
         resultado =(debito - credito)* 1.65/100;
         
         System.out.println("Total "+resultado);
    }

  
}
