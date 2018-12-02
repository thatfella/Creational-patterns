package abstractfactory.primitives;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("filled blue");
    }
}
