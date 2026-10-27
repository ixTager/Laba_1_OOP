package module.types.residential;

import module.Module;

public class ResidentialModule extends Module {
    public ResidentialModule() {
        super(5, "ResidentialModule");
    }


    public ResidentialModule(Module module) {
        super(module);
    }
    @Override
    public Module clone() {
        return new ResidentialModule(this);
    }

    @Override
    public String getType() {
        return "ResidentialModule";
    }
}
