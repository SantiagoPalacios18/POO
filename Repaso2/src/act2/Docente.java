package act2;

public class Docente extends Persona {
    private String materia;

    public Docente(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Void mostrarInformacion(){
        System.out.println("Docente\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nMateria: "+materia+"\n");
        return null; // Nose pq me pide esto esta raro el Intellij jajajaj
    }
}
