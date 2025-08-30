public class App {
    public static void main(String[] args) throws Exception {
        // Polimorfismo: todas son del tipo Animal
        Animal[] animales = { new Perro(), new Gato() , new Foca(), new Caballo(),new Elefante()};

        for (Animal animal : animales) {
            animal.hacerSonido(); // Llama al método específico de cada clase
        }
    }
}
