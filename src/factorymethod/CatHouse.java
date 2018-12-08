package factorymethod;

public class CatHouse extends AnimalHouse {
    @Override
    protected Animal getAnimal() {
        return new Cat();
    }
}
