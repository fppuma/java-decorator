package com.example.decorator.yellow;

public class BluRayDecorator extends DeviceDecorator{

  public BluRayDecorator(Device device) {
    super(device);
  }

  @Override
  public void assemble() {
    super.assemble();
    this.components = device.components;
    this.components.add("BLU_RAY");
  }
}
