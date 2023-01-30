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