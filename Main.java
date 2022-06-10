package main;

import Santa.Santa;

public class Main {
    public static void main(String[] args) {

        Santa santa = Santa.getInstance();
        Board.getInstance().assignDwarfs(
                new Dwarf(), new Dwarf(), new Dwarf());

        System.out.println("==== NEW WISH: PUPPET ====");
        santa.say("Puppet");
        System.out.println("\n\n==== NEW WISH: BICYCLE ====");
        santa.say("Bicycle");

    }
}
