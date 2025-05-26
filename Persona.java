public class Persona {
    
private int Id;
private String Nombre;
private String Apellidos;
private int Edad;

public Persona() {
}

public Persona(int id, String nombre, String apellidos, int edad) {
    Id = id;
    Nombre = nombre;
    Apellidos = apellidos;
    Edad = edad;
}

public int getId() {
    return Id;
}

public void setId(int id) {
    Id = id;
}

public String getNombre() {
    return Nombre;
}

public void setNombre(String nombre) {
    Nombre = nombre;
}

public String getApellidos() {
    return Apellidos;
}

public void setApellidos(String apellidos) {
    Apellidos = apellidos;
}

public int getEdad() {
    return Edad;
}

public void setEdad(int edad) {
    Edad = edad;
}

public void Concentrarse() {
    System.out.println("Concentrándose...");
}
public void Viajar() {
    System.out.println("Viajando...");
}


}
