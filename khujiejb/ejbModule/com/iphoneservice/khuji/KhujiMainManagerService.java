/**
 * 
 */
package com.iphoneservice.khuji;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author przaca
 * 
 */

@LocalBean
@Stateless
public class KhujiMainManagerService {
	@PersistenceContext(unitName = "mypersistence")
	private EntityManager em;

	
}
