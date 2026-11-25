public class MedioPago {
    private final String titular;

    public MedioPago(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void procesarPago(double monto){
        System.out.println("Procesando pago por "+monto);
    }
}
