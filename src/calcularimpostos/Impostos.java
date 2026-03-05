package calcularimpostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Impostos {

    double totalDebito;
    double totalCredito;
    double debito;
    double credito;
    double aliquota = 1.65;
    double valorProduto;
    double frete;
    double seguro;
    double outrasDespesas;
    double totalImposto;
    double totalProduto;
    
    List<Double> pagamento = new ArrayList<Double>();
    Scanner entrada = new Scanner(System.in);
   
    String  operacao = "I";
    int indice;
 public void cadastrar(){
     while(!operacao.equals("S")) {
        System.out.println("Digite a operação [I]IPI, [P]PIS, [S]air");
        operacao = entrada.nextLine();
        switch (operacao) {
            case "I":
                System.out.print("Digite o total de débito: ");
                debito = entrada.nextDouble();
                pagamento.add(debito); //incluindo um novo nome na lista
                entrada.nextLine();
                System.out.println("Total de débito "+debito);
                System.out.println("Digite o total de crédito:");
                credito =entrada.nextDouble();
                pagamento.add(credito);
                entrada.nextLine();
                System.out.println("Total de crédito "+credito);
                totalImposto=(debito-credito)*1.65/100;
                System.out.println("Total do imposto "+totalImposto);
                pagamento.add(totalImposto);
               
                break;
            
           case"P":
                System.out.print("Digite o total de valor do produto: ");
                valorProduto = entrada.nextDouble();
                pagamento.add(valorProduto);//incluindo um novo nome na lista
                entrada.nextLine();
                System.out.println("Digite ovalor do frete:");
                frete = entrada.nextDouble();
                pagamento.add(frete);
                entrada.nextLine();
                System.out.println("Digite o valor do seguro ");
                seguro = entrada.nextDouble();
                pagamento.add(seguro);
                entrada.nextLine();
                System.out.println("Digite o valor das despesas adicionais ");
                outrasDespesas = entrada.nextDouble();
                pagamento.add(outrasDespesas);
                entrada.nextLine();
                totalProduto = valorProduto+frete+seguro+outrasDespesas;
                System.out.println("Total produto "+totalProduto);
                pagamento.add(totalProduto);
                
                break; 
                 
            case "E":
                System.out.print("Digite o indice: ");
                indice = entrada.nextInt();
                if (indice >= 0 && indice < pagamento.size())//valida se o índice informado é válido
                {
                    pagamento.remove(indice); //excluindo o valor que está no índice informado
                }
             break;

            case "S":
                System.out.println("Encerrando o programa");  
               
           break;
        
     }
        System.out.println("A lista neste momento está assim: ");
        for (int i = 0; i < pagamento.size(); i++) {
            //em ProjetoArrayList, não se usa [] para acessar um item, mas sim método get()
            System.out.println(pagamento.get(i));  
          
        }
     
 }
}
    public Impostos() {

    }

    public Impostos(double totalDebito, double totalCredito, double debito, double credito) {
        this.totalDebito = totalDebito;
        this.totalCredito = totalCredito;
        this.debito = debito;
        this.credito = credito;
    }

    public Impostos(double aliquota, double valorProduto, double frete, double seguro, double outrasDespesas) {
        this.aliquota = aliquota;
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
    }

    public double getTotalDebito() {
        return totalDebito;
    }

    public void setTotalDebito(double totalDebito) {
        this.totalDebito = totalDebito;
    }

    public double getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(double totalCredito) {
        this.totalCredito = totalCredito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

}
