package abstractfactory.factories;

import abstractfactory.primitives.Color;
import abstractfactory.primitives.Shape;

public abstract class AbstractFactory  {
    public abstract Shape getShape(String shapeName);
    public abstract Color getColor(String colorName);
}
