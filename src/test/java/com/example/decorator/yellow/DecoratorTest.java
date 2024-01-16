package com.example.decorator.yellow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

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
    List<String> expected = List.of("CPU", "MEMORY");
    assertEquals(expected, laptop.components);
  }

  @Test
  public void testLaptopZoom() {
    Device laptopZoom = new WebCamDecorator(new Laptop());
    laptopZoom.assemble();
    logger.info("laptopZoom: {}", laptopZoom.components);
    List<String> expected = List.of("CPU", "MEMORY", "WEB_CAM");
    assertEquals(expected, laptopZoom.components);
  }

  @Test
  public void testLaptopMusic() {
    Device laptopMusic = new BluRayDecorator(new Laptop());
    laptopMusic.assemble();
    logger.info("laptopMusic: {}", laptopMusic.components);
    List<String> expected = List.of("CPU", "MEMORY", "BLU_RAY");
    assertEquals(expected, laptopMusic.components);
    
  }

  @Test
  public void testLaptopZoomMusic() {
    Device laptopZoomMusic = new BluRayDecorator(new WebCamDecorator(new Laptop()));
    laptopZoomMusic.assemble();
    logger.info("laptopMusic: {}", laptopZoomMusic.components);
    List<String> expected = List.of("CPU", "MEMORY", "WEB_CAM", "BLU_RAY");
    assertEquals(expected, laptopZoomMusic.components);
  }

}
