package factory;

//10.7
public abstract class SimpleEntityFactory<T> implements EntityFactory<T> {
    private final int nextId = 1;

    protected int getNextId() {
        return nextId+1;
    }
}
