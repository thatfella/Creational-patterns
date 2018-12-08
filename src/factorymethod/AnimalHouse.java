package factorymethod;

public abstract class AnimalHouse {

    private final Animal animal;
    protected abstract Animal getAnimal();

    protected AnimalHouse() {
        //some other actions for example add bowl
        //add toys for pet
        animal = getAnimal();
        animal.makeSound();
    }
}
