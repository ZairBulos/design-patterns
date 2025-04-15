# Chain of Responsability

Es un patrón de diseño de comportamiento que permite pasar solicitudes a lo largo de una cadena de manejadores. Al recibir una solicitud, cada manejador decide si la procesa o si la pasa al siguiente manejador de la cadena.

<p align="center">
  <img src="https://refactoring.guru/images/patterns/content/chain-of-responsibility/chain-of-responsibility.png" alt="chain of responsability pattern" />
</p>

## Aplicabilidad

- **Cuando tu programa deba procesar distintos tipos de solicitudes de varias maneras, pero los tipos exactos de solicitudes y sus secuencias no se conozcan de antemano.**
    - El patrón te permite encadenar varios manejadores y, al recibir una solicitud, “preguntar” a cada manejador si puede procesarla. De esta forma todos los manejadores tienen la oportunidad de procesar la solicitud.
- **Cuando sea fundamental ejecutar varios manejadores en un orden específico.**
    - Ya que puedes vincular los manejadores de la cadena en cualquier orden, todas las solicitudes recorrerán la cadena exactamente como planees.
- **Cuando el grupo de manejadores y su orden deban cambiar durante el tiempo de ejecución.**
    - Si aportas modificadores (*setters*) para un campo de referencia dentro de las clases manejadoras, podrás insertar, eliminar o reordenar los manejadores dinámicamente.

## Estructura

<p align="center">
  <a href="https://refactoring.guru/es/design-patterns/chain-of-responsibility" target="_blank">
    <img src="https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/structure.png" alt="chain of responsability structure" />
  </a>
</p>

1. La clase **Manejadora** declara la interfaz común a todos los manejadores concretos. Normalmente contiene un único método para manejar solicitudes, pero en ocasiones también puede contar con otro método para establecer el siguiente manejador de la cadena.
2. La clase **Manejadora Base** es opcional y es donde puedes colocar el código boilerplate (segmentos de código que suelen no alterarse) común para todas las clases manejadoras.

    Normalmente, esta clase define un campo para almacenar una referencia al siguiente manejador. Los clientes pueden crear una cadena pasando un manejador al constructor o modificador (*setter*) del manejador previo. La clase también puede implementar el comportamiento de gestión por defecto: puede pasar la ejecución al siguiente manejador después de comprobar su existencia.
3. Los **Manejadores Concretos** contienen el código para procesar las solicitudes. Al recibir una solicitud, cada manejador debe decidir si procesarla y, además, si la pasa a lo largo de la cadena.

    Habitualmente los manejadores son autónomos e inmutables, y aceptan toda la información necesaria únicamente a través del constructor.
4. El **Cliente** puede componer cadenas una sola vez o componerlas dinámicamente, dependiendo de la lógica de la aplicación. Observa que se puede enviar una solicitud a cualquier manejador de la cadena; no tiene por qué ser al primero.

## ¿Cómo implementarlo?

1. Declara la interfaz manejadora y describe la firma de un método para manejar solicitudes.

    Decide cómo pasará el cliente la información de la solicitud dentro del método. La forma más flexible consiste en convertir la solicitud en un objeto y pasarlo al método de gestión como argumento.
2. Para eliminar código boilerplate duplicado en manejadores concretos, puede merecer la pena crear una clase manejadora abstracta base, derivada de la interfaz manejadora.

    Esta clase debe tener un campo para almacenar una referencia al siguiente manejador de la cadena. Considera hacer la clase inmutable. No obstante, si planeas modificar las cadenas durante el tiempo de ejecución, deberás definir un modificador (*setter*) para alterar el valor del campo de referencia.

    También puedes implementar el comportamiento por defecto conveniente para el método de control, que consiste en reenviar la solicitud al siguiente objeto, a no ser que no quede ninguno. Los manejadores concretos podrán utilizar este comportamiento invocando al método padre.
3. Una a una, crea subclases manejadoras concretas e implementa los métodos de control. Cada manejador debe tomar dos decisiones cuando recibe una solicitud:
    - Si procesa la solicitud.
    - Si pasa la solicitud al siguiente eslabón de la cadena.
4. El cliente puede ensamblar cadenas por su cuenta o recibir cadenas prefabricadas de otros objetos. En el último caso, debes implementar algunas clases fábrica para crear cadenas de acuerdo con los ajustes de configuración o de entorno.
5. El cliente puede activar cualquier manejador de la cadena, no solo el primero. La solicitud se pasará a lo largo de la cadena hasta que algún manejador se rehúse a pasarlo o hasta que llegue al final de la cadena.
6. Debido a la naturaleza dinámica de la cadena, el cliente debe estar listo para gestionar los siguientes escenarios:
    - La cadena puede consistir en un único vínculo.
    - Algunas solicitudes pueden no llegar al final de la cadena.
    - Otras pueden llegar hasta el final de la cadena sin ser gestionadas.

## Beneficios

- Puedes controlar el orden de control de solicitudes.
- *Principio de responsabilidad única*. Puedes desacoplar las clases que invoquen operaciones de las que realicen operaciones.
- *Principio de abierto/cerrado*. Puedes introducir nuevos manejadores en la aplicación sin descomponer el código cliente existente.