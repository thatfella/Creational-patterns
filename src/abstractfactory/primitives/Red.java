package abstractfactory.primitives;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filled red");
    }
}
