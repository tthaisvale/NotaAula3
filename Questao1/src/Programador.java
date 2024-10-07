import java.time.LocalDate;

public class Programador extends Funcionario {
    private String linguagem;

    // Construtor
    public Programador(String nome, LocalDate nasc, double salario, String linguagem) {
        super(nome, nasc, salario);  // Chama o construtor da classe base
        this.linguagem = linguagem;
    }

    // Método para exibir a linguagem de programação do programador
    public void informarLinguagem() {
        System.out.println("Linguagem de programação: " + linguagem);
    }
}
