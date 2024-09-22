import java.util.Scanner;

    public class CaixacomTernaria{
        public static void main(String[] args) throws Exception{
            double saldo;
            double valoraSacar;
            
            try(Scanner scanner = new Scanner(System.in)){
                System.out.println("Qual seu saldo atual ? ");
                    saldo = scanner.nextDouble();
                System.out.println("Qual o valor que deseja sacar?");
                    valoraSacar = scanner.nextDouble();
            scanner.close();
            }
            String resultado = valoraSacar > saldo ? "Saldo insuficiente":"Saldo autorizado, seu novo saldo é de " + (saldo - valoraSacar) + "R$";
                System.out.println(resultado);               
        }


    }