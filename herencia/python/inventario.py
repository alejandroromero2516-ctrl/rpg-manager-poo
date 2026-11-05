from item import Item


class Inventario:
    """Inventario de un personaje (composicion/agregacion, Reto 7)."""

    def __init__(self):
        self.items = []

    def agregar(self, item):
        self.items.append(item)

    def listar(self):
        return list(self.items)

    def usar(self, nombre, personaje):
        for i, item in enumerate(self.items):
            if item.nombre == nombre:
                if item.tipo == "pocion":
                    personaje.vida = personaje.vida + item.valor
                self.items.pop(i)
                return item
        return None

    def __str__(self):
        if not self.items:
            return "vacio"
        return ", ".join(str(item) for item in self.items)
