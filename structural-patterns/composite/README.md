# Composite

Es un patrón de diseño estructural que permite componer objetos en estructuras de árbol y trabajar con esas estructuras como si fueran objetos individuales.

<p align="center">
  <img src="https://refactoring.guru/images/patterns/content/composite/composite.png" alt="composite pattern" />
</p>

## Aplicabilidad

- **Cuando tengas que implementar una estructura de objetos con forma de árbol.**
    - El patrón Composite te proporciona dos tipos de elementos básicos que comparten una interfaz común: hojas simples y contenedores complejos. Un contenedor puede estar compuesto por hojas y por otros contenedores. Esto te permite construir una estructura de objetos recursivos anidados parecida a un árbol.
- **Cuando quieras que el código cliente trate elementos simples y complejos de la misma forma.**
    - Todos los elementos definidos por el patrón Composite comparten una interfaz común. Utilizando esta interfaz, el cliente no tiene que preocuparse por la clase concreta de los objetos con los que funciona.

## Estructura

<p align="center">
  <a href="https://refactoring.guru/es/design-patterns/composite" target="_blank">
    <img src="https://refactoring.guru/images/patterns/diagrams/composite/structure-es.png" alt="composite structure" />
  </a>
</p>

1. La interfaz **Componente** describe operaciones que son comunes a elementos simples y complejos del árbol.
2. La **Hoja** es un elemento básico de un árbol que no tiene subelementos.

    Normalmente, los componentes de la hoja acaban realizando la mayoría del trabajo real, ya que no tienen a nadie a quien delegarle el trabajo.
3. El **Contenedor** (también llamado *compuesto*) es un elemento que tiene subelementos: hojas u otros contenedores. Un contenedor no conoce las clases concretas de sus hijos. Funciona con todos los subelementos únicamente a través de la interfaz componente.

    Al recibir una solicitud, un contenedor delega el trabajo a sus subelementos, procesa los resultados intermedios y devuelve el resultado final al cliente.
4. El **Cliente** funciona con todos los elementos a través de la interfaz componente. Como resultado, el cliente puede funcionar de la misma manera tanto con elementos simples como complejos del árbol.

## ¿Cómo implementarlo?

1. Asegúrate de que el modelo central de tu aplicación pueda representarse como una estructura de árbol. Intenta dividirlo en elementos simples y contenedores. Recuerda que los contenedores deben ser capaces de contener tanto elementos simples como otros contenedores.
2. Declara la interfaz componente con una lista de métodos que tengan sentido para componentes simples y complejos.
3. Crea una clase hoja para representar elementos simples. Un programa puede tener varias clases hoja diferentes.
4. Crea una clase contenedora para representar elementos complejos. Incluye un campo matriz en esta clase para almacenar referencias a subelementos. La matriz debe poder almacenar hojas y contenedores, así que asegúrate de declararla con el tipo de la interfaz componente.

    Al implementar los métodos de la interfaz componente, recuerda que un contenedor debe delegar la mayor parte del trabajo a los subelementos.
5. Por último, define los métodos para añadir y eliminar elementos hijos dentro del contenedor.

## Beneficios

- Puedes trabajar con estructuras de árbol complejas con mayor comodidad: utiliza el polimorfismo y la recursión en tu favor.
- *Principio de abierto/cerrado*. Puedes introducir nuevos tipos de elemento en la aplicación sin descomponer el código existente, que ahora funciona con el árbol de objetos.