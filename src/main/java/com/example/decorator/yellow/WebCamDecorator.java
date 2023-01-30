package com.example.decorator.yellow;

public class WebCamDecorator extends DeviceDecorator{

    public WebCamDecorator(Device device) {
      super(device);
    }

    @Override
    public void assemble() {
      super.assemble();
      this.components = device.components;
      this.components.add("WEB_CAM");
    }
    
}
