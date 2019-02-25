package hibernateonetomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class AccesoBD {
			private static SessionFactory sessionFactory;
			public static void setUp() throws Exception {
			// A SessionFactory is set up once for an application!
			final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.configure() // configures settings from hibernate.cfg.xml
					.build();
			
				sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
			
		}
		public static void insertarMarca(MarcaCoche m)
		{
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			s.save(m);
			s.getTransaction().commit();
			
			
			
			
		}
		public static List<MarcaCoche> listarMarcas(String marca)
		{
			Session s=sessionFactory.openSession();
			Query q=s.createQuery("FROM MarcaCoche WHERE nombre='"+marca+"'");
			List<MarcaCoche>lista=q.list();
			return lista;
			
			
			
			
		}
		
		
}

