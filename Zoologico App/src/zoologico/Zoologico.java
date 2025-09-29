package zoologico;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String NIT;
    private String direccion;
    private List<Animal> animales = new ArrayList<>();

    public Zoologico(String nombre, String NIT, String direccion) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.direccion = direccion;
    }
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }
    public void listarAnimales() {
        for (Animal a : animales) {
            System.out.println(a);  
        }
    }
    public void actualizarEdad(String nombre, int nuevaEdad) {
        for (Animal a : animales) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                a.setEdad(nuevaEdad);
                break;
            }
        }
    }
    public void eliminarAnimal(String nombre) {
        animales.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
    }
    public void hacerSonidos() {
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
