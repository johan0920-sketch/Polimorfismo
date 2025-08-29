public class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau");
    }
    @Override
    public void comer() {
        System.out.println("El gato come pescado");
    }
}