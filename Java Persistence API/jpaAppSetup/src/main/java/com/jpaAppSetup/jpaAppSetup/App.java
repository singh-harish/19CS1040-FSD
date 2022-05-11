package com.jpaAppSetup.jpaAppSetup;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
//      ------------------------------------
//      FIND AN ENTITY
//      ------------------------------------
        
//        Student stud = em.find(Student.class, 2);
//        System.out.println(stud);

//      ------------------------------------
//      PERSIST AN ENTITY
//      ------------------------------------   
        
//        em.getTransaction().begin();
//        
//        Student s1= new Student();
//        s1.setId(4);
//        s1.setName("Shyam");
//        s1.setDept("CE");
//        
//        em.persist(s1);
//        em.getTransaction().commit();
//        
//        em.close();
//        emf.close();

//      ------------------------------------
//      UPDATE AN ENTITY
//      ------------------------------------
       
//        Student stud = em.find(Student.class, 2);
//        
//        System.out.println(stud);
//        stud.setDept("CIVIL");
//        System.out.println(stud);
        
//      ------------------------------------
//      DELETE AN ENTITY
//      ------------------------------------
       
        em.getTransaction().begin();
        Student stud = em.find(Student.class, 2);
        em.remove(stud);
        em.getTransaction().commit();
        
        em.close();
        emf.close();;
    }
}
