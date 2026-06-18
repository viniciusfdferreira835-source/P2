//Crie um programa que peça ao usuário dois números inteiros. O programa deve calcular e
//exibir a divisão do primeiro pelo segundo. O seu código deve tratar as seguintes situações
//usando try-catch:
//○ O usuário digitar algo que não é um número inteiro.
//○ O usuário tentar dividir por zero.
//○ Caso ocorra um erro, exiba uma mensagem amigável e peça para o usuário tentar
//novamente (use um loop para insistir até que funcione).

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean divisaoConcluida = false; // Nossa variável de controle para o loop

        System.out.println("=== CALCULADORA DE DIVISÃO ===");

        // O loop continua insistindo enquanto a divisão não for concluída com sucesso
        while (!divisaoConcluida) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int num1 = leitor.nextInt();

                System.out.print("Digite o segundo número inteiro: ");
                int num2 = leitor.nextInt();

                // Tenta fazer a divisão. Se num2 for zero, pula direto pro catch ArithmeticException
                int resultado = num1 / num2;
                
                System.out.println("✅ Sucesso! O resultado da divisão é: " + resultado);
                
                // Se chegou nesta linha sem dar erro, a divisão deu certo. 
                // Mudamos a variável para true para encerrar o loop!
                divisaoConcluida = true;

            } catch (InputMismatchException e) {
                // Captura o erro se o usuário digitar letras ou símbolos
                System.out.println("❌ Ops! Você digitou algo que não é um número inteiro válido.");
                System.out.println("Vamos tentar novamente...\n");
                
                // COMANDO MUITO IMPORTANTE: Limpa o "lixo" (a letra) que ficou preso no Scanner
                // Se não colocar isso, o programa entra em um loop infinito!
                leitor.nextLine(); 

            } catch (ArithmeticException e) {
                // Captura o erro matemático de divisão por zero
                System.out.println("❌ Ops! Na matemática, não é possível dividir por zero.");
                System.out.println("Vamos tentar novamente com outro número...\n");
            }
        }
        
        leitor.close();
    }
}
