package act2;

public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Marcelo Ortiz Pla", 66, "Fisica");
        Preceptor preceptor = new Preceptor("Agustin Belenosemeocurreapellido", 40, "3ro5ta");

        docente.mostrarInformacion();
        preceptor.mostrarInformacion();

        docente.setEdad(70);
        System.out.println("Nueva edad: " + docente.getEdad());z
    }
}
