package zoologico;

public class Loro extends Animal {
   public Loro(String especie, String id, String nombre, int edad, String peso){
        super(especie, id, nombre, edad, peso);
    }
@Override
    public void hacerSonido() {
        System.out.println("silba, grita y imita en cocsiones al humano");
}
}
