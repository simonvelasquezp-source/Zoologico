package zoologico;

public class App {
    public static void main(String[] args) {
        
        
         Zoologico zoo = new Zoologico("Mi Zoológico", "123456789", "Calle 123, Ciudad");

        Animal leon = new Leon("León africano", "A001", "Simba", 5, "190.5 kg");
        Animal Jirafa = new Jirafa("Jirafa", "A002", "Blondy", 10, "900 kg");
        Animal mono = new Mono("Mono capuchino", "A003", "Jorge", 3, "6 kg");
        Animal Loro = new Loro("Loro", "A004", "Roman", 7, "2 KG");
        Animal Nutria = new Nutria("Nutria", "A005", "Maria", 2, "5 KG");

        zoo.agregarAnimal(leon);
        zoo.agregarAnimal(Jirafa);
        zoo.agregarAnimal(mono);
        zoo.agregarAnimal(Loro);
        zoo.agregarAnimal(Nutria);

        System.out.println("📋 Lista de animales:");
        zoo.listarAnimales();

        zoo.actualizarEdad("nombre:Simba", 6);

        zoo.eliminarAnimal("Maria");

        System.out.println("\n📋 Lista de animales actualizada:");
        zoo.listarAnimales();

        System.out.println("\n🔊 Sonidos de los animales:");
        zoo.hacerSonidos();
    }
}
