package rpgmanager;

public class Principal {
    public static void main(String[] args) {
        System.out.println("=== RPG Manager - Demo de retos ===");

        Guerrero guerrero = new Guerrero("Arthur", 1, 100, 10, 5, 3);
        Mago mago = new Mago("Merlin", 1, 80, 8, 20);
        Arquero arquero = new Arquero("Robin", 1, 90, 7, 10, 4);

        System.out.println("\nPersonajes creados:");
        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);

        Monstruo enemigo = new Monstruo("Goblin", 60, 6);
        System.out.println("\nMago ataca con hechizo:");
        System.out.println("Dano realizado: " + mago.atacar(enemigo, "bola de fuego", 5));
        System.out.println(enemigo);

        Mision mision = new Mision("Rescate en el bosque");
        mision.agregar(guerrero);
        mision.agregar(mago);
        mision.agregar(arquero);
        mision.agregar(enemigo);
        System.out.println();
        mision.iniciar();

        Item pocion = new Item("Pocion de vida", "pocion", 20);
        guerrero.inventario.agregar(pocion);
        System.out.println("\nInventario del guerrero: " + guerrero.inventario);
        guerrero.inventario.usar("Pocion de vida", guerrero);
        System.out.println("Despues de usar pocion: " + guerrero);

        System.out.println("\n=== Arena de combate ===");
        ArenaCombate arena = new ArenaCombate(guerrero, enemigo);
        arena.combatir();
    }
}
