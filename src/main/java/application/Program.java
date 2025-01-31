package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null,"Ícaro","icaro@email");
        Pessoa p2 = new Pessoa(null,"Nico","Nico@email");
        Pessoa p3 = new Pessoa(null,"Manu","Manu@email");

        // Cria a fábrica de EntityManager usando a unidade de persistência "exemplo-jpa" (definida no persistence.xml).
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();// Cria o EntityManager, responsável por gerenciar operações de banco de dados (CRUD) no JPA.

        em.getTransaction().begin();

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        em.getTransaction().commit(); // confimando alterações

        System.out.println("Finish");
    }
}