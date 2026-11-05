from arquero import Arquero
from arena_combate import ArenaCombate
from guerrero import Guerrero
from item import Item
from mago import Mago
from mision import Mision
from monstruo import Monstruo


def main():
    print("=== RPG Manager - Demo de retos ===")

    # Reto 0 y 1: personajes
    guerrero = Guerrero("Arthur", 1, 100, 10, 5, 3)
    mago = Mago("Merlin", 1, 80, 8, 20)
    arquero = Arquero("Robin", 1, 90, 7, 10, 4)

    print("\nPersonajes creados:")
    print(guerrero)
    print(mago)
    print(arquero)

    # Reto 4: sobrecarga del mago
    enemigo = Monstruo("Goblin", 60, 6)
    print("\nMago ataca con hechizo:")
    print("Dano realizado:", mago.atacar(enemigo, "bola de fuego", 5))
    print(enemigo)

    # Reto 6 y 7: mision y composicion
    mision = Mision("Rescate en el bosque")
    mision.agregar(guerrero)
    mision.agregar(mago)
    mision.agregar(arquero)
    mision.agregar(enemigo)
    print()
    mision.iniciar()

    pocion = Item("Pocion de vida", "pocion", 20)
    guerrero.inventario.agregar(pocion)
    print("\nInventario del guerrero:", guerrero.inventario)
    guerrero.inventario.usar("Pocion de vida", guerrero)
    print("Despues de usar pocion:", guerrero)

    # Reto 8: arena de combate
    print("\n=== Arena de combate ===")
    arena = ArenaCombate(guerrero, enemigo)
    arena.combatir()


if __name__ == "__main__":
    main()
