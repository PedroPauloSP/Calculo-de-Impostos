
package calcularimpostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CalcularImpostos {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String nome ="", continuar= "I";
        int indice;

    List<String> clientes = new ArrayList<String>();
        
        while(!continuar.equals("S"))
        {
            System.out.println("Digite a operação [I]ncluir, [E]incluir, [S]air");
            continuar = entrada.nextLine();
            switch(continuar)
            {
                case "I":
                    System.out.print("Digite o nome: ");
                    nome = entrada.nextLine();
                    clientes.add(nome); //incluindo um novo nome na lista
                    break;
                    
                case "E":
                    System.out.print("Digite o indice: ");
                    nome = entrada.nextLine();
                 //   if(indice >= 0 && indice < clientes.size())//valida se o índice informado é válido
                        clientes.add(nome); //excluindo o valor que está no índice informado
                    break;
                
                case "S":
                    System.out.println("Encerrando o programa");
                    break;
            }
            
            System.out.println("A lista neste momento está assim: ");
            for(int i = 0; i<clientes.size(); i++)
            {
                //em ProjetoArrayList, não se usa [] para acessar um item, mas sim método get()
                System.out.println(clientes.get(i));
            }
        }
   
    
    Impostos cad = new Impostos();
      cad.cadastrar();
   
           
  //  IPI Calc = new IPI();
  //  Calc.calcular();
}
}