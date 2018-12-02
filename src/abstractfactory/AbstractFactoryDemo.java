package abstractfactory;

import abstractfactory.factories.AbstractFactory;
import abstractfactory.primitives.Color;
import abstractfactory.primitives.Shape;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("shapefactory");
        AbstractFactory colorFactory= FactoryProducer.getFactory("colorfactory");
        Shape shape1 = factory.getShape("Circle");
        shape1.draw();
        Color red = colorFactory.getColor("red");
        red.fill();
        Shape shape2 = factory.getShape("Square");
        shape2.draw();
        Color blue = colorFactory.getColor("blue");
        blue.fill();
    }
}
