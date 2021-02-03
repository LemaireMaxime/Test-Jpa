package TP2;

import javax.persistence.*;

import Domaine.Livre;

public class JPA {



    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu-dc");
        EntityManager em = entityManagerFactory.createEntityManager();


        //Livre l = em.find(Livre.class,1);

        //System.out.println(l.getAuteur());
        //System.out.println(l.getTitre());


        EntityTransaction et = em.getTransaction();
        et.begin();


        //Livre l = new Livre();


        //Livre l = em.find(Livre.class,5);


       // l.setAuteur("Test Auteur");
        //l.setTitre("Du plaisir dans la cuisine");


       // em.persist(l);

       // et.commit();

        TypedQuery<Livre> query1 = em.createQuery("select l from Livre l where l.Titre = 'Germinal'",Livre.class);
        TypedQuery<Livre> query2 = em.createQuery("select l from Livre l where l.Auteur = 'Emile Zola'",Livre.class);


        Livre l1 = query1.getResultList().get(0);
        Livre l2 = query2.getResultList().get(0);


        System.out.println(l2.getTitre());
        System.out.println(l2.getAuteur());

        //Livre l = em.find(Livre.class,6);

        //em.remove(l);

        et.commit();


        //Livre l = em.find(Livre.class, );

        //System.out.println(l.getAuteur());
        //System.out.println(l.getTitre());

        entityManagerFactory.close();
    }
}
