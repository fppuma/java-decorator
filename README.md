# java-decorator
Decorator Pattern

## Device Class & Decorator
```mermaid
classDiagram
     Device <|-- Laptop
     Device <|-- DeviceDecorator
     Device : #components
     Device : +assemble()
     class Laptop {
         +assemble()
     }
     class DeviceDecorator {
         +assemble()
     }
```