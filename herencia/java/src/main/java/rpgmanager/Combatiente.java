package rpgmanager;

public interface Combatiente {
    int atacar(Combatiente objetivo);
    void recibirDano(int cantidad);
    boolean estaVivo();
    String getNombre();
    int getVida();
}
