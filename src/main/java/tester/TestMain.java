
package tester;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestMain {

    
    public static void main(String[] args) {
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_JPA_MappingExercise-3_jar_1.0-SNAPSHOTPU");

        /*
        
        
        When we run with InheritanceType.SINGLE_TABLE 
        We get all the classes in one table,
        The descriminator is added to determine their origins.
        
        When we run with InheritanceType.JOINED
        We get all the classes as their own table,
        but the superclass has a descriminator to keep track of the subclasses.
        
        
        */
        
        
        
        
    }
    
}
