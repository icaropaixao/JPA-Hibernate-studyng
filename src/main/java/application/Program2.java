package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program2 {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();


        // Buscando DADOS NO BANCO DE DADOS
        Pessoa p = em.find(Pessoa.class, 2); // valor do ID

        System.out.println(p);
        em.close();
        emf.close();

        System.out.println("Programa finalizado");
    }
}
