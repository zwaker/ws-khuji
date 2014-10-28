/**
 * 
 */
package com.iphoneservice.khuji;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

import com.iphoneservice.khuji.entity.KhujiUser;

/**
 * @author przaca
 * 
 */

@LocalBean
@Stateless
public class RegistrationManagerService {
	@PersistenceContext(unitName = "mypersistence")
	private EntityManager em;

	public String registerUser(KhujiUser user) {
		// em.
		Session session = ((org.hibernate.ejb.EntityManagerImpl) em
				.getDelegate()).getSession();
		if (userExists(user)) {
			return "userexists";
		} else {
			
			em.persist(user);
			return "registrationsuccessful";
		}

	}

	public boolean userExists(KhujiUser user) {

		KhujiUser userFromSource = em.find(KhujiUser.class, user.getUsername());
		if (userFromSource == null) {
			return false;
		}
		return true;
	}

}
