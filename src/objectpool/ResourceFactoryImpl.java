package objectpool;

import java.util.LinkedList;
import java.util.Queue;

public class ResourceFactoryImpl implements ResourcePoolFactory {

    private Queue<Resource> resources = new LinkedList<>();
    @Override
    public Resource get() {
        if (resources.isEmpty()) {
            return new PoolResource(new ResourceImpl());
        } else {
            return resources.poll();
        }
    }

    private class PoolResource implements Resource {
        private final Resource resource;
        public PoolResource(Resource resource) {
            this.resource=resource;
        }

        @Override
        public void print() {
            resource.print();
        }

        @Override
        public void close() {
            resource.close();
        }
    }
}
