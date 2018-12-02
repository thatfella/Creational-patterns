package abstractfactory.factories;

import abstractfactory.primitives.Circle;
import abstractfactory.primitives.Color;
import abstractfactory.primitives.Shape;
import abstractfactory.primitives.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String colorName) {
        return null;
    }


//    public Shape getShape(String name) {
//        if (name.equalsIgnoreCase("circle")) {
//            return ;
//        } else if (name.equalsIgnoreCase("square")) {
//            return new Square();
//        }
//    }
}

