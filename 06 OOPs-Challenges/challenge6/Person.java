package kgcoding.challenge6;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String id;

    public Person(String name, int age, String id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, id);
    }
}
