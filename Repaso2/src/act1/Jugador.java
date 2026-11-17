package act1;

public class Jugador {
    private String nombre;
    private int nivel;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void ganarPuntos(int puntos) {
        if  (puntos <= 0) {
            System.out.println("No se admiten valores negativos/0");
            return;
        }
        this.puntos += puntos;
        System.out.println("El jugador "+nombre+" gano "+"puntos\n Puntos del|la jugador/a: " + this.puntos + "\n");
    }

    public void subirNivel(){
        this.nivel += 1;
        System.out.println(this.nombre+" subio de nivel!\nNivel Actual: " + this.nivel + "\n");
    }

    @Override
    public String toString() {
        return  "Jugador "+nombre+
                "\nNivel: "+nivel+
                "\nPuntos: "+puntos;
    }
}
