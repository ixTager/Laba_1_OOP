package module.moduleData;

public class Capacity {
    private int value;

    public Capacity() {
        this.value = 0;
    }

    public Capacity(int capacity) {
        if (capacity >= 0) this.value = capacity;
        else throw new IllegalArgumentException("Capacity must be a positive integer");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int capacity) {
        if (capacity >= 0) this.value = capacity;
        else throw new IllegalArgumentException("Capacity must be a positive integer");
    }
}
