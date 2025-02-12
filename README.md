# Creational Design Patterns


## Factory
***Defines an interface for creating an object, but let subclasses decide which class to instantiate.***

1. The main idea is to defer the logic of instantiation to subclasses.
2. This helps in hiding the logic behind creation of object from the client.

-- Add UML diagrams --


## Abstract Factory
***Helps in creating families of related objects without specifying the concrete classes.***

-- Add UML diagrams --


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


# Structural Design Patterns

## Adapter
***Provides an additional interface for allowing incompatible interfaces to work together.***

![Adapter UML](https://github.com/rishabmamgai/LLD/blob/master/umls/Adapter.jpg?raw=true)
