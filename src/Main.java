import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateUtils.hibernateUtils;
import com.models.Entreprise;
import com.models.Profil;

public class Main {

	public static void main(String[] args) {
		
		
		Session s=hibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t=s.beginTransaction();
		List<Profil> Profils=s.createQuery("from Profil").list();
		
		for(Profil e:Profils)
			System.out.println(e+" __ "+e.getPosts().size()+" __ "+e.getDiplomes().size()+"  __  "+e.getQualites().size());
		
		
		t.commit();
		s.close();
	}

}
