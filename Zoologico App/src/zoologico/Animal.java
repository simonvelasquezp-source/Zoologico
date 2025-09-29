package zoologico;

public abstract class Animal{
private String especie;
private String id;
private String nombre;
private int edad;
private String peso;


public  Animal (String especie, String id, String nombre, int edad, String peso){    
    
this.especie=especie;
this.id=id;
this.nombre=nombre;
this.edad=edad;
this.peso=peso;}

public String getEspecie(){
    return especie;
}
public void setEspecie(String especie){
    this.especie=especie;
}
public String getId(){
    return id;
}
public void setId(String id){
    this.id=id;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public int getEdad(int edad){
    return edad;
}
public void setEdad(int edad){
    this.edad=edad;
}
public String getPeso(){
    return peso;
}
public void setPeso(String peso){
    this.peso=peso;
}

public abstract void hacerSonido();

public String toString() {
    return "Nombre:" + nombre + 
           ", Especie:" + especie + 
           ", Edad:" + edad + 
           ",Id:" + id+
           "Peso:" + peso;       
}



}