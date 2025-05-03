# Creational Design Patterns


## Factory
***Defines an interface for creating an object, but let subclasses decide which class to instantiate.***

1. The main idea is to defer the logic of instantiation to subclasses.
2. This helps in hiding the logic behind creation of object from the client.

![Factory UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Factory.jpg?raw=true)


## Abstract Factory
***Helps in creating families of related objects without specifying the concrete classes.***

![Abstract Factory UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Abstract%20Factory.jpg?raw=true)


## Builder
***Helps to construct complex objects step by step.***

1. Selectively set fields of an object while instantiation.
2. Reduces need for multiple constructors based on number of fields.

![Builder UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Builder.jpg?raw=true)


# Behavioural Design Patterns


## Strategy
***Defines family or classes (Strategies) of algorithms and encapsulates their behaviour.***

1. Provides modularity and reusability of specific behaviours to be used by client.
2. Enables client to switch between required strategies at runtime.

![Strategy UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Strategy.jpg?raw=true)


## Observer
***Defines a one-to-many dependency between objects and notifies the dependents (Observers) about any state change.***

![Observer UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Observer.jpg?raw=true)


## Chain Of Responsibility
***Allows to pass a request along a chain of handlers. Each handler decides either to process request or to pass it along.***

1. Provides loose coupling, as handler in chain decide themselves who will process the request.
2. Client doesn't need to know exact request types and their sequences.

![Chain Of Responsibility UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Chain%20Of%20Responsibility.jpg?raw=true)


# Structural Design Patterns


## Adapter
***Provides an additional interface for allowing incompatible interfaces to work together.***

![Adapter UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Adapter.jpg?raw=true)


## Decorator
***Allows to add functionality to an object dynamically without changing behaviour of other objects.***

![Decorator UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Decorator.jpg?raw=true)


## Composite
***Lets client compose objects into tree-like structures to represent part-whole hierarchies.***

1. Client can treat individual objects and compositions uniformly.
2. Use when multiple objects are being used in a same way, then client doesn't have to worry about concrete class.

![Composite UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Composite.jpg?raw=true)


## Proxy
***Provides controlled access to a functionality.***

![Proxy UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Proxy.jpg?raw=true)


## Facade
*** Provides a simplified interface to a complex set of classes, library and framework. ***

![Facade UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Facade.jpg?raw=true)
