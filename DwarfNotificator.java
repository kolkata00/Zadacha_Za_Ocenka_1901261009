package observer;

import main.Dwarf;

import java.util.ArrayList;
import java.util.List;

public class DwarfNotificator {
    private final List<Dwarf> dwarfs;

    public DwarfNotificator() {
        this.dwarfs = new ArrayList<>();
    }

    public void subscribe(Dwarf dwarf) {
        dwarfs.add(dwarf);
    }

    public void unsubscribe(Dwarf dwarf) {
        dwarfs.remove(dwarf);
    }

    public void notifyDwarf(String wishedToy) {
        System.out.println("Notifying the dwarfs to build: " + wishedToy);
        dwarfs.forEach(dwarf -> dwarf.deliverToy(wishedToy));
    }


}
