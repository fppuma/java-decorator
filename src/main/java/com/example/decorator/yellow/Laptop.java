package com.example.decorator.yellow;

import java.util.ArrayList;

public class Laptop extends Device{

    @Override
    public void assemble() {
      this.components = new ArrayList<>();
      components.add("CPU");
      components.add("MEMORY");
    }
    
}
