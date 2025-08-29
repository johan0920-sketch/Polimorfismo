public class Main {
    public static void main(String[] args) {
        Animal caballo = new Caballo();
        Animal elefante = new Elefante();
        Animal foca = new Foca();
    Animal perro = new Perro();
    Animal gato = new Gato();

        System.out.println("Caballo:");
        caballo.hacerSonido();
        caballo.comer();

        System.out.println("\nElefante:");
        elefante.hacerSonido();
        elefante.comer();

        System.out.println("\nFoca:");
        foca.hacerSonido();
        foca.comer();
    System.out.println("\nPerro:");
    perro.hacerSonido();
    perro.comer();

    System.out.println("\nGato:");
    gato.hacerSonido();
    gato.comer();
    }
}
