package Station;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import module.Module;

public class Station {
    int maxModules;
    List<Module> modules;

    public Station() {
        this.maxModules = 1;
        this.modules = new ArrayList<>(1);
    }

    public Station(int maxCountModules) {
        this.maxModules = maxCountModules;
        this.modules = new ArrayList<>(maxCountModules);
    }

    public Station(Station station) {
        this.maxModules = station.maxModules;
        if (station.modules != null) this.modules = new ArrayList<>(station.modules);
        else this.modules = new ArrayList<>();
    }

    public Module findById(int id) {
        for (Module module : modules) {
            if (module.getId() == id) return module;
        }
        return null;
    }

    public void addModule(Module module) {
        if (modules.size() == maxModules) {
            System.out.println("Max modules exceeded");
            return;
        }
        modules.add(module);
    }

    public void removeByIndex(int index) {
        if (index < 0 || index >= modules.size()) {
            System.out.println("Invalid index!");
            return;
        }
        modules.remove(index);
    }

    public void removeById(int id) {
        Module foundedModule = findById(id);
        if (foundedModule != null) {
            modules.remove(foundedModule);
        }
    }

    public void transferFrom(Station station) {
        modules.addAll(station.modules);
        station.modules.clear();
    }

    public Iterator<Module> getIterator() {
        return modules.iterator();
    }
}
