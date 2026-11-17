public class Main {
    public static void main(String[] args) {
        //Act. 1
        System.out.println("\n---------------------------------------------------");
        System.out.println("\nActividad 1:\n");
        //Persona persona1 = new Persona("Manuel Belgrano", 237);
        //Persona persona2 = new Persona("Ivo Robotnik", 45);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.nombre = "Manuel Belgrano";
        persona1.edad = 237;

        persona2.nombre = "Ivo Robotnik";
        persona2.edad = 45;

        System.out.println("Personas: " + persona1 + " y " + persona2);

        //Act. 2
        System.out.println("\n---------------------------------------------------");
        System.out.println("\nActividad 2:\n");
        Libro libro1 = new Libro("El camino de los reyes", "Brandon Sanderson", 2012);
        Libro libro2 = new Libro("El Rithmatista", "Brandon Sanderson", 2012);

        System.out.println("Primer libro:\n" + libro1 + "\nSegundo libro:\n" + libro2);

        //Act. 3
        System.out.println("\n---------------------------------------------------");
        System.out.println("\nActividad 3:");
        Auto auto1 = new Auto("Volkswagen", "Suran", "blanco");
        Auto auto2 = new Auto("Ford", "Fiesta", "azul");
        Auto auto3 = new Auto("Ford", "Falcon", "verde");

        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();

        //Act. 4
        System.out.println("\n---------------------------------------------------");
        System.out.println("\nActividad 4:\n");
        CuentaBancaria cb1 = new CuentaBancaria();

        cb1.setSaldo(250.49);
        System.out.println("Saldo: " + cb1.getSaldo());

        //Act. 5
        System.out.println("\n---------------------------------------------------");
        System.out.println("\nActividad 5:\n");
        //Entiendo que queres que usemos rectangulo para crear un triangulo, no me quedo claro el enunciado
        Rectangulo triangulo = new Rectangulo(10, 15);
        System.out.println("Area: " + triangulo.calcularArea()/2);
    }
}
