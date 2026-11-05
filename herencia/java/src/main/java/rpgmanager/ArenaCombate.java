package rpgmanager;

public class ArenaCombate {
    private Combatiente c1;
    private Combatiente c2;

    public ArenaCombate(Combatiente c1, Combatiente c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public void combatir() {
        int turno = 1;
        while (c1.estaVivo() && c2.estaVivo()) {
            System.out.println("\n--- Turno " + turno + " ---");
            int dano = c1.atacar(c2);
            System.out.println(c1.getNombre() + " ataca por " + dano + ". " + c2 + " queda con " + c2.getVida() + " vida.");
            if (!c2.estaVivo()) {
                System.out.println(c1 + " gana el combate.");
                break;
            }
            dano = c2.atacar(c1);
            System.out.println(c2.getNombre() + " ataca por " + dano + ". " + c1 + " queda con " + c1.getVida() + " vida.");
            if (!c1.estaVivo()) {
                System.out.println(c2 + " gana el combate.");
                break;
            }
            turno++;
        }
    }
}
