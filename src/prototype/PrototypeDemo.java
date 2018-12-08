package prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        StringPrototype stringPrototype1 = new StringPrototype("prototype");
        StringPrototype stringPrototype2 =  stringPrototype1.clone();

        System.out.println(stringPrototype1 == stringPrototype2);
        System.out.println(stringPrototype1.equals(stringPrototype2));
    }
}
