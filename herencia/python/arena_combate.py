class ArenaCombate:
    """Arena que enfrenta a dos combatientes genericos (Reto 8)."""

    def __init__(self, combatiente1, combatiente2):
        self.c1 = combatiente1
        self.c2 = combatiente2

    def combatir(self):
        turno = 1
        while self.c1.esta_vivo() and self.c2.esta_vivo():
            print(f"\n--- Turno {turno} ---")
            dano = self.c1.atacar(self.c2)
            nombre1 = getattr(self.c1, "nombre", str(self.c1))
            nombre2 = getattr(self.c2, "nombre", str(self.c2))
            print(f"{nombre1} ataca por {dano}. {nombre2} queda con {self.c2.vida} vida.")
            if not self.c2.esta_vivo():
                print(f"{nombre1} gana el combate.")
                break
            dano = self.c2.atacar(self.c1)
            print(f"{nombre2} ataca por {dano}. {nombre1} queda con {self.c1.vida} vida.")
            if not self.c1.esta_vivo():
                print(f"{nombre2} gana el combate.")
                break
            turno += 1
