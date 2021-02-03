package TP1;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-dc");
        entityManagerFactory.close();
    }
}