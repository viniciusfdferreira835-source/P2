import java.util.Scanner;

public class CalculoCombustivelexercício04 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o preço do litro do combustível: R$ ");
        double precoLitro = leitor.nextDouble();

        System.out.print("Digite o valor disponível para abastecer: R$ ");
        double valorDisponivel = leitor.nextDouble();

        double litrosComprados = valorDisponivel / precoLitro;

        System.out.println("Com R$ " + valorDisponivel + ", você conseguirá comprar " + litrosComprados + " litros de combustível.");

        leitor.close();
    }
}
