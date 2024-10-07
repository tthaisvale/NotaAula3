import java.time.LocalDate;
import java.time.Period;


public class Funcionario {
    protected String nome;
    protected LocalDate nasc;
    protected double salario;

    // Construtor
    public Funcionario(String nome, LocalDate nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    // Método para exibir o salário
    public void informarSalario() {
        System.out.println("Salário: R$ " + salario);
    }

    // Método para calcular e exibir a idade do funcionário
    public void calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(nasc, hoje);
        System.out.println("Idade: " + idade.getYears() + " anos");
    }
}
