package zoologico;

public class Jirafa extends Animal{
    public Jirafa(String especie, String id, String nombre, int edad, String peso){
        super(especie, id, nombre, edad, peso);
    }
@Override
    public void hacerSonido() {
        System.out.println("gruñe o emite bufidos");
}
}

