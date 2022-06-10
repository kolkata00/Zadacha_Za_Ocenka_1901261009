package main;

import observer.DwarfNotificator;

public class Board {

    private static DwarfNotificator dwarfNotificator;
    private static final Board instance = new Board();
    private String wishedToy;

    private Board() {
        dwarfNotificator = new DwarfNotificator();
    }

    public static Board getInstance(){
        return instance;
    }

    public void write(String wishedToy) {
        System.out.println("Wish on board updated: " + wishedToy);
        this.wishedToy = wishedToy;
        dwarfNotificator.notifyDwarf(wishedToy);
    }

    public void assignDwarfs(Dwarf ...dwarves) {
        for(Dwarf dwarf : dwarves)
            dwarfNotificator.subscribe(dwarf);
    }

}
