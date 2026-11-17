public class Auto {
    public String marca;
    public String modelo;
    public String color;

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void mostrarDatos(){
        System.out.println("\nDatos auto");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
    }
}
