import java.util.Scanner;

public class CalculoCinemaexercício05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valorIngresso = 40.00;

        // --- Menu de Filmes ---
        System.out.println("Filmes em cartaz:");
        System.out.println("01 - Vingadores: Doomsday");
        System.out.println("02 - Live Action de Moana");
        System.out.println("03 - Lilo & Stitch");
        System.out.print("Digite o número do filme desejado: ");
        
        String opcaoFilme = leitor.next();
        String nomeFilme = "";

        switch (opcaoFilme) {
            case "01":
            case "1":
                nomeFilme = "Vingadores: Doomsday";
                break;
            case "02":
            case "2":
                nomeFilme = "Live Action de Moana";
                break;
            case "03":
            case "3":
                nomeFilme = "Lilo & Stitch";
                break;
            default:
                System.out.println("Opção de filme inválida! Encerrando o programa.");
                leitor.close();
                return;
        }

        System.out.println("\n-");
        
        System.out.println("Tipos de ingresso disponíveis:");
        System.out.println("I - Ingresso Inteiro");
        System.out.println("M - Meia-entrada");
        System.out.print("Digite o tipo desejado (I ou M): ");
        
        String tipo = leitor.next();

        System.out.println("\n--- Resumo da Compra ---");
        System.out.println("Filme: " + nomeFilme);

        if (tipo.equalsIgnoreCase("M")) {
            double valorMeia = valorIngresso * 0.50; 
            System.out.println("Tipo: Meia-entrada");
            System.out.println("Valor a ser pago: R$ " + valorMeia);
            
        } else if (tipo.equalsIgnoreCase("I")) {
            System.out.println("Tipo: Ingresso Inteiro");
            System.out.println("Valor a ser pago: R$ " + valorIngresso);
            
        } else {
            System.out.println("Opção de ingresso inválida! Por favor, reinicie o programa e digite I ou M.");
        }
        
        System.out.println("-");

        leitor.close();
    }
}