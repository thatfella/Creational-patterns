package abstractfactory.factories;

import abstractfactory.primitives.*;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeName) {
        return null;
    }

    @Override
    public Color getColor(String colorName) {
        if (colorName.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorName.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }
}
