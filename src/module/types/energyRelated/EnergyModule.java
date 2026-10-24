package module.types.energyRelated;

import module.Module;

public class EnergyModule extends Module {

    public EnergyModule() {
        super(2, "EnergyModule");
    }

    @Override
    public Module clone() {
        //Todo
        return null;
    }

    @Override
    public String getType() {
        return "EnergyModule";
    }
}
