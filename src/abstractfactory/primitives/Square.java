package abstractfactory.primitives;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
