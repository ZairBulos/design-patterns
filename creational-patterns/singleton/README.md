# Singleton

Es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.

<p align="center">
  <img src="https://refactoring.guru/images/patterns/content/singleton/singleton.png" alt="singleton pattern" />
</p>

## Aplicabilidad

- **Cuando una clase de tu programa tan solo deba tener una instancia disponible para todos los clientes; por ejemplo, un único objeto de base de datos compartido por distintas partes del programa.**
  - El patrón Singleton deshabilita el resto de las maneras de crear objetos de una clase, excepto el método especial de creación. Este método crea un nuevo objeto, o bien devuelve uno existente si ya ha sido creado.
- **Cuando necesites un control más estricto de las variables globales.**
  - Al contrario que las variables globales, el patrón Singleton garantiza que haya una única instancia de una clase. A excepción de la propia clase Singleton, nada puede sustituir la instancia en caché.
  - Ten en cuenta que siempre podrás ajustar esta limitación y permitir la creación de cierto número de instancias Singleton. La única parte del código que requiere cambios es el cuerpo del método `getInstance`.

## Estructura

<p align="center">
  <a href="https://refactoring.guru/es/design-patterns/singleton" target="_blank">
    <img src="https://refactoring.guru/images/patterns/diagrams/singleton/structure-es.png" alt="singleton structure" />
  </a>
</p>

1. La clase **Singleton** declara el método estático `getInstance` que devuelve la misma instancia de su propia clase.

    El constructor del Singleton debe ocultarse del código cliente. La llamada al método `getInstance` debe ser la única manera de obtener el objeto de Singleton.

## ¿Cómo implementarlo?

1. Añade un campo estático privado a la clase para almacenar la instancia Singleton.

2. Declara un método de creación estático público para obtener la instancia Singleton.

3. Implementa una inicialización diferida dentro del método estático. Debe crear un nuevo objeto en su primera llamada y colocarlo dentro del campo estático. El método deberá devolver siempre esa instancia en todas las llamadas siguientes.

4. Declara el constructor de clase como privado. El método estático de la clase seguirá siendo capaz de invocar al constructor, pero no a los otros objetos.

5. Repasa el código cliente y sustituye todas las llamadas directas al constructor de la instancia Singleton por llamadas a su método de creación estático.

## Beneficios

- Puedes tener la certeza de que una clase tiene una única instancia.
- Obtienes un punto de acceso global a dicha instancia.
- El objeto Singleton solo se inicializa cuando se requiere por primera vez.