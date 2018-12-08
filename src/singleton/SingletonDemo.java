package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton.instance().setText("text");

        System.out.println(Singleton.instance().getText());
    }
}
