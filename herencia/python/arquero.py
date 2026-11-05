from personaje import Personaje


class Arquero(Personaje):
    """Arquero: restriccion por flechas y habilidad especial (Retos 1-5)."""

    def __init__(self, nombre, nivel, vida_maxima, ataque, flechas, precision):
        super().__init__(nombre, nivel, vida_maxima, ataque)
        self.flechas = flechas
        self.precision = precision

    def atacar(self, objetivo):
        if self.flechas <= 0:
            return 0
        self.flechas -= 1
        dano = self._ataque + self.precision
        objetivo.recibir_dano(dano)
        return dano

    def habilidad_especial(self, objetivo):
        if self.flechas < 3:
            return 0
        self.flechas -= 3
        dano = (self._ataque + self.precision) * 2
        objetivo.recibir_dano(dano)
        return dano

    def __str__(self):
        return super().__str__() + f" | Arquero (flechas {self.flechas}, precision {self.precision})"
