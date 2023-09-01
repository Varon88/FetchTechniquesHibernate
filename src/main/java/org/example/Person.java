package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

    private ExtendedNames name;
    @Id
    private int id;

    public ExtendedNames getName() {
        return name;
    }

    public void setName(ExtendedNames name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
