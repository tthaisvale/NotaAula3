public class Cachorro extends Animal {

    // Construtor que chama o construtor da classe base
    public Cachorro(String nome) {
        super(nome);  // Chama o construtor da classe Animal
    }

    // Método específico para Cachorro
    public void late() {
        System.out.println(this.nome + " está latindo.");
    }
}
