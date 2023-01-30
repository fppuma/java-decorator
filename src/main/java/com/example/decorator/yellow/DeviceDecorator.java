package com.example.decorator.yellow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DeviceDecorator extends Device{
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected Device device;
  
  public DeviceDecorator(Device device) {
    this.device = device;
  }
  
  @Override
  public void assemble() {
    logger.info("class:{}", this.device.getClass().getSimpleName());
    this.device.assemble();
  }

}
