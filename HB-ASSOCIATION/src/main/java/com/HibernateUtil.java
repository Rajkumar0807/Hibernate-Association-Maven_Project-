package com;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sf;
    
	public static SessionFactory getSessionFactory() {	
		if(sf==null) {
			try {
				
			ServiceRegistry sr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata md=new MetadataSources(sr).buildMetadata();
//			Metadata md=mds.getMetadataBuilder().build();
			Configuration cfg=new Configuration();
		
			cfg.configure("hibernate.cfg.xml");
			ServiceRegistry sr= new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();	
			SessionFactory sf=cfg.buildSessionFactory(sr);
			return sf;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError(e);
		}
	}
		
		
		
	}
	public static SessionFactory getSesFactory()
	{
		if(sf==null) 
			sf=buildFactory();
		return sf;
	}

}
