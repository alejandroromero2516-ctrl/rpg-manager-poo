class Monstruo:
    """Monstruo que cumple el contrato Combatiente sin heredar de Personaje (Reto 6)."""

    def __init__(self, nombre, vida, ataque):
        self._nombre = nombre
        self._vida_maxima = vida
        self._vida = vida
        self._ataque = ataque

    @property
    def nombre(self):
        return self._nombre

    @property
    def vida(self):
        return self._vida

    @vida.setter
    def vida(self, valor):
        if valor < 0:
            valor = 0
        if valor > self._vida_maxima:
            valor = self._vida_maxima
        self._vida = valor

    def esta_vivo(self):
        return self._vida > 0

    def recibir_dano(self, cantidad):
        self.vida = self._vida - cantidad

    def atacar(self, objetivo):
        objetivo.recibir_dano(self._ataque)
        return self._ataque

    def __str__(self):
        return f"{self._nombre} - Vida: {self._vida}/{self._vida_maxima}"
