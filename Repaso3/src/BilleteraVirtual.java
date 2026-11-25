public class BilleteraVirtual extends MedioPago{
    private final String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if(monto<=0){
            System.out.println("\nError: El monto debe ser mayor a 0");
            return;
        }
        System.out.println("\nPago por billetera virtual\nTitular: "+getTitular()+"\nNombre aplicacion: "+nombreAplicacion+"\nMonto total: "+monto);
    }
}
