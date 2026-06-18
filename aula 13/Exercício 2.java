//● Crie uma classe de exceção chamada LoginInvalidoException que herda de Exception.
//● Crie uma classe SistemaLogin com um atributo privado senhaSecreta
//○ O atributo senhaSecreta deve ter o valor default "123456" no construtor.
//○ Crie um método public void fazerLogin(String usuario, String senha) que deve lançar a
//exceção LoginInvalidoException se a senha informada for diferente da senhaSecreta.
//● No método main de uma classe de teste, peça para o usuário digitar o login e a senha.
//● Chame o método fazerLogin dentro de um bloco try-catch e capture a sua exceção
//personalizada, exibindo a mensagem "Acesso Negado: Credenciais incorretas".

import java.util.Scanner;

// ==========================================
// 1. CLASSE DE EXCEÇÃO PERSONALIZADA
// ==========================================
// Como herda de Exception, é uma "Exceção Verificada" (Checked Exception)
class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}

// ==========================================
// 2. CLASSE DO SISTEMA DE LOGIN
// ==========================================
class SistemaLogin {
    // Atributo privado garantindo o encapsulamento
    private String senhaSecreta;

    // Construtor define o valor default exigido no exercício
    public SistemaLogin() {
        this.senhaSecreta = "123456";
    }

    // Método que declara que pode lançar a exceção customizada (throws)
    public void fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        // Se a senha digitada for diferente da senha secreta, lançamos a exceção
        if (!senha.equals(this.senhaSecreta)) {
            throw new LoginInvalidoException("Acesso Negado: Credenciais incorretas.");
        }
        
        // Se passar do if sem lançar o erro, o login deu certo
        System.out.println("✅ Login realizado com sucesso! Bem-vindo, " + usuario + ".");
    }
}

// ==========================================
// 3. CLASSE DE TESTE (MAIN)
// ==========================================
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        SistemaLogin sistema = new SistemaLogin();

        System.out.println("=== TELA DE ACESSO ===");
        
        // Pede os dados ao usuário
        System.out.print("Digite o usuário: ");
        String usuarioDigitado = leitor.nextLine();
        
        System.out.print("Digite a senha: ");
        String senhaDigitada = leitor.nextLine();

        System.out.println("----------------------");

        // Chama o método protegido pelo bloco try-catch
        try {
            sistema.fazerLogin(usuarioDigitado, senhaDigitada);
            
        } catch (LoginInvalidoException e) {
            // Captura a exceção personalizada e exibe a mensagem exigida no slide
            System.out.println("❌ Acesso Negado: Credenciais incorretas");
        }

        leitor.close();
    }
}
