package singleton;

public class Singleton {
    private static Singleton instance;


    private String text;
    private Singleton(){};

    public static Singleton instance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
