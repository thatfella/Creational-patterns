package abstractfactory;

import abstractfactory.factories.AbstractFactory;
import abstractfactory.factories.ColorFactory;
import abstractfactory.factories.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String name){
        if (name.equalsIgnoreCase("shapefactory")) {
            return new ShapeFactory();
        }
        else if(name.equalsIgnoreCase("colorfactory")) {
            return new ColorFactory();
        }
        return null;
    }
}
