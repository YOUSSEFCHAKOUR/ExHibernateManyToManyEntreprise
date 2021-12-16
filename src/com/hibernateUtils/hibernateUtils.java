package com.hibernateUtils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.models.Diplome;
import com.models.Entreprise;
import com.models.Post;
import com.models.Profil;
import com.models.Qualite;
import com.models.Tache;



public class hibernateUtils {

	private static final SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	
	static {
		Configuration config = new Configuration();
		config.configure();
		
		
		config.addAnnotatedClass(Diplome.class);
		config.addAnnotatedClass(Entreprise.class);
		config.addAnnotatedClass(Post.class);
		config.addAnnotatedClass(Profil.class);
		config.addAnnotatedClass(Qualite.class);
		config.addAnnotatedClass(Tache.class);
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}






}
