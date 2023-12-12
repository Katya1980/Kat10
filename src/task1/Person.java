package task1;

import java.util.Objects;

public class Person implements Cloneable{

    private String name;

    private int age;

    private int zar;

    String cat;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", zar=" + zar +
                ", Cat='" + cat + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && zar == person.zar && Objects.equals(name, person.name) && Objects.equals(cat, person.cat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getZar() {
        return zar;
    }

    public void setZar(int zar) {
        this.zar = zar;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(Cat cat) {

        this.cat = cat.toString();
    }

    public Person(String name, int age, int zar, String cat) {
        this.name = name;
        this.age = age;
        this.zar = zar;
        this.cat = cat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, zar, cat);




    }


    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
