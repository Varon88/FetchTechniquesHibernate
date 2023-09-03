package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Enter {

    public static void main(String[] args){

        Cars car = new Cars();
        car.setId(0);
        car.setName("Merecdes SLS AMG");

        Cars car1 = new Cars();
        car1.setId(1);
        car1.setName("Ferrari 812 SuperFast");

        Person person = new Person();
        person.setId(0);
        person.setName("Varon");
        person.getCars().add(car);
        person.getCars().add(car1);


        Configuration configuration = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Cars.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();


        Transaction transaction = session.beginTransaction();

        session.save(car);
        session.save(car1);
        session.save(person);

        transaction.commit();

        session.close();
    }
}

