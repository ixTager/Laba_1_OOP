import station.Station;
import module.Module;
import module.ModuleState;
import module.fabric.AdvancedModuleFactory;
import module.fabric.ModuleFactory;
import module.fabric.StandardModuleFactory;

public class Test {

    // Сценарий 1
    public void firstScript() {
        System.out.println("\n===== Сценарий 1 =====");

        Station station = new Station(6);

        ModuleFactory standardFactory = new StandardModuleFactory();
        ModuleFactory advancedFactory = new AdvancedModuleFactory();

        station.addModule(standardFactory.createResidentialModule());
        station.addModule(standardFactory.createEnergyModule());
        station.addModule(standardFactory.createResearchModule());

        station.addModule(advancedFactory.createResidentialModule());
        station.addModule(advancedFactory.createEnergyModule());
        station.addModule(advancedFactory.createResearchModule());

        System.out.println("Модули станции:");

        var iterator = station.getIterator();

        while (iterator.hasNext()) {
            Module module = iterator.next();

            System.out.println(
                    "ID: " + module.getId()
                            + ", тип: " + module.getType()
                            + ", эффективность: " + module.getEfficiency()
                            + ", состояние: " + module.getState()
            );
        }
    }

    // Сценарий 2
    public void secondScript() {
        System.out.println("\n===== Сценарий 2 =====");

        Station original = new Station(5);

        ModuleFactory factory = new StandardModuleFactory();

        original.addModule(factory.createEnergyModule());
        original.addModule(factory.createResearchModule());

        Station copy = new Station(original);

        Module originalModule = original.getIterator().next();
        Module copiedModule = copy.getIterator().next();

        System.out.println("Оригинал и копия — разные объекты: "
                + (originalModule != copiedModule));

        copiedModule.deactivate();

        System.out.println("Состояние модуля оригинала: "
                + originalModule.getState());
        System.out.println("Состояние модуля копии: "
                + copiedModule.getState());
    }

    // Сценарий 3
    public void thirdScript() {
        System.out.println("\n===== Сценарий 3 =====");

        Station source = new Station(5);
        Station destination = new Station(5);

        ModuleFactory factory = new StandardModuleFactory();

        source.addModule(factory.createEnergyModule());
        source.addModule(factory.createResearchModule());

        Module moduleBeforeTransfer = source.getIterator().next();

        destination.transferFrom(source);

        Module moduleAfterTransfer = destination.getIterator().next();

        System.out.println("Объект модуля сохранён: " + (moduleBeforeTransfer == moduleAfterTransfer));
    }

    // Сценарий 4
    public void fourthScript() {
        System.out.println("\n===== Сценарий 4 =====");
        Station station = new Station(5);

        ModuleFactory standardFactory = new StandardModuleFactory();
        ModuleFactory advancedFactory = new AdvancedModuleFactory();

        station.addModule(standardFactory.createEnergyModule());
        station.addModule(advancedFactory.createEnergyModule());
        station.addModule(standardFactory.createResearchModule());

        System.out.println("Исходный список:");
        printModules(station);

        Module module = station.getIterator().next();

        module.activate();
        System.out.println("После активации: " + module.getState());

        module.deactivate();
        System.out.println("После деактивации: " + module.getState());

        module.setState(ModuleState.REPAIR);
        System.out.println("После смены состояния: " + module.getState());

        station.sortByEfficiency();

        System.out.println("После сортировки по эффективности:");
        printModules(station);
    }

    // Сценарий 5
    public void fifthScript() {
        System.out.println("\n===== Сценарий 5 =====");
        Station station = new Station(2);

        ModuleFactory factory = new StandardModuleFactory();

        Module first = factory.createEnergyModule();
        Module second = factory.createResearchModule();

        station.addModule(first);
        station.addModule(second);

        station.removeById(first.getId());

        station.removeByIndex(0);

        try {
            station.addModule(factory.createEnergyModule());
            station.addModule(factory.createResearchModule());
            station.addModule(factory.createResidentialModule());

            System.out.println("Ошибка: вместимость не ограничена!");
        } catch (IllegalArgumentException exception) {
            System.out.println(
                    "Ограничение вместимости работает: "
                            + exception.getMessage()
            );
        }
    }

    private void printModules(Station station) {
        var iterator = station.getIterator();

        while (iterator.hasNext()) {
            Module module = iterator.next();

            System.out.println(
                    "ID: " + module.getId()
                            + ", тип: " + module.getType()
                            + ", эффективность: " + module.getEfficiency()
                            + ", состояние: " + module.getState()
            );
        }
    }

    public static void main(String[] args) {
        Test test = new Test();

        test.firstScript();
        test.secondScript();
        test.thirdScript();
        test.fourthScript();
        test.fifthScript();
    }
}
