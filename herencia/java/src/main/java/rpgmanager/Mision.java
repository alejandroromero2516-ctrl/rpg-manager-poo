package rpgmanager;

import java.util.ArrayList;
import java.util.List;

public class Mision {
    private String nombre;
    private List<Combatiente> combatientes;

    public Mision(String nombre) {
        this.nombre = nombre;
        this.combatientes = new ArrayList<>();
    }

    public void agregar(Combatiente combatiente) {
        combatientes.add(combatiente);
    }

    public void iniciar() {
        System.out.println("Mision: " + nombre);
        for (Combatiente c : combatientes) {
            System.out.println(" - " + c);
        }
    }
}
