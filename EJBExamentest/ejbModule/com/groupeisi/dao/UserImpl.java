package com.groupeisi.dao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.groupeisi.entities.User;

@Stateless
public class UserImpl extends RepositoryImpl<User> implements IUser {
	
	@PersistenceContext(unitName="ExamenEjb")
	protected EntityManager em;
	

	@Override
	public IUser getConnection(String email, String motdepasse) {
		// TODO Auto-generated method stub
		return (IUser) em.createQuery("SELECT user FROM User user WHERE user.email=:email AND user.motdepasse=:motdepasse")
				.setParameter("email", email)
				.setParameter("motdepasse", motdepasse)
				.getSingleResult();
	}

}

