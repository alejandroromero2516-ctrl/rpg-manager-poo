package rpgmanager;

public class Monstruo implements Combatiente {
    private String nombre;
    private int vidaMaxima;
    private int vida;
    private int ataque;

    public Monstruo(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vidaMaxima = vida;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public int getVidaMaxima() { return vidaMaxima; }

    public void setVida(int valor) {
        if (valor < 0) valor = 0;
        if (valor > vidaMaxima) valor = vidaMaxima;
        this.vida = valor;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDano(int cantidad) {
        setVida(vida - cantidad);
    }

    public int atacar(Combatiente objetivo) {
        objetivo.recibirDano(ataque);
        return ataque;
    }

    public String toString() {
        return nombre + " - Vida: " + vida + "/" + vidaMaxima;
    }
}
