class Item:
    """Representa un objeto del inventario (Reto 7)."""

    def __init__(self, nombre, tipo, valor):
        self.nombre = nombre
        self.tipo = tipo
        self.valor = valor

    def __str__(self):
        return f"{self.nombre} ({self.tipo}) - valor {self.valor}"
