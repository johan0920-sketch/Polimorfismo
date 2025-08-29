public class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Gua Gua");
    }
    @Override
    public void comer() {
        System.out.println("El perro come carne");
    }
}