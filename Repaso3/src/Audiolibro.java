public class Audiolibro extends MaterialDigital{
    public Audiolibro(String titulo) {
        super(titulo);
    }

    public void mostrarDescripcion(){
        System.out.println(getTitulo()+" se puede escuchar");
    }
}
