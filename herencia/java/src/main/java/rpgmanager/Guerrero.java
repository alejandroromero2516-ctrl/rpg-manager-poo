package rpgmanager;

public class Guerrero extends Personaje {
    private int fuerza;
    private int armadura;

    public Guerrero(String nombre, int nivel, int vidaMaxima, int ataque, int fuerza, int armadura) {
        super(nombre, nivel, vidaMaxima, ataque);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }

    @Override
    public void recibirDano(int cantidad) {
        int reducido = Math.max(0, cantidad - armadura);
        super.recibirDano(reducido);
    }

    @Override
    public int atacar(Combatiente objetivo) {
        int dano = ataque + fuerza;
        objetivo.recibirDano(dano);
        return dano;
    }

    @Override
    public int habilidadEspecial(Combatiente objetivo) {
        int dano = (ataque + fuerza) * 2;
        objetivo.recibirDano(dano);
        return dano;
    }

    public String toString() {
        return super.toString() + " | Guerrero (fuerza " + fuerza + ", armadura " + armadura + ")";
    }
}
