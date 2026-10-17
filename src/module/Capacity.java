package module;

public class Capacity {
    private int capacity;

    public Capacity() {
        this.capacity = 0;
    }

    public Capacity(int capacity) {
        this.capacity = capacity;
    }


    public int getValue() {
        return capacity;
    }
    private void setValue(int capacity) {
        if (capacity < 0) {
            this.capacity = 0;
        }
        else this.capacity = capacity;
    }
}
