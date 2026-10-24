package module.moduleData;

public class EnergyConsumption {
    private int value;

    public EnergyConsumption() {
        this.value = 0;
    }

    public EnergyConsumption(int value) {
        if (value >= 0) this.value = value;
        else throw new IllegalArgumentException("Value cannot be negative");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int energyConsumption) {
        if (energyConsumption >= 0) this.value = energyConsumption;
        else throw new IllegalArgumentException("EnergyConsumption cannot be negative");
    }

    public void increase(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        this.value += amount;
    }

    public void decrease(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        if ((value - amount) < 0) throw new IllegalArgumentException("Value cannot be negative");
        this.value -= amount;
    }
}
