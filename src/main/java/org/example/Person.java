package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {


    private String name;
    @Id
    private int id;

    @OneToMany(mappedBy = "person")
    private List<Cars> Cars = new ArrayList<>();

    public Person() {
    }

    public List<Cars> getCars() {
        return Cars;
    }

    public void setCars(List<Cars> cars) {
        Cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
