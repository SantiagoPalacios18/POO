package act2;

public class Preceptor extends Persona{
    private String cursoAsignado;

    public Preceptor(String nombre, int edad, String cursoAsignado) {
        super(nombre, edad);
        this.cursoAsignado = cursoAsignado;
    }

    public String getCursoAsignado() {
        return cursoAsignado;
    }

    public void setCursoAsignado(String cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }

    public Void mostrarInformacion(){
        System.out.println("Preceptor\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nCurso: "+getCursoAsignado()+"\n");
        return null; // Nose pq me pide esto esta raro el Intellij jajajaj
    }
}
