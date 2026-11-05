package rpgmanager;

public class Arquero extends Personaje {
    private int flechas;
    private int precision;

    public Arquero(String nombre, int nivel, int vidaMaxima, int ataque, int flechas, int precision) {
        super(nombre, nivel, vidaMaxima, ataque);
        this.flechas = flechas;
        this.precision = precision;
    }

    @Override
    public int atacar(Combatiente objetivo) {
        if (flechas <= 0) {
            return 0;
        }
        flechas -= 1;
        int dano = ataque + precision;
        objetivo.recibirDano(dano);
        return dano;
    }

    @Override
    public int habilidadEspecial(Combatiente objetivo) {
        if (flechas < 3) {
            return 0;
        }
        flechas -= 3;
        int dano = (ataque + precision) * 2;
        objetivo.recibirDano(dano);
        return dano;
    }

    public String toString() {
        return super.toString() + " | Arquero (flechas " + flechas + ", precision " + precision + ")";
    }
}
