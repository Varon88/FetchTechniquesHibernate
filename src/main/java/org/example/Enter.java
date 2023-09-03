package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Enter {

    public static void main(String[] args){


        Configuration configuration = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Cars.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();


        Transaction transaction = session.beginTransaction();

        Cars car = new Cars();
        car.setId(2);
        car.setName("Mercedes AMG ONE");

        Cars car1 = new Cars();
        car1.setId(3);
        car1.setName("Ferrari 458 Speciale");

        Person person = new Person();
        person.setId(1);
        person.setName("bob");
        person.getCars().add(car);
        person.getCars().add(car1);

        //pass in the person as an object to cars inorder to display person based objects.
        car.setPerson(person);
        car1.setPerson(person);

        session.save(car);
        session.save(car1);
        session.save(person);

        transaction.commit();

        session.close();
    }
}

