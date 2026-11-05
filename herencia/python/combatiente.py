from typing import Protocol


class Combatiente(Protocol):
    """Contrato comun para cualquier combatiente (Reto 6)."""

    def atacar(self, objetivo) -> int:
        ...

    def recibir_dano(self, cantidad) -> None:
        ...

    def esta_vivo(self) -> bool:
        ...
