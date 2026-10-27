package Station;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import module.Module;

public class StationIterator implements Iterator<Module> {
    private final List<Module> modules;
    private int current = 0;
    private int end = -1;

    public StationIterator() {
        this.modules = new ArrayList<Module>();

    }

    public StationIterator(List<Module> modules) {
        this.modules = modules;
    }

    @Override
    public boolean hasNext() {
        return current < modules.size();
    }

    @Override
    public Module next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return modules.get(current++);
    }
}
