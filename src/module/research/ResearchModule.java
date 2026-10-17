package module.research;

import module.Module;

public class ResearchModule implements Module {
    private int efficiency = 0;

    @Override
    public int getEfficiency() {
        return efficiency;
    }

    @Override
    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
}
