package zoologico;

public class Nutria extends Animal {
    public Nutria(String especie, String id, String nombre, int edad, String peso){
        super(especie, id, nombre, edad, peso);
    }
@Override
    public void hacerSonido() {
        System.out.println("mugidos o");
}
    
}
