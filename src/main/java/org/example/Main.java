package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Создание фабрики сессий
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // Начало транзакции
        Transaction transaction = session.beginTransaction();

        // Создание и сохранение объекта
        Customer customer = new Customer("John Doe", "john@example.com");
        Order order1 = new Order(LocalDate.now(), 100.0, customer);
        Order order2 = new Order(LocalDate.now().plusDays(1), 200.0, customer);

        session.save(customer);
        session.save(order1);
        session.save(order2);

        // Завершение транзакции
        transaction.commit();
        session.close();
        factory.close();

        System.out.println("Customer saved successfully!");
    }

}
