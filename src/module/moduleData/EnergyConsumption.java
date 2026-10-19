package module.moduleData;

public class EnergyConsumption {
    private int value;

    public EnergyConsumption() {
        this.value = 0;
    }

    public EnergyConsumption(int value) {
        if (value > 0) this.value = value;
        else this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int energyConsumption) {
        if (energyConsumption > 0) this.value = energyConsumption;
        else this.value = 0;
    }

    public void increase(int amount) {
        this.value += amount;
    }

    public void decrease(int amount) {
        this.value -= amount;
    }
}
