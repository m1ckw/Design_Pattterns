# Design Pattterns
In software engineering, a design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. 
It's not a finished design that can be transformed directly into code, but a description or template for how to solve a problem that can be used in many different situations.

Design patterns can speed up the development process by providing tested, proven development paradigms. 
They make the code more robust, flexible, and easier to maintain by standardizing the development process. 
There's also another category called concurrency patterns that deals with multi-threaded programming paradigms.

Design patterns can be complex or simple, depending on the problem they're trying to solve, but the main idea is to provide a template for solving certain types of problems. 
Learning about design patterns can help developers write more efficient and effective code.

# 23 Classic Design Patterns 
Design Patterns as defined by [GoF (Gang of Four)](https://en.wikipedia.org/wiki/Design_Patterns) are broken into three categories, Creational, Structural, and Behavioural.

## Creational Patterns
	1. Singleton: Ensures a class has only one instance and provides a global point of access to it.
	2. Prototype: Creates new objects by cloning an existing object.
	3. Factory Method: Defines an interface for creating an object but lets subclasses decide which class to instantiate.
	4. Abstract Factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
	5. Builder: Separates the construction of a complex object from its representation so that the same construction process can create different representations.

## Structural Patterns
	6. Adapter: Allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class.
	7. Bridge: Decouples an abstraction from its implementation so that the two can vary independently.
	8. Composite: Composes objects into tree structures to represent part-whole hierarchies.
	9. Decorator: Dynamically adds/overrides behaviour in an existing method of an object.
	10. Facade: Provides a simplified interface to a larger body of code.
	11. Flyweight: Reduces the cost of creating and manipulating a large number of similar objects.
	12. Proxy: Provides a placeholder for another object to control access, reduce cost, and reduce complexity.

## Behavioural Patterns
	13. Chain of Responsibility: Delegates commands to a chain of processing objects.
	14. Command: Encapsulates a command request as an object.
	15. Interpreter: Implements a specialized language.
	16. Iterator: Accesses the elements of an object sequentially without exposing its underlying representation.
	17. Mediator: Allows loose coupling by encapsulating the way disparate sets of objects interact and communicate with each other.
	18. Memento: Provides the ability to restore an object to its previous state.
	19. Observer: Defines a dependency between objects so that whenever an object changes its state, all its dependents are notified.
	20. State: Allows an object to alter its behaviour when its internal state changes.
	21. Strategy: Allows one of a family of algorithms to be selected on-the-fly at runtime.
	22. Template Method: Defines the program skeleton of an algorithm in an operation, deferring some steps to subclasses.
	23. Visitor: This lets you define a new operation without changing the classes of the elements on which it operates.

## Resources 
Design Patterns - [Elements of Reusable Object-Oriented Software by "Gang of Four" (GoF)](https://en.wikipedia.org/wiki/Design_Patterns), which included Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides.
