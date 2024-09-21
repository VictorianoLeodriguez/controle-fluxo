import java.util.Scanner;
    
    public class CaixacomComposta{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Qual seu saldo atual?");
                double saldo = scanner.nextDouble();
            System.out.println("Qual o valor que gostaria de sacar?");
                double valorSolicitado = scanner.nextDouble();

            if (valorSolicitado < saldo){
             saldo = saldo - valorSolicitado;
                System.out.println("Seu saldo atualizado é de " + saldo + " R$ ");
                    System.out.println("Obrigada, Volte sempre. ");


            }else
                System.out.println("Saldo Insuficiente, Obrigada, e tenha um bom dia. ");
    
        
    }
    
}
