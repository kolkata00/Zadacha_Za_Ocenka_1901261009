package command;

import java.util.ArrayList;
import java.util.List;

public class SantaWishExecutor {

    private final List<SantaWishOperation> santaWishOperations = new ArrayList<>();

    public void executeOperation(SantaWishOperation santaWishOperation) {
        System.out.println("Santa Wish executor executes operation: " + santaWishOperation.getClass().getSimpleName());
        santaWishOperations.add(santaWishOperation);
        santaWishOperation.execute();
    }

}
