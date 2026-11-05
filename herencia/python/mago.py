from personaje import Personaje


class Mago(Personaje):
    """Mago: sobrecarga de ataque y habilidad especial (Retos 1-5)."""

    def __init__(self, nombre, nivel, vida_maxima, ataque, mana):
        super().__init__(nombre, nivel, vida_maxima, ataque)
        self.mana = mana
        self.mana_maximo = mana

    def atacar(self, objetivo, hechizo=None, costo_mana=0):
        if hechizo:
            if self.mana < costo_mana:
                return 0
            self.mana -= costo_mana
            dano = self._ataque + 10
            objetivo.recibir_dano(dano)
            return dano
        if self.mana <= 0:
            return 0
        self.mana -= 1
        dano = self._ataque
        objetivo.recibir_dano(dano)
        return dano

    def habilidad_especial(self, objetivo):
        if self.mana < 5:
            return 0
        self.mana -= 5
        dano = self._ataque * 3
        objetivo.recibir_dano(dano)
        return dano

    def __str__(self):
        return super().__str__() + f" | Mago (mana {self.mana}/{self.mana_maximo})"
