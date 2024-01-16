# java-decorator
Decorator Pattern

## Device Class & Decorator
```mermaid
classDiagram
  Device <|-- Laptop
  Device <|-- DeviceDecorator
  DeviceDecorator <|-- WebCamDecorator
  DeviceDecorator <|-- BluRayDecorator
  Device : #components
  Device : +assemble()
  class Laptop {
    +assemble()
  }
  class DeviceDecorator {
    #device
    +assemble()
  }
  class WebCamDecorator {
    +assemble()
  }
  class BluRayDecorator {
    +assemble()
  }
```

## Tests
See test to have more details of this patterns.
[Here](src/test/java/com/example/decorator/yellow/DecoratorTest.java)