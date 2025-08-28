public class App {
    public static void main(String[] args) throws Exception {
        // Polimorfismo: todas son del tipo Animal
        Animal[] animales = { new Perro(), new Gato(), new Caballo(), new Elefante(), new Foca() };

        for (Animal animal : animales) {
            animal.hacerSonido(); // Llama al método específico de cada clase
        }
    }
}
