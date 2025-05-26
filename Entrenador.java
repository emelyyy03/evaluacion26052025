public class Entrenador extends Persona {
private String IdFederacion;

public Entrenador() {
}

public Entrenador(String idFederacion) {
    IdFederacion = idFederacion;
}

public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
    super(id, nombre, apellidos, edad);
    IdFederacion = idFederacion;
}

public String getIdFederacion() {
    return IdFederacion;
}

public void setIdFederacion(String idFederacion) {
    IdFederacion = idFederacion;
}

@Override
public void Concentrarse(){
    System.out.println("Concentrandose como entrenador");
}

@Override
public void Viajar(){
    System.out.println("Viajando como entrenador");
}

public void dirigirPartido(){
    System.out.println("Dirigiendo el partido");
}

public void DirigirEntrenamiento(){
    System.out.println("Dirigiendo el entrenamiento");
}

}

