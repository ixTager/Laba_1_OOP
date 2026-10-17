package module;

public class EnergyConsumption {
    private int energyConsumption;

    public EnergyConsumption() {
        this.energyConsumption = 0;
    }

    public EnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }



    public int getValue() {
        return energyConsumption;
    }

    public void setValue(int energyConsumption) {
        if (energyConsumption < 0) this.energyConsumption = 0;
        else this.energyConsumption = energyConsumption;
    }

    public void increase(int amount) {
        this.energyConsumption += amount;
    }

}
