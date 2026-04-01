import java.util.Scanner; 

public class DobroETriploexercício01
 { 
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
        
        int numero = leitor.nextInt();

        int dobro = numero * 2;
        int triplo = numero * 3;

        System.out.println("O dobro de " + numero + " é: " + dobro);
        System.out.println("O triplo de " + numero + " é: " + triplo);

        leitor.close();
    }
}