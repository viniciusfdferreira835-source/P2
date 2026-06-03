import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    protected String nome, cpf, dataNasc;
    protected double salario;

    public Funcionario(String n, String c, double s, String d) {
        nome = n; cpf = c; salario = s; dataNasc = d;
    }
    public String getCpf() { return cpf; }
    public double getSalario() { return salario; }
    public void exibirInfo() { System.out.print("Nome: " + nome + " | CPF: " + cpf + " | Nasc: " + dataNasc); }
}

class Gerente extends Funcionario {
    public Gerente(String n, String c, double s, String d) { super(n, c, s, d); }
    @Override public double getSalario() { return super.getSalario() + 2000.0; }
}

class Atendente extends Funcionario {
    private double comissao;
    public Atendente(String n, String c, double s, String d, double com) {
        super(n, c, s, d); comissao = com;
    }
    @Override public double getSalario() { return super.getSalario() + comissao; }
}

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();
        int op = 0;

        while (op != 5) {
            System.out.print("\n1.Add Gerente | 2.Add Atendente | 3.Listar | 4.Buscar por CPF | 5.Sair\nOpção: ");
            op = in.nextInt(); in.nextLine();

            if (op == 1 || op == 2) {
                System.out.print("Digite (dando Enter após cada um): Nome, CPF, Nasc e Salário Base:\n");
                String n = in.nextLine(), c = in.nextLine(), d = in.nextLine();
                double s = in.nextDouble();
                
                if (op == 1) {
                    lista.add(new Gerente(n, c, s, d));
                } else {
                    System.out.print("Comissão: ");
                    lista.add(new Atendente(n, c, s, d, in.nextDouble()));
                }
                System.out.println("✅ Funcionário Salvo!");
            } 
            else if (op == 3) {
                System.out.println("\n--- LISTA ---");
                for (Funcionario f : lista) {
                    f.exibirInfo();
                    System.out.println(" | Cargo: " + f.getClass().getSimpleName() + " | Salário Final: R$ " + f.getSalario());
                }
            } 
            else if (op == 4) {
                System.out.print("Digite o CPF: "); 
                String cpfBusca = in.nextLine();
                boolean achou = false;
                for (Funcionario f : lista) {
                    if (f.getCpf().equals(cpfBusca)) {
                        System.out.println("✅ Salário Final: R$ " + f.getSalario());
                        achou = true; break;
                    }
                }
                if (!achou) System.out.println("❌ Não encontrado.");
            }
        }
        in.close();
    }
}
