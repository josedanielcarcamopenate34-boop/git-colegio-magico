package com.colegiomagico.reto6;

/**
 * Usa Switch. Gryffindor -> Valentia, Ravenclaw -> Inteligencia, otro -> Desconocido.
 */
public class SombreroClasificador {

    public static String clasificar(String casa) {
        return switch (casa) { // TODO: Cambia esto
            case "Gryffindor" -> "Valentia";
            case "Ravenclaw" -> "Inteligencia";
            default -> "Desconocido";
        };
    }
    

    public static void main(String[] args) {
        System.out.println("Gryffindor: " + clasificar("Gryffindor"));
    }
}
