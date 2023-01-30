package com.example.decorator.yellow;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorTest {
  
  private static final Logger logger = LoggerFactory.getLogger(DecoratorTest.class);

  @Test
  public void test() {
    Device laptop = new Laptop();
    laptop.assemble();
    logger.info("laptop: {}", laptop.components);
  }

  @Test
  public void testLaptopZoom() {
    Device laptopZoom = new WebCamDecorator(new Laptop());
    laptopZoom.assemble();
    logger.info("laptopZoom: {}", laptopZoom.components);
  }

  @Test
  public void testLaptopMusic() {
    Device laptopMusic = new BluRayDecorator(new Laptop());
    laptopMusic.assemble();
    logger.info("laptopMusic: {}", laptopMusic.components);
  }

  @Test
  public void testLaptopZoomMusic() {
    Device laptopZoomMusic = new BluRayDecorator(new WebCamDecorator(new Laptop()));
    laptopZoomMusic.assemble();
    logger.info("laptopMusic: {}", laptopZoomMusic.components);
  }

}
