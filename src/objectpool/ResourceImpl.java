package objectpool;

public class ResourceImpl implements Resource {
    private final long creationTime;

    public ResourceImpl() {
        this.creationTime = System.nanoTime();
    }

    @Override
    public void print() {
        System.out.println(creationTime);
    }

    @Override
    public void close() {

    }
}
