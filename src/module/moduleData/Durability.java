package module.moduleData;

public class Durability {
    private int value;

    public Durability() {
        this.value = 0;
    }

    public Durability(int durability) {
        if (durability > 0) this.value = durability;
        else this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int durability) {
        if (durability > 0) this.value = durability;
    }

    public void decrease(int amount) {
        this.value -= amount;
    }

    public void repair(int amount) {
        this.value += amount;
    }

}
