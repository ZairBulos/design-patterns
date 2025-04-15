# Patrones de Comportamiento

Los patrones de comportamiento tratan con algoritmos y la asignación de responsabilidades entre objetos.

- **Template Method**: Define el esqueleto de un algoritmo en la superclase pero permite que las subclases sobrescriban pasos del algoritmo sin cambiar su estructura.
- **State**: Permite a un objeto alterar su comportamiento cuando su estado interno cambia. Parece como si el objeto cambiara su clase.
- **Command**: Convierte una solicitud en un objeto independiente que contiene toda la información sobre la solicitud.
- **Strategy**: Permite definir una familia de algoritmos, colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.
- **Iterator**: Permite recorrer elementos de una colección sin exponer su representación subyacente.
- **Observer**: Permite definir un mecanismo de suscripción para notificar a varios objetos sobre cualquier evento que le suceda al objeto que están observando.
- **Meditator**: Permite reducir las dependencias caóticas entre objetos. El patrón restringe las comunicaciones directas entre los objetos, forzándolos a colaborar únicamente a través de un objeto mediador.
- **Chain of Responsability**: Permite pasar solicitudes a lo largo de una cadena de manejadores.
- **Memento**: Permite guardar y restaurar el estado previo de un objeto sin revelar los detalles de su implementación.
- **Visitor**: Permite separar algoritmos de los objetos sobre los que operan.
