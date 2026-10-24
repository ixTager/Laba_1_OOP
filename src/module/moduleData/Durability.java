package module.moduleData;

public class Durability {
    private int value;
    private int maxDurability;

    public Durability() {
        this.value = 0;
        this.maxDurability = 1;
    }

    public Durability(int durability) {
        if (durability > 0) {
            this.value = durability;
            this.maxDurability = durability;
        }
        else throw new IllegalArgumentException("Durability cannot be negative");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int durability) {
        if (durability > maxDurability) throw new IllegalArgumentException("Durability cannot be greater than maxDurability");
        else if (durability < 0) throw new IllegalArgumentException("Durability cannot be negative");
        this.value = durability;

    }

    public void decrease(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        if ((value - amount) < 0) throw new IllegalArgumentException("Value cannot be negative");
        this.value -= amount;
    }

    public void repair(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        else if ((this.value + amount) > maxDurability) throw new IllegalArgumentException("Max durability exceeded");
        this.value += amount;
    }
}
