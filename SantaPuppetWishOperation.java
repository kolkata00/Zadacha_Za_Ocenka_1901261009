package command;

import main.Board;

public class SantaPuppetWishOperation implements SantaWishOperation {

    private final Board board;

    public SantaPuppetWishOperation(Board board) {
        this.board = board;
    }

    @Override
    public void execute() {
        System.out.println("SantaPuppetWishOperation - writing to board");
        board.write("Puppet");
    }
}
