# java-decorator
Decorator Pattern

## Person Class & Builder
```mermaid
classDiagram
     Laptop <|-- Device
     Laptop : +assemble()
     class Device {
         -List components
         +assemble()
     }
```