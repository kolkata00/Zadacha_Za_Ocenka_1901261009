package main;

import toys.Toy;
import toys.ToyFactory;

public class Dwarf {
    public Toy deliverToy(String toy) {
        System.out.println("Dwarf will deliver: " + toy);
        Toy generatedToy = ToyFactory.getInstance().create(toy);
        System.out.println("Dwarf is bringing back: " + generatedToy.getName());
        return generatedToy;
    }
}
