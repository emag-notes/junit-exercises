package org.study.java.junit.exercises.assertionfixture19_6;

public class Frameworks {

    public static boolean isSupport(ApplicationServer appServer, Database db) {
        
        switch (appServer) {
        case GlassFish:
            return true;
            
        case JBoss:
            return db == Database.DB2 || db == Database.PostgreSQL;
            
        case Tomcat:
            return db == Database.MySQL;
        default:
            return false;
        }
        
    }

}
