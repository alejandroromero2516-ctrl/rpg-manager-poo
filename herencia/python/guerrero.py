from personaje import Personaje


class Guerrero(Personaje):
    """Guerrero: herencia, sobrescritura y habilidad especial (Retos 1-5)."""

    def __init__(self, nombre, nivel, vida_maxima, ataque, fuerza, armadura):
        super().__init__(nombre, nivel, vida_maxima, ataque)
        self.fuerza = fuerza
        self.armadura = armadura

    def recibir_dano(self, cantidad):
        reducido = max(0, cantidad - self.armadura)
        super().recibir_dano(reducido)
        return reducido

    def atacar(self, objetivo):
        dano = self._ataque + self.fuerza
        objetivo.recibir_dano(dano)
        return dano

    def habilidad_especial(self, objetivo):
        dano = (self._ataque + self.fuerza) * 2
        objetivo.recibir_dano(dano)
        return dano

    def __str__(self):
        return super().__str__() + f" | Guerrero (fuerza {self.fuerza}, armadura {self.armadura})"
