from abc import ABC, abstractmethod

from inventario import Inventario


class Personaje(ABC):
    """Clase base del RPG Manager (Reto 0, 5)."""

    def __init__(self, nombre, nivel, vida_maxima, ataque):
        self._nombre = nombre
        self._nivel = nivel
        self._vida_maxima = vida_maxima
        self._vida = vida_maxima
        self._ataque = ataque
        # Composicion: el personaje crea su inventario (Reto 7)
        self.inventario = Inventario()

    @property
    def nombre(self):
        return self._nombre

    @property
    def nivel(self):
        return self._nivel

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

    @property
    def vida_maxima(self):
        return self._vida_maxima

    @property
    def ataque(self):
        return self._ataque

    def esta_vivo(self):
        return self._vida > 0

    def recibir_dano(self, cantidad):
        self.vida = self._vida - cantidad

    def atacar(self, objetivo):
        objetivo.recibir_dano(self._ataque)
        return self._ataque

    @abstractmethod
    def habilidad_especial(self, objetivo):
        pass

    def __str__(self):
        return f"{self._nombre} (Nv.{self._nivel}) - Vida: {self._vida}/{self._vida_maxima}"
