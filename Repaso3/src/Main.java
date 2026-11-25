public class Main {
    public static void main(String[] args) {
        //1:
        LibroDigital libroMatematicas = new LibroDigital("Algebra 1");
        Audiolibro libroLengua = new  Audiolibro("Antologia Literatura");

        libroMatematicas.mostrarDescripcion();
        libroLengua.mostrarDescripcion();

        //2:
        Tarjeta tar1 = new Tarjeta("Alfonso", 1234);
        BilleteraVirtual bv1 = new BilleteraVirtual("Eduardo", "Mercado Pago");

        tar1.procesarPago(200.45);
        bv1.procesarPago(450.95);
        bv1.procesarPago(-2);
    }
}
