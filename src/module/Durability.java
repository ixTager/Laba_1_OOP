package module;

public class Durability {
    private int value;

    public Durability() {
        this.value = 0;
    }

    public Durability(int durability) {
        this.value = durability;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int durability) {
        this.value = durability;
    }

    public void decrease(int amount) {
        this.value -= amount;
    }

    public void repair(int amount) {
        this.value += amount;
    }

}
