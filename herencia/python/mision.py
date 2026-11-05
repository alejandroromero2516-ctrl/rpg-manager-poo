class Mision:
    """Mision que asocia combatientes (Reto 7)."""

    def __init__(self, nombre):
        self.nombre = nombre
        self.combatientes = []

    def agregar(self, combatiente):
        self.combatientes.append(combatiente)

    def iniciar(self):
        print(f"Mision: {self.nombre}")
        for combatiente in self.combatientes:
            print(" -", combatiente)
