package com.jpaJPQL.jpaJPQL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "pu" );  
        EntityManager em = emf.createEntityManager();  
  
        
//      ================================================
//      STATIC NAMED QUERY
//      ================================================
        
//        em.getTransaction().begin();  
//        
//        Query query = em.createNamedQuery("Student.READ");  
//        @SuppressWarnings("unchecked")
//		  List<Student> list =query.getResultList(); 
//        
//        System.out.println("Student Details :");  
//        for(Student s:list) {  
//           System.out.println(s.getDept());  
//        }  
//        
//        em.getTransaction().commit();  
//        em.close();  
//        emf.close(); 
        

        
//        ================================================
//        DYNAMIC QUERY
//        ================================================
        
//        em.getTransaction().begin();  
//                  
//        Query query = em.createQuery("Select name from Student");  
//        @SuppressWarnings("unchecked")
//		  List<String> list =query.getResultList(); 
//        
//        System.out.println("Student Name :");  
//        for(String s:list) {  
//           System.out.println(s);  
//        }  
//        
//        em.getTransaction().commit();  
//        em.close();  
//        emf.close();   
        
        
        
//      ================================================
//      DYNAMIC QUERY JPQL READ
//      ================================================   
        
//        em.getTransaction().begin();  
//        
//        Query query = em.createQuery("Select s from Student s");  
//        @SuppressWarnings("unchecked")
//		List<Student> list =query.getResultList(); 
//        
//        System.out.print("S.Id");
//        System.out.print("\tS.Name");
//        System.out.println("\tS.Dept");
//        
//        for(Student s:list) {  
//           System.out.print(s.getId());
//           System.out.print("\t"+ s.getName());
//           System.out.print("\t"+ s.getDept());
//           System.out.println();
//        }  
//        
//        em.getTransaction().commit();  
//        em.close();  
//        emf.close();   
      
        
//      ================================================
//      DYNAMIC QUERY JPQL UPDATE
//      ================================================        
        
//        em.getTransaction().begin();  
//        
//        Query query = em.createQuery("Update Student set dept='CIVIL' where id=3");
//		query.executeUpdate(); 
//        
//        em.getTransaction().commit();  
//        em.close();  
//        emf.close(); 
        
        
        
//      ================================================
//      DYNAMIC QUERY JPQL DELETE
//      ================================================      
        
//        em.getTransaction().begin();  
//        
//        Query query = em.createQuery("Delete from Student where id=3");
//		query.executeUpdate(); 
//        
//        em.getTransaction().commit();  
//        em.close();  
//        emf.close();
   }  

}
