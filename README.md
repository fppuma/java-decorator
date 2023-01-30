# java-decorator
Decorator Pattern

## Person Class & Builder
```mermaid
classDiagram
     Device <|-- Laptop
     Device : #components
     Device : +assemble()
     class Laptop {
         +assemble()
     }
```