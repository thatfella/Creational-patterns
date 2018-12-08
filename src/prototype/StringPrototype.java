package prototype;

import java.util.Objects;

public class StringPrototype implements Prototype {

    private final String name;

    public StringPrototype(String name) {
        this.name=name;
    }

    @Override
    public StringPrototype clone() {
        try {
            return (StringPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringPrototype that = (StringPrototype) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
