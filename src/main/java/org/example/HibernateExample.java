package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
    public static void main(String[] args) {
        // Создание фабрики сессий
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // Начало транзакции
        Transaction transaction = session.beginTransaction();

        // Создание и сохранение объекта
        Customer customer = new Customer();
        session.save(customer);

        // Завершение транзакции
        transaction.commit();
        session.close();
        factory.close();

        System.out.println("Customer saved successfully!");
    }

}
