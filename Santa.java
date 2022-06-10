package Santa;

import command.SantaBicycleWishOperation;
import command.SantaPuppetWishOperation;
import command.SantaWishExecutor;
import main.Board;

public class Santa {

    private static final Santa instance = new Santa();
    private static final SantaWishExecutor santaWishExecutor =
            new SantaWishExecutor();


    private Santa() { }

    public static Santa getInstance(){
        return instance;
    }

    public void say(String word) {
        if(word.equalsIgnoreCase("Puppet"))
            santaWishExecutor.executeOperation(new SantaPuppetWishOperation(Board.getInstance()));
        else if(word.equalsIgnoreCase("Bicycle"))
            santaWishExecutor.executeOperation(new SantaBicycleWishOperation(Board.getInstance()));
        else throw new IllegalArgumentException("Santa said illegal word!");
    }
}
