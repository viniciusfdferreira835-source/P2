import java.util.Scanner;

public class CalculadoraDescontoexercício03
 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor unitário do produto (ex: 51,00): R$ ");
        double valorUnico = leitor.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = leitor.nextInt();

        double valorTotal = valorUnico * quantidade;
        System.out.println("Valor total sem desconto: R$ " + valorTotal);

        if (valorTotal > 100.00) {
            double valorDesconto = valorTotal * 0.08;
            
            double valorFinal = valorTotal - valorDesconto;
            
            System.out.println("Parabéns! Você ganhou 8% de desconto.");
            System.out.println("Valor do desconto: R$ " + valorDesconto);
            System.out.println("Valor final a pagar: R$ " + valorFinal);
        }

        leitor.close();
    }
}