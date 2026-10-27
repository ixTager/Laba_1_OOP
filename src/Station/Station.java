package Station;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import module.Module;

public class Station {
    private final int maxModules;
    private StationIterator stationIterator;
    private List<Module> modules;

    public Station() {
        this.maxModules = 1;
        this.modules = new ArrayList<>();
        this.stationIterator = new StationIterator();
    }

    public Station(int maxCountModules) {
        if (maxCountModules <= 0) {
            throw new IllegalArgumentException("maxCountModules must be greater than 0");
        }
        this.maxModules = maxCountModules;
        this.modules = new ArrayList<>();
        this.stationIterator = new StationIterator();
    }

    public Station(Station station) {
        if (this == station) throw new IllegalArgumentException("Station already exists");

        this.maxModules = station.maxModules;
        this.modules = new ArrayList<>();
        if (station.modules != null) {
            for (Module module : station.modules) {
                this.modules.add(module.clone());
            }
        }
        else this.modules = new ArrayList<>();
        this.stationIterator = new StationIterator();
    }

    public Module findById(int id) {
        for (Module module : modules) {
            if (module.getId() == id) return module;
        }
        return null;
    }

    public void addModule(Module module) {
        if (modules.size() >= maxModules) throw new IllegalArgumentException("Maximum number of modules exceeded");
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
        if (station == null) throw new NullPointerException("Station cannot be null");
        if (this == station) throw new IllegalArgumentException("Cannot transfer from a station to itself");
        else if (modules.size() + station.modules.size() > maxModules) throw new IllegalArgumentException("Max modules exceeded");
        modules.addAll(station.modules);
        station.modules.clear();
    }

    public StationIterator getIterator() {
        return new StationIterator();
    }

    public void sortByEfficiency() {
        List<Module> newSortedModules = new ArrayList<>();
        Iterator<Module> iterator = modules.iterator();
        while (iterator.hasNext()) {
            newSortedModules.add(iterator.next());
        }
        newSortedModules.sort(Comparator.comparing(m -> m.getEfficiency()));
        this.modules = newSortedModules;
    }
}
