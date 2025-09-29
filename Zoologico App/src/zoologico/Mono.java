package zoologico;

public class Mono extends Animal {
    public Mono(String especie, String id, String nombre, int edad, String peso){
        super(especie, id, nombre, edad, peso);
    }
@Override
    public void hacerSonido() {
        System.out.println("gruñe y chilla");
}
}
