public class Main {
    public static void main(String[] args) {
        //Act. 1
        System.out.println("\nActividad 1\n");
        Empleado em1 = new Empleado("Horacio", 55, 1200.50);
        System.out.println("DATOS EMPLEADO:\nNombre: "+ em1.getNombre()+"\nEdad: "+ em1.getEdad()+"\nSalario: "+ em1.getSalario());
        System.out.println("---------------------------------------------------------");

        //Act. 2
        System.out.println("\nActividad 2\n");
        Auto auto = new Auto("Ford", "Fiesta", 5);
        System.out.println(auto);
        System.out.println("---------------------------------------------------------");

        //Act. 3
        System.out.println("\nActividad 3\n");
        Perro perro = new Perro("Firulais", 5, "Salchicha");
        perro.ladrar();
    }
}
