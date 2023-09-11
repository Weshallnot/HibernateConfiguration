package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started...." );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
       //Creating student
//        Student st=new Student();
//        st.setId(101);
//        st.setCity("kalyan");
//        st.setName("vishal");
//        System.out.println(st);
        Student st1=new Student();
        st1.setCity("Delhi");
        st1.setId(102);
        st1.setName("Kaveri");
        System.out.println(st1);
        Session	session=factory.openSession();
        Transaction tx=session.beginTransaction();
//        session.save(st);
        session.save(st1);
        tx.commit();
        
        
        session.close();
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
    }
}
