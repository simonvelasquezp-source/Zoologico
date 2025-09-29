package zoologico;

public class Leon extends Animal {

    public Leon(String especie, String id, String nombre, int edad, String peso){
        super(especie, id, nombre, edad, peso);
    }
@Override
    public void hacerSonido() {
        System.out.println("rugido");
}
}