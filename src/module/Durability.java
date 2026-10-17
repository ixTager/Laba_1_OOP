package module;

public class Durability {
    private int durability;

    public Durability() {
        this.durability = 0;
    }

    public Durability(int durability) {
        this.durability = durability;
    }



    public int getValue() {
        return durability;
    }

    public void setValue(int durability) {
        this.durability = durability;
    }

    public void decrease(int amount) {
        this.durability -= amount;
    }

    // Не уверен
    public void repair(int amount) {
        this.durability += amount;
    }

}
