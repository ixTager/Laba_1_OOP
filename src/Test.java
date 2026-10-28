import module.Module;
import module.fabric.StandardModuleFactory;
import station.Station;
import module.fabric.AdvancedModuleFactory;
import module.fabric.ModuleFactory;
import station.StationIterator;

class Test {
    public void firstScript() {
        Station station = new Station(5);
        ModuleFactory moduleFactory_1 = new StandardModuleFactory();
        ModuleFactory moduleFactory_2 = new AdvancedModuleFactory();
        station.addModule(moduleFactory_1.createEnergyModule());
        station.addModule(moduleFactory_2.createResearchModule());

        StationIterator stationIterator = station.getIterator();
        while (stationIterator.hasNext()) {
            Module module = stationIterator.next();
            System.out.println(module);
        }
    }

    public void secondScript() {
        Station station_1 = new Station(5);
        ModuleFactory moduleFactory_1 = new StandardModuleFactory();
        ModuleFactory moduleFactory_2 = new AdvancedModuleFactory();
        station_1.addModule(moduleFactory_1.createEnergyModule());
        station_1.addModule(moduleFactory_2.createResearchModule());
        Station station_2 = new Station(station_1);
        station_2.addModule(moduleFactory_2.createResearchModule());

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.firstScript();
        test.secondScript();
    }


}
