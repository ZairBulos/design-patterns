# Mediator

Es un patrón de diseño de comportamiento que permite reducir las dependencias caóticas entre objetos. El patrón restringe las comunicaciones directas entre los objetos, forzándolos a colaborar únicamente a través de un objeto mediador.

<p align="center">
  <img src="https://refactoring.guru/images/patterns/content/mediator/mediator.png" alt="mediator pattern" />
</p>

## Aplicabilidad

- **Cuando resulte difícil cambiar algunas de las clases porque están fuertemente acopladas a un puñado de otras clases.**
    - El patrón te permite extraer todas las relaciones entre clases dentro de una clase separada, aislando cualquier cambio en un componente específico, del resto de los componentes.
- **Cuando no puedas reutilizar un componente en un programa diferente porque sea demasiado dependiente de otros componentes.**
    - Una vez aplicado el patrón Mediator, los componentes individuales no conocen los otros componentes. Todavía pueden comunicarse entre sí, aunque indirectamente, a través del objeto mediador. Para reutilizar un componente en una aplicación diferente, debes darle una nueva clase mediadora.
- **Cuando te encuentres creando cientos de subclases de componente sólo para reutilizar un comportamiento básico en varios contextos.**
    - Debido a que todas las relaciones entre componentes están contenidas dentro del mediador, resulta fácil definir formas totalmente nuevas de colaboración entre estos componentes introduciendo nuevas clases mediadoras, sin tener que cambiar los propios componentes.

## Estructura

<p align="center">
  <a href="https://refactoring.guru/es/design-patterns/mediator" target="_blank">
    <img src="https://refactoring.guru/images/patterns/diagrams/mediator/structure.png" alt="mediator structure" />
  </a>
</p>

1. Los **Componentes** son varias clases que contienen cierta lógica de negocio. Cada componente tiene una referencia a una interfaz mediadora, declarada con su tipo. El componente no conoce la clase de la interfaz mediadora, por lo que puedes reutilizarlo en otros programas vinculándolo a una mediadora diferente.
2. La interfaz **Mediadora** declara métodos de comunicación con los componentes, que normalmente incluyen un único método de notificación. Los componentes pueden pasar cualquier contexto como argumentos de este método, incluyendo sus propios objetos, pero sólo de tal forma que no haya acoplamiento entre un componente receptor y la clase del emisor.
3. Los **Mediadores Concretos** encapsulan las relaciones entre varios componentes. Los mediadores concretos a menudo mantienen referencias a todos los componentes que gestionan y en ocasiones gestionan incluso su ciclo de vida.

## ¿Cómo implementarlo?

1. Identifica un grupo de clases fuertemente acopladas que se beneficiarían de ser más independientes.
2. Declara la interfaz mediadora y describe el protocolo de comunicación deseado entre mediadores y otros varios componentes. En la mayoría de los casos, un único método para recibir notificaciones de los componentes es suficiente.

    Esta interfaz es fundamental cuando quieras reutilizar las clases del componente en distintos contextos. Siempre y cuando el componente trabaje con su mediador a través de la interfaz genérica, podrás vincular el componente con una implementación diferente del mediador.
3. Implementa la clase concreta mediadora. Esta clase se beneficiará de almacenar referencias a todos los componentes que gestiona.
4. Puedes ir más lejos y hacer la interfaz mediadora responsable de la creación y destrucción de objetos del componente. Tras esto, la mediadora puede parecerse a una fábrica.
5. Los componentes deben almacenar una referencia al objeto mediador. La conexión se establece normalmente en el constructor del componente, donde un objeto mediador se pasa como argumento.
6. Cambia el código de los componentes de forma que invoquen el método de notificación del mediador en lugar de los métodos de otros componentes. Extrae el código que implique llamar a otros componentes dentro de la clase mediadora. Ejecuta este código cuando el mediador reciba notificaciones de ese componente.

## Beneficios

- *Principio de responsabilidad única*. Puedes extraer las comunicaciones entre varios componentes dentro de un único sitio, haciéndolo más fácil de comprender y mantener.
- *Principio de abierto/cerrado*. Puedes introducir nuevos mediadores sin tener que cambiar los propios componentes.
- Puedes reducir el acoplamiento entre varios componentes de un programa.
- Puedes reutilizar componentes individuales con mayor facilidad.
