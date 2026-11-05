# Reflexion conceptual - RPG Manager

En este proyecto aplicamos los principales conceptos de Programacion Orientada a Objetos:

- **Encapsulamiento:** los atributos de `Personaje` se protegen y se accede a ellos mediante propiedades y metodos con validacion.
- **Herencia:** `Guerrero`, `Mago` y `Arquero` reutilizan la clase base `Personaje` y agregan comportamiento propio.
- **Polimorfismo:** el metodo `atacar()` se redefine en cada subclase, por lo que un mismo mensaje produce comportamientos distintos.
- **Sobrecarga:** en Java se implementa con firmas diferentes; en Python se simula con parametros opcionales.
- **Abstraccion:** `Personaje` se convierte en clase abstracta y obliga a implementar `habilidad_especial()` en cada subclase.
- **Interfaces/Protocolos:** `Combatiente` permite que `Monstruo` participe en combates sin heredar de `Personaje`.
- **Composicion, agregacion y asociacion:** `Inventario` forma parte de `Personaje`, los `Item` se guardan en el inventario y las `Mision` asocian combatientes.
- **Integracion:** `ArenaCombate` trabaja con cualquier `Combatiente`, demostrando el desacoplamiento del diseno.

El proyecto compila y ejecuta correctamente en Python y Java, cumpliendo los entregables de la ruta de retos.
