package aplicação;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class program {
    public static void main(String[] args){
        //Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        //Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
        //Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Pessoa p = em.find(Pessoa.class, 3);
        //em.remove(p);
        //em.persist(p1);
        //em.persist(p2);
       // em.persist(p3);
        System.out.println(p);
        em.getTransaction().commit();


        System.out.println("Show!!!");
        em.close();
        emf.close();
    }
}
