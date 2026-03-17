package arraylist;

import java.util.*;

// Clase interna para representar un Partido
class Partido {
    String local, visitante;
    int golesLocal, golesVisitante;

    public Partido(String l, String v, int gl, int gv) {
        this.local = l; this.visitante = v;
        this.golesLocal = gl; this.golesVisitante = gv;
    }

    @Override
    public String toString() {
        return local + " (" + golesLocal + ") vs " + visitante + " (" + golesVisitante + ")";
    }
}

public class ejercicio10 {
    public static void main(String[] args) {
        ArrayList<Partido> partidos = new ArrayList<>();
        partidos.add(new Partido("Barcelona", "Real Madrid", 2, 1));
        partidos.add(new Partido("Atletico", "Barcelona", 1, 3));
        partidos.add(new Partido("Sevilla", "Valencia", 0, 0));
        partidos.add(new Partido("Villarreal", "Getafe", 1, 2));

        // 1. Visitante ganador
        System.out.println("--- Partidos donde ganó el visitante ---");
        for (Partido p : partidos) {
            if (p.golesVisitante > p.golesLocal) System.out.println(p);
        }

        // 2. ¿Cuántas veces ganó el Barcelona?
        long ganoBarca = partidos.stream().filter(p -> 
            (p.local.equals("Barcelona") && p.golesLocal > p.golesVisitante) || 
            (p.visitante.equals("Barcelona") && p.golesVisitante > p.golesLocal)).count();
        System.out.println("\nBarcelona ganó: " + ganoBarca + " veces.");

        // 3. Contar victorias locales
        long victoriasLocales = partidos.stream().filter(p -> p.golesLocal > p.golesVisitante).count();
        System.out.println("Partidos ganados por locales: " + victoriasLocales);

        // 4. Eliminar si NO es empate
        partidos.removeIf(p -> p.golesLocal != p.golesVisitante);
        System.out.println("\nLista final (Solo empates): " + partidos);
    }
}