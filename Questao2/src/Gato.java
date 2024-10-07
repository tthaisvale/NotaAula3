public class Gato extends Animal {

    // Construtor que chama o construtor da classe base
    public Gato(String nome) {
        super(nome);  // Chama o construtor da classe Animal
    }

    // Método específico para Gato
    public void mia() {
        System.out.println(this.nome + " está miando.");
    }
}
