package module;

public class EnergyConsumption {
    private int value;

    public EnergyConsumption() {
        this.value = 0;
    }

    public EnergyConsumption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int energyConsumption) {
        if (energyConsumption < 0) this.value = 0;
        else this.value = energyConsumption;
    }

    public void increase(int amount) {
        this.value += amount;
    }
}
