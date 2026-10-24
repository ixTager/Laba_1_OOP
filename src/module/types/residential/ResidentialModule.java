package module.types.residential;

import module.Module;

public class ResidentialModule extends Module {
    public ResidentialModule() {
        super(5, "ResidentialModule");
    }

    @Override
    public Module clone() {
        //Todo
        return null;
    }

    @Override
    public String getType() {
        return "ResidentialModule";
    }
}
