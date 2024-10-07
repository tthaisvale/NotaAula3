public class SistemaAnimais {
    public static void main(String[] args) {
        // Criando um Cachorro
        Cachorro cachorro = new Cachorro("Tufinho");
        cachorro.caminha();
        cachorro.late();

        // Criando um Gato
        Gato gato = new Gato("Fantasma");
        gato.caminha();
        gato.mia();
    }
}
