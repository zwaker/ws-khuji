/**
 * 
 */
package com.iphoneservice.khuji;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

import com.iphoneservice.khuji.bean.SearchJobCriteria;
import com.iphoneservice.khuji.entity.KhujiLocation;

/**
 * @author przaca
 * 
 */

@LocalBean
@Stateless
public class SearchJobManagerService {
	@PersistenceContext(unitName = "mypersistence")
	private EntityManager em;

	public KhujiLocation findJobs(SearchJobCriteria searchCriteria) {
		// em.
		Session session = ((org.hibernate.ejb.EntityManagerImpl) em
				.getDelegate()).getSession();
		String hqlString="Select FROM KhujiJobItem as kji inner join KhujiCompany as kc" +
				"where kji.khujiCompanyId=kc.id" +
				"";
		List<KhujiLocation> itemList = session.createQuery(hqlString).list();

		if (itemList!=null && itemList.size()>0) {
			return itemList.get(0);
		} else {
			KhujiLocation tempLoc=new KhujiLocation();
			tempLoc.setId(-1);
			//tempLoc.setName("No Record");
			return tempLoc;
			
		}

	}

}
