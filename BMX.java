package toys;

public class BMX extends Bicycle {

    public BMX() {
        super(35, 2);
    }

    @Override
    public String getName() {
        return "BMX";
    }
}
