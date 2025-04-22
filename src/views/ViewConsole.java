package views;

import Models.Persona;

/**
 * Clase para mostrar información en consola sobre arreglos de Personas y mensajes generales.
 */
public class ViewConsole {

    /**
     * Imprime un mensaje en consola.
     * 
     * @param message El texto del mensaje a mostrar.
     * @param main    Si es true, el mensaje se mostrará como un encabezado principal.
     */
    public void printMessage(String message, boolean main) {
        if (main) {
            System.out.println("\n=== " + message.toUpperCase() + " ===");
        } else {
            System.out.println(message);
        }
    }

    /**
     * Imprime los elementos de un arreglo de Persona.
     * 
     * @param personas Arreglo de objetos Persona.
     */
    public void printPersonaArray(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }
    }
}
