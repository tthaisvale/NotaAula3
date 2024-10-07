public class Animal {
    protected String nome;
    protected String raca;

    // Construtor sem parâmetros
    public Animal() {
        this.nome = "Desconhecido";
        this.raca = "Desconhecida";
    }

    // Construtor com nome
    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Desconhecida";
    }

    // Método que simula o animal caminhando
    public void caminha() {
        System.out.println(this.nome + " está caminhando.");
    }
}
