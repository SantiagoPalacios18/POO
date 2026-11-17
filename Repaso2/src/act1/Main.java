package act1;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Percival de Rolo");
        Jugador jugador2 = new Jugador("Missa el Sinfóico");

        jugador1.subirNivel();
        jugador2.subirNivel();
        jugador2.subirNivel();
        jugador1.ganarPuntos(3500);
        jugador2.ganarPuntos(12500);

        System.out.println(jugador1 + "\n\n" + jugador2);
    }
}
