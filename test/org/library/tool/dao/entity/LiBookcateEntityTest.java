package org.library.tool.dao.entity;

import org.hibernate.Metamodel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;

import javax.persistence.metamodel.EntityType;

public class LiBookcateEntityTest {
    @Test
    public void getEntity() {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory ourSessionFactory = configuration.buildSessionFactory();
        Session session = ourSessionFactory.openSession();
        System.out.println("querying all the managed entities...");
        final Metamodel metamodel = session.getSessionFactory().getMetamodel();
        for (EntityType<?> entityType : metamodel.getEntities()) {
            final String entityName = entityType.getName();
            final Query query = session.createQuery("from " + entityName);
            System.out.println("executing: " + query.getQueryString());
            for (Object o : query.list()) {
                System.out.println("  " + o);
            }
        }

    }
}
