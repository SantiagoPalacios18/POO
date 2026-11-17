public class Auto extends Vehiculo{
    private int cant_puertas;

    public Auto(String marca, String modelo, int cant_puertas) {
        super(marca, modelo);
        this.cant_puertas = cant_puertas;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    @Override
    public String toString() {
        return "DATOS AUTO:\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nCant_puertas:"+cant_puertas;
    }
}
