package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Enter {

    public static void main(String[] args){

        ExtendedNames name = new ExtendedNames();
        name.setFName("Sebastian");
        name.setLName("Vettel");

        Person person = new Person();
        person.setId(3);
        person.setName(name);


        Configuration configuration = new Configuration().configure().addAnnotatedClass(Person.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(person);

        transaction.commit();


    }
}
