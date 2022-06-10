package toys;

public class Puppet implements Toy {

    String hairColor;

    protected Puppet(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String getName() {
        return "Puppet";
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
