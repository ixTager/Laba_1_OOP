package Station;

import java.util.ArrayList;
import java.util.List;

public class Station {
    int maxCountModules;
    List<Module> modules;

    public Station() {
        this.maxCountModules = 1;
        this.modules = new ArrayList<Module>();
    }

    public Station(int maxCountModules) {
        this.maxCountModules = maxCountModules;
        this.modules = new ArrayList<Module>();
    }

    public Station(Station station) {
        this.maxCountModules = station.maxCountModules;
        this.modules = new ArrayList<>();

        if (station.modules != null) {
            for (Module module : station.modules) {

            }
        }
    }




    public void addModule(Module module) {
        if (modules.size() == maxCountModules) {
            System.out.println("Module already exists!");
            return;
        }
        modules.add(module);
    }

    public void removeModule(int index) {
        if (index < 0 || index >= modules.size()) {
            System.out.println("Invalid index!");
            return;
        }
        modules.remove(index);
    }
}
