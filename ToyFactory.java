package toys;

import java.util.Random;

public class ToyFactory implements AbstractFactory<Toy> {

    private static final ToyFactory instance = new ToyFactory();
    private ToyFactory() {}

    public static ToyFactory getInstance(){
        return instance;
    }

    @Override
    public Toy create(String toyType) {

        Random random = new Random();
        System.out.println("Factory is building: " + toyType);

        if(toyType.equalsIgnoreCase("Puppet"))  {
            int id = random.nextInt(2);
            switch(id) {
                case 0:
                    return new Barbie();
                case 1:
                    return new BorikaPuppet();
            }
        } else if(toyType.equalsIgnoreCase("Bicycle")) {
            int id = random.nextInt(3);
            switch(id) {
                case 0:
                    return new BMX();
                case 1:
                    return new ElectroBicycle();
                case 2:
                    return new ThreeWheeler();
            }
        }
        throw new IllegalArgumentException("Illegal Toy String detected!");
    }

}
