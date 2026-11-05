package rpgmanager;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Item> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void agregar(Item item) {
        items.add(item);
    }

    public List<Item> listar() {
        return new ArrayList<>(items);
    }

    public Item usar(String nombre, Personaje personaje) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item.getNombre().equals(nombre)) {
                if (item.getTipo().equals("pocion")) {
                    personaje.setVida(personaje.getVida() + item.getValor());
                }
                items.remove(i);
                return item;
            }
        }
        return null;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "vacio";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(items.get(i));
        }
        return sb.toString();
    }
}
