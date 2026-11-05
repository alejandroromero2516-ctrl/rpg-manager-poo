package rpgmanager;

public class Mago extends Personaje {
    private int mana;
    private int manaMaximo;

    public Mago(String nombre, int nivel, int vidaMaxima, int ataque, int mana) {
        super(nombre, nivel, vidaMaxima, ataque);
        this.mana = mana;
        this.manaMaximo = mana;
    }

    @Override
    public int atacar(Combatiente objetivo) {
        if (mana <= 0) {
            return 0;
        }
        mana -= 1;
        int dano = ataque;
        objetivo.recibirDano(dano);
        return dano;
    }

    // Sobrecarga tradicional (Reto 4)
    public int atacar(Combatiente objetivo, String hechizo, int costoMana) {
        if (mana < costoMana) {
            return 0;
        }
        mana -= costoMana;
        int dano = ataque + 10;
        objetivo.recibirDano(dano);
        return dano;
    }

    @Override
    public int habilidadEspecial(Combatiente objetivo) {
        if (mana < 5) {
            return 0;
        }
        mana -= 5;
        int dano = ataque * 3;
        objetivo.recibirDano(dano);
        return dano;
    }

    public String toString() {
        return super.toString() + " | Mago (mana " + mana + "/" + manaMaximo + ")";
    }
}
