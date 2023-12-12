package Less10;

import java.util.Objects;

public class C {

    private String name;
    private String type;

    private  int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c = (C) o;
        return age == c.age && Objects.equals(name, c.name) && Objects.equals(type, c.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, age);
    }

    public C(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;



    }
}
