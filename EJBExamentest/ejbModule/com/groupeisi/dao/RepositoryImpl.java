package com.groupeisi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.groupeisi.entities.Cv;

public class RepositoryImpl<T> implements Repository<T>{
	@PersistenceContext(unitName="ExamenEjb")
	protected EntityManager em;
	
	public  RepositoryImpl() {
		
	}
	@Override
	public int add(T t) {
		int result=1;
		em.persist(t);
		
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int delete(int id,T t) {
		int result=1;
		
		String table=t.getClass().getSimpleName();
        t=(T) em.createQuery("SELECT t FROM " + table + " t WHERE t.id=:id").setParameter("id", id).getSingleResult();
       
        em.remove(t);
		return result;
	}

	@Override
	public int update(T t) {
		int result=1;
		em.merge(t);
		return result;
	}
	
	
   @SuppressWarnings("unchecked")
@Override
	public List<T> list(T t) {
		String table=t.getClass().getSimpleName();
       return (List<T>) em.createQuery("SELECT t FROM " + table + " t").getResultList();
       
		
	}

    @SuppressWarnings("unchecked")
	@Override
	public T get (int id,T t) {
		String table=t.getClass().getSimpleName();
        t=(T) em.createQuery("SELECT t FROM " + table + " t WHERE t.id=:id").setParameter("id", id).getSingleResult();
        return t;
       
	}
    
    public Cv findUserByUsername(String username) {
        TypedQuery<Cv> query = em.createQuery("SELECT u FROM User u WHERE u.username = :username", Cv.class);
        query.setParameter("username", username);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
	@SuppressWarnings("unchecked")
	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
		  return em.createQuery("SELECT s FROM Cv s order by s.id").getResultList();
	}
	
	
	
   
	
    
}
