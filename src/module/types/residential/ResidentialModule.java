package module.types.residential;

import module.Module;

public class ResidentialModule extends Module {
    public ResidentialModule() {
        super("ResidentialModule", 5);
    }

    @Override
    public void clone(Module module) {};

    @Override
    public String getType() {
        return "ResidentialModule";
    }
}
