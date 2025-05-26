public class Futbolista extends Persona{

private int dorsal;
private String demarcacion;

public Futbolista() {
}

public Futbolista(int dorsal, String demarcacion) {
    this.dorsal = dorsal;
    this.demarcacion = demarcacion;
}

public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
    super(id, nombre, apellidos, edad);
    this.dorsal = dorsal;
    this.demarcacion = demarcacion;
}

public int getDorsal() {
    return dorsal;
}

public void setDorsal(int dorsal) {
    this.dorsal = dorsal;
}

public String getDemarcacion() {
    return demarcacion;
}

public void setDemarcacion(String demarcacion) {
    this.demarcacion = demarcacion;
}

@Override
public void Concentrarse(){
    System.out.println("Concentrandose como futbolista");
}

@Override
public void Viajar(){
    System.out.println("Viajando como futbolista");
}

public void jugarPartido(){
    System.out.println("jugando partido");
}

public void entrenar(){
    System.out.println("Entrenando");
}

}


