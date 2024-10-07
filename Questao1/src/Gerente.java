import java.time.LocalDate;

public class Gerente extends Funcionario {
    private String projeto;

    // Construtor
    public Gerente(String nome, LocalDate nasc, double salario, String projeto) {
        super(nome, nasc, salario);  // Chama o construtor da classe base
        this.projeto = projeto;
    }

    // Método para exibir o projeto que o gerente está gerenciando
    public void informarProjeto() {
        System.out.println("Projeto gerenciado: " + projeto);
    }
}
