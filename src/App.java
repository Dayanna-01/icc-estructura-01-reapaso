import Models.Persona;
import views.ViewConsole;
import Controllers.PersonaController;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Ana", 30),
            new Persona("Luis", 22),
            new Persona("María", 28),
            new Persona("Carlos", 35),
            new Persona("Laura", 27),
            new Persona("Pedro", 24),
            new Persona("Sofía", 29),
            new Persona("Diego", 31),
            new Persona("Elena", 26)
        };

        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();

        vC.printMessage("Personas", true);
        vC.printPersonaArray(personas);

        vC.printMessage("Personas ordenadas por edad", true);
        pC.ordenarPorEdad(personas);
        vC.printPersonaArray(personas);

        vC.printMessage("Buscar persona con edad 40", true);
        Persona pB = pC.buscarPorEdad(personas, 40);
        if (pB == null) {
            vC.printMessage("\tNo hay persona con esa edad", false);
        } else {
            vC.printMessage("\tLa persona con la edad 40 es:", false);
            vC.printMessage("\t" + pB, false);
        }

        vC.printMessage("Buscar persona con edad 90", true);
        Persona pB2 = pC.buscarPorEdad(personas, 90);
        if (pB2 == null) {
            vC.printMessage("\tNo hay persona con esa edad", false);
        } else {
            vC.printMessage("\tLa persona con la edad 90 es:", false);
            vC.printMessage("\t" + pB2, false);
        }
    }
}
