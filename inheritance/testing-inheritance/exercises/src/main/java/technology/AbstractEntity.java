package technology;

public abstract class AbstractEntity {
    public static int nextId = 1;
    public int id;

    public AbstractEntity() {
        this.id = nextId++;
    }

    public int getId() {
        return nextId++;
    }
}
