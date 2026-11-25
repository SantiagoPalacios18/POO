public class Tarjeta extends MedioPago{
    private final int ultimosCuatroDigitos;

    public Tarjeta(String titular, int ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto){
        if(monto<=0){
            System.out.println("\nError: El monto debe ser mayor a 0");
            return;
        }
        System.out.println("\nPago por tarjeta\nTitular: "+getTitular()+"\nUltimos 4 digitos: "+ultimosCuatroDigitos+"\nMonto total: "+monto);
    }
}
