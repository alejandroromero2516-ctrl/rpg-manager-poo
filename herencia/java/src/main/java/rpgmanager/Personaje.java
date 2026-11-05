package rpgmanager;

public abstract class Personaje implements Combatiente {
    protected String nombre;
    protected int nivel;
    protected int vidaMaxima;
    protected int vida;
    protected int ataque;
    protected Inventario inventario;

    public Personaje(String nombre, int nivel, int vidaMaxima, int ataque) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.ataque = ataque;
        this.inventario = new Inventario();
    }

    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getVida() { return vida; }
    public int getVidaMaxima() { return vidaMaxima; }
    public int getAtaque() { return ataque; }

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

    public abstract int habilidadEspecial(Combatiente objetivo);

    public String toString() {
        return nombre + " (Nv." + nivel + ") - Vida: " + vida + "/" + vidaMaxima;
    }
}
