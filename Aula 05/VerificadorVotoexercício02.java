import java.util.Scanner;

public class VerificadorVotoexercício02
 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = leitor.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }

        leitor.close();
    }
}