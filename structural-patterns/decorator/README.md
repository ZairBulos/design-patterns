# Decorator

Es un patrón de diseño estructural que permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.

<p align="center">
  <img src="https://refactoring.guru/images/patterns/content/decorator/decorator.png" alt="decorator pattern" />
</p>

## Aplicabilidad

- **Cuando necesites asignar funcionalidades adicionales a objetos durante el tiempo de ejecución sin descomponer el código que utiliza esos objetos.**
    - El patrón Decorator te permite estructurar tu lógica de negocio en capas, crear un decorador para cada capa y componer objetos con varias combinaciones de esta lógica, durante el tiempo de ejecución. El código cliente puede tratar a todos estos objetos de la misma forma, ya que todos siguen una interfaz común.
- **Cuando resulte extraño o no sea posible extender el comportamiento de un objeto utilizando la herencia.**
    - Muchos lenguajes de programación cuentan con la palabra clave `final` que puede utilizarse para evitar que una clase siga extendiéndose. Para una clase final, la única forma de reutilizar el comportamiento existente será envolver la clase con tu propio wrapper, utilizando el patrón Decorator.

## Estructura

<p align="center">
  <a href="https://refactoring.guru/es/design-patterns/decorator" target="_blank">
    <img src="https://refactoring.guru/images/patterns/diagrams/decorator/structure.png" alt="decorator structure" />
  </a>
</p>

1. El **Componente** declara la interfaz común tanto para wrappers como para objetos envueltos.
2. **Componente Concreto** es una clase de objetos envueltos. Define el comportamiento básico, que los decoradores pueden alterar.
3. La clase **Decoradora Base** tiene un campo para referenciar un objeto envuelto. El tipo del campo debe declararse como la interfaz del componente para que pueda contener tanto los componentes concretos como los decoradores. La clase decoradora base delega todas las operaciones al objeto envuelto.
4. Los **Decoradores Concretos** definen funcionalidades adicionales que se pueden añadir dinámicamente a los componentes. Los decoradores concretos sobrescriben métodos de la clase decoradora base y ejecutan su comportamiento, ya sea antes o después de invocar al método padre.
5. El **Cliente** puede envolver componentes en varias capas de decoradores, siempre y cuando trabajen con todos los objetos a través de la interfaz del componente.

## ¿Cómo implementarlo?

1. Asegúrate de que tu dominio de negocio puede representarse como un componente primario con varias capas opcionales encima.
2. Decide qué métodos son comunes al componente primario y las capas opcionales. Crea una interfaz de componente y declara esos métodos en ella.
3. Crea una clase concreta de componente y define en ella el comportamiento base.
4. Crea una clase base decoradora. Debe tener un campo para almacenar una referencia a un objeto envuelto. El campo debe declararse con el tipo de interfaz de componente para permitir la vinculación a componentes concretos, así como a decoradores. La clase decoradora base debe delegar todas las operaciones al objeto envuelto.
5. Asegúrate de que todas las clases implementan la interfaz de componente.
6. Crea decoradores concretos extendiéndolos a partir de la decoradora base. Un decorador concreto debe ejecutar su comportamiento antes o después de la llamada al método padre (que siempre delega al objeto envuelto).
7. El código cliente debe ser responsable de crear decoradores y componerlos del modo que el cliente necesite.

## Beneficios

- Puedes extender el comportamiento de un objeto sin crear una nueva subclase.
- Puedes añadir o eliminar responsabilidades de un objeto durante el tiempo de ejecución.
- Puedes combinar varios comportamientos envolviendo un objeto con varios decoradores.
- *Principio de responsabilidad única*. Puedes dividir una clase monolítica que implementa muchas variantes posibles de comportamiento, en varias clases más pequeñas.