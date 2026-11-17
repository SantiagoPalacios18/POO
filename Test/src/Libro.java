public class Libro {
    public String titulo;
    public String autor;
    public int ano;

    public Libro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\n";
    }
}
