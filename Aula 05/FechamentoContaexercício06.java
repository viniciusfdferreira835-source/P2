import java.util.Scanner;

public class FechamentoContaexercício06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a porcentagem da taxa de serviço (ex: 10 para 10%): ");
        double taxa = leitor.nextDouble();

        System.out.println("\n Dados do Café Orfeu ");
        System.out.print("Código do produto: ");
        String cod1 = leitor.next();
        System.out.print("Valor unitário: R$ ");
        double valor1 = leitor.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quant1 = leitor.nextInt();

        System.out.println("\n Dados do  cappuccino");
        System.out.print("Código do produto: ");
        String cod2 = leitor.next();
        System.out.print("Valor unitário: R$ ");
        double valor2 = leitor.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quant2 = leitor.nextInt();

        double valorTotal = (valor1 * quant1 + valor2 * quant2) * (taxa / 100.0 + 1);

        System.out.println("\n=");
        System.out.printf("Valor total da compra com taxa: R$ %.2f\n", valorTotal);
        System.out.println("=");

        leitor.close();
    }
}