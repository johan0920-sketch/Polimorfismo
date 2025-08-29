public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animales = { new Perro(), new Gato(), new Caballo(), new Elefante(), new Foca()};

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
