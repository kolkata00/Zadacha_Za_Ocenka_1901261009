package command;

import main.Board;

public class SantaBicycleWishOperation implements SantaWishOperation{

    private final Board board;

    public SantaBicycleWishOperation(Board board) {
        this.board = board;
    }

    @Override
    public void execute() {
        System.out.println("SantaBicycleWishOperation - writing to board");
        board.write("Bicycle");
    }
}
