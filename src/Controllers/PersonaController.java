package Controllers;

import Models.Persona;

public class PersonaController {

    // Ordenamiento por inserción (edad ascendente)
    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona actual = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getEdad() > actual.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = actual;
        }
    }

    // Búsqueda binaria por edad (debe estar ordenado)
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int inicio = 0;
        int fin = personas.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int edadMedia = personas[medio].getEdad();

            if (edadMedia == edad) {
                return personas[medio];
            } else if (edad < edadMedia) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        return null; // No encontrado
    }
}
